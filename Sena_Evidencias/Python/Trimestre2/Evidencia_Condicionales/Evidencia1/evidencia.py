#DOS NUMEROS
print("Ingrese el primer numero")
numero1=int(input())
print("Ingrese el segundo numero")
numero2=int(input())
if (numero1==numero2):
    print("El resultado de la multiplicacion entre ",numero1," y ",numero2," es ",numero1*numero2)
elif (numero1>numero2):
     print("El resultado de la resta entre ",numero1," y ",numero2," es ",numero1-numero2)
else:
    print("El resultado de la suma entre ",numero1," y ",numero2," es ",numero1+numero2)

#Fabrica computadoras
print("Digite el numero de computadoras que va a comprar")
ncompus=int(input())
if (ncompus<5):
    descuento=int(15000*(10/100))
    total=int(15000-descuento)
    print("El total del producto aplicando un descuento de ",descuento," es ",total)
elif (ncompus>=5 & ncompus<10):
    descuento=int(15000*(20/100))
    total=int(15000-descuento)
    print("El total del producto aplicando un descuento de ",descuento+" es ",total)
elif (ncompus>=10):
    descuento=int(15000*(40/100))
    total=int(15000-descuento)
    print("El total del producto aplicando un descuento de ",descuento," es ",total)

#LLantas
print("Ingrese el numero de llantas que va a comprar")
nllantas=int(input())
if (nllantas<5):
    total=int(300*nllantas)
    print("El total a pagar por el numero de llantas que vas a comprar es:",total)
elif (nllantas<=10 & nllantas>=5):
    total=int(250*nllantas)
    print("El total a pagar por el numero de llantas que vas a comprar es:",total)
elif (nllantas>10):
    total=int(200*nllantas)
    print("El total a pagar por el numero de llantas que vas a comprar es:",total)
#Preguntados
print("¿Colon descubrio america?")
op=input()
if (op=="Si"):
    print("Bien, contestado... Siguiente")
    print("¿La independencia de México fue en el año 1810?")
    op=bool(input())
    if (op=="Si"):
        print("Bien, contestado... Siguiente")
        print("¿The Doors fue un grupo de rock americano?")
        op=bool(input())
        if(op=="Si"):
               print("Ganaste")
        else:
            print("Respondiste incorrectamente")
    else: 
        print("Respondiste incorrectamente")
else:
    print("Respondiste incorrectamente")

#Tres numeros
print("Ingrese el primer numero")
number1=input()
print("Ingrese el segundo numero")
number2=input()
print("Ingrese el tercer numero")
number3=input()
if (number1>number2 and number1>number3):
    print("El numero mayor es",number1)
elif (number2>number1 and number2>number3):
    print("El numero mayor es",number2)
elif (number3>number2 and number3>number1):
    print("El numero mayor es:",number3)
else:
    print("Los numeros son iguales")