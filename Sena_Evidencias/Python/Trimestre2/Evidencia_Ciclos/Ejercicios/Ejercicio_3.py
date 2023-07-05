num=1
while num<=40:
    m1=int(input("digite la nota de la materia 1 en un rango de 1 a 5"))
    m2=int(input("digite la nota de la materia 2 en un rango de 1 a 5"))
    m3=int(input("digite la nota de la materia 3 en un rango de 1 a 5"))
    m4=int(input("digite la nota de la materia 4 en un rango de 1 a 5"))
    m5=int(input("digite la nota de la materia 5 en un rango de 1 a 5")) 
    pro=(m1+m2+m3+m4+m5)*100/5
    if pro<=3:
        print("el estudiante no tiene derecho al examen de nivelacion")
    else:
        print("el estudiante tiene derecho al examen de nivelacion")
