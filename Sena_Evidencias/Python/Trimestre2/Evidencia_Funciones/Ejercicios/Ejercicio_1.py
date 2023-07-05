pasajeros = [
    ("Manuel Juárez", 19823451, "Armenia"),
    ("Gloria Galvis", 45789234, "Cali"),
    ("Rosa Ortiz", 45456234, "Medellín"),
    ("Eduardo Carrasquilla", 79844677, "Cali")
]

ciudades = [
    ("Armenia", "Quindío"),
    ("Cali", "Valle"),
    ("Medellín", "Antioquia")
]

while True:
    print("1. Agregar pasajeros")
    print("2. Agregar ciudades")
    print("3. Buscar ciudad destino por la identificación")
    print("4. Cantidad de pasajeros que viajan a una ciudad")
    print("5. Buscar país destino mediante la identificación")
    print("6. Cantidad de pasajeros que viajan a un país")
    print("7. Salir del programa")

    opcion = int(input("Acción a ejecutar: "))

    if opcion == 1:
        nombre = input("Ingrese el nombre del pasajero: ")
        identificacion = int(input("Ingrese la identificación del pasajero: "))
        destino = input("Ingrese el destino del pasajero: ")
        pasajeros.append((nombre, identificacion, destino))
        print("Pasajero agregado con éxito.")

    elif opcion == 2:
        ciudad = input("Ingrese el nombre de la ciudad: ")
        departamento = input("Ingrese el nombre del departamento: ")
        ciudades.append((ciudad, departamento))
        print("Ciudad agregada con éxito.")

    elif opcion == 3:
        identificacion = int(input("Ingrese la identificación del pasajero: "))
        for pasajero in pasajeros:
            if pasajero[1] == identificacion:
                for destino in ciudades:
                    if pasajero[2] == destino[0]:
                        print("El pasajero viaja a:", destino[0])
                        break
                break
        else:
            print("No se encontró ningún pasajero con esa identificación.")

    elif opcion == 4:
        ciudad = input("Ingrese el nombre de la ciudad: ")
        contador = 0
        for pasajero in pasajeros:
            if pasajero[2] == ciudad:
                contador += 1
        print("Cantidad de pasajeros que viajan a", ciudad, ":", contador)

    elif opcion == 5:
        identificacion = int(input("Ingrese la identificación del pasajero: "))
        for pasajero in pasajeros:
            if pasajero[1] == identificacion:
                for destino in ciudades:
                    if pasajero[2] == destino[0]:
                        print("El pasajero viaja a:", destino[1])
                        break
                break
        else:
            print("No se encontró ningún pasajero con esa identificación.")

    elif opcion == 6:
        pais = input("Ingrese el nombre del país: ")
        contador = 0
        for pasajero in pasajeros:
            for destino in ciudades:
                if pasajero[2] == destino[0] and destino[1] == pais:
                    contador += 1
                    break
        print("Cantidad de pasajeros que viajan a", pais, ":", contador)

    elif opcion == 7:
        print("Saliendo del programa...")
        break

    else:
        print("Opción inválida. Por favor, seleccione una opción válida.")



