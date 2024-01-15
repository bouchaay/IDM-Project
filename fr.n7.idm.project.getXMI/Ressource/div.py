# Diviser une colonne par une autre colonne
# Parametres: deux colonnes
# Retour: une colonne
def div(col1, col2) :
    if 0 in col2 :
        raise ValueError("div: division par zéro")
    else :
        return [x/y for x,y in zip(col1,col2)]