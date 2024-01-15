# Addition de deux et plusieurs colonnes
# Parametres: deux colonnes ou plus
# Retour: une colonne
def add(*colonne) :
    n = len(colonne)
    if n < 2 :
        raise ValueError("add: au moins deux colonnes")
    else :
        return [sum(x) for x in zip(*colonne)]
        