
function palabras() {
const opcion = document.getElementById('op').value;
const palabra = document.getElementById('palabra').value;
    switch (opcion) {
        case "La longitud de la palabra":
            result = palabra.length;
            alert("La logitud de la palabra es: " + result);
            break;
        case "La palabra convertida en mayúsculas":
            result = palabra.toUpperCase();
            alert("La palabra convertida en mayusculas es: " + result);
            break;
        case "La palabra convertida en minúsculas":
            result = palabra.toLowerCase();
            alert("La palabra convertida en minusculas es: " + result);
            break;
        case "El primer carácter de la palabra":
            result = palabra[0];
            alert("El primer caracter de la palabra es: " + result);
            break;
    }
}