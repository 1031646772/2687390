a=1
con1=0
con2=0
con3=0
con4=0
while a<=100:
    nota=int(input("digite la calificacion del estudiante "))
    if nota<50:
        con1=con2+1
    elif nota>=50 and nota<70:
        con2=con2+1
    elif nota>=70 and nota<80:
        con3=con3+1
    elif nota>=80:
        con4=con4+1
    print(f"la cantidad de estudiantes que tienen una nota menor a 50 son {con1}, entre 50 y 69 son {con2}, entre 70 79 son {con3} , superior o igual a 80 son {con4}")
    a=a+1
