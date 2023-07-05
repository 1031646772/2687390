def convertir_notas(diccionario_notas):
    diccionario_convertido = {}

    for asignatura, nota in diccionario_notas.items():
        asignatura_mayusculas = asignatura.upper()
        if nota >= 90:
            calificacion = "A"
        elif nota >= 80:
            calificacion = "B"
        elif nota >= 70:
            calificacion = "C"
        elif nota >= 60:
            calificacion = "D"
        else:
            calificacion = "F"

        diccionario_convertido[asignatura_mayusculas] = calificacion

    return diccionario_convertido

