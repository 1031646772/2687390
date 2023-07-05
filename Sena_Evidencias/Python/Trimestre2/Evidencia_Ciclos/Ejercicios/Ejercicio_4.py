can1=0
can2=0
can3=0
c=1
while c<=2500000:
    v=int(input("digite 1 si desea votar por guillermo,digite 2 si desea votar por jorge y si desea votar  por Alejandro digite 3: "))
    if v==1:
        can1=can1+1
    if v==2:
        can2=can2+1
    if v==3:
        can3=can3+1
    c=c+1

if can1 > can2 and can1 > can3:
    num= can1
    ganador ="guillermo"
elif can2 > can1 and can2 > can3:
    num= can2
    ganador = "jorge"
else:
    num = can3
    ganador = "Alejandro"


print(f"El candidato {ganador} es el ganador con {num} votos de un total de {c} votos.")
