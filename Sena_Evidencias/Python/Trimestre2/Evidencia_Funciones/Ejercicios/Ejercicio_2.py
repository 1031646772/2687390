import random

def jugar_piedra_papel_tijera(jugador, computadora):
    if jugador == computadora:
        return "¡Es un empate!"
    elif (jugador == "piedra" and computadora == "tijera") or (jugador == "papel" and computadora == "piedra") or (jugador == "tijera" and computadora == "papel"):
        return "¡Ganaste!"
    else:
        return "¡Perdiste!"

opciones = ["piedra", "papel", "tijera"]

while True:
    print("¡Juguemos a piedra, papel o tijera!")
    print("Opciones:")
    print("1. Piedra")
    print("2. Papel")
    print("3. Tijera")
    print("4. Salir")

    eleccion_jugador = int(input("Elige una opción (1-4): "))

    if eleccion_jugador == 4:
        print("¡Gracias por jugar!")
        break

    if eleccion_jugador < 1 or eleccion_jugador > 3:
        print("Opción inválida. Por favor, elige una opción válida.")
        continue

    jugador = opciones[eleccion_jugador - 1]
    computadora = random.choice(opciones)

    print("Jugador: " + jugador)
    print("Computadora: " + computadora)

    resultado = jugar_piedra_papel_tijera(jugador, computadora)
    print(resultado)
    print()
