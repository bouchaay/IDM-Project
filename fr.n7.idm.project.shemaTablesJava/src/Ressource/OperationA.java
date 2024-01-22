package Ressource;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.nio.charset.StandardCharsets;

import ShemaTableElements.*;

public class OperationA {
    private ShemaTableA table;

    public OperationA(ShemaTableA table) {
        this.table = table;
    }

    public ShemaTableA getTable() {
        return table;
    }

    public List<String> getColInNames (int indiceAlgo){
        AlgorithmA algo = table.getCatalogue().getAlgorithms().get(indiceAlgo);
        InputA input = algo.getInput();
        List<String> colInNames = new ArrayList<String>();
        List<ColumnA<?>> colIn = input.getColumns();
        for (ColumnA<?> col : colIn) {
            colInNames.add(col.getName());
        }
        return colInNames;
    }

    public List<List<?>> getColInValues (int indiceAlgo){
        List<List<?>> colInValues = new ArrayList<>();
        List<String> colInNames = getColInNames(indiceAlgo);
        for (String colName : colInNames) {
            ColumnA<?> col = table.getColumnByName(colName);
            if (col != null) {
                colInValues.add(col.getValues());
            }
        }
        return colInValues;
    }

    /*public List<List<?>> columnsToLignes (int indiceAlgo){
        List<List<?>> colInValues = getColInValues(indiceAlgo);
        List<List<?>> lignes = new ArrayList<>();
        int nbCol = colInValues.size();
        int nbLignes = colInValues.get(0).size();
        for (int i = 0; i < nbLignes; i++) {
            List<Object> ligne = new ArrayList<>();
            for (int j = 0; j < nbCol; j++) {
                ligne.add(colInValues.get(j).get(i));
            }
            lignes.add(ligne);
        }
        return lignes;   
    } */

    public String excOperation(int indiceAlgo) {
        List<List<?>> colInValues = getColInValues(indiceAlgo);
        String nameAlg = table.getCatalogue().getAlgorithms().get(indiceAlgo).getName();

        try {
            // Construire l'URL de l'API Python
            String url = "http://localhost:5001/operation";
            URL obj = new URL(url);

            // Créer la connexion
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            // Configurer la requête HTTP POST
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json");
            con.setDoOutput(true);

            // Construire les données JSON à envoyer manuellement
            String jsonInputString = "{\"Colonne\":[";
            for (List<?> col : colInValues) {
                jsonInputString += "[";
                for (Object value : col) {
                    jsonInputString += "\"" + value.toString() + "\",";
                }
                jsonInputString = jsonInputString.substring(0, jsonInputString.length() - 1); // Supprimer la dernière virgule
                jsonInputString += "],";
            }
            if (!colInValues.isEmpty()) {
                jsonInputString = jsonInputString.substring(0, jsonInputString.length() - 1); // Supprimer la dernière virgule
            }
            jsonInputString += "], \"nomAlgorithme\":\"" + nameAlg + "\"}";

            // Envoyer les données
            try (OutputStream outputStream = con.getOutputStream();
                 BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8))) {
                writer.write(jsonInputString);
            }

            // Lire la réponse de l'API Python
            try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                StringBuilder response = new StringBuilder();
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                return response.toString();
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
