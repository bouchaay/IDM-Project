# Soustraire la première colonne de la deuxième colonne
# Parametres: deux colonnes
# Retour: une colonne
def sub(col1, col2) :
    return [x-y for x,y in zip(col1,col2)]