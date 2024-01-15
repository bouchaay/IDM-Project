# Retourner la colonne des minimum de chaque ligne des colonnes
# parametres : colonnes
# retour : colonne
import math
def minCol(*colonne) :
    n = len(colonne)
    if n < 2 :
        raise ValueError("min: au moins deux colonnes")
    else :
        return [min(x) for x in zip(*colonne)]