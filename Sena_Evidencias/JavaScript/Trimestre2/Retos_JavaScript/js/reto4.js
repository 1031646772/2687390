
function verificar(){
const nombre=document.getElementById('name').value;
const lastname=document.getElementById('lastname').value;
const actividad=document.getElementById('actividad').value;
    if(nombre=="Lorena" && lastname=="Medina" && actividad=="Comunicacion"   || nombre=="Paula" && lastname=="Romero" && actividad=="Emprendimiento"||nombre=="Margarita" && lastname=="Guiarin" && actividad=="Prototipado" || nombre=="Jennifer" && lastname=="Fajardo" && actividad=="Diseño" || nombre=="Jonathan" && lastname=="Espitia" && actividad=="Sql" || nombre=="Uldarico" && lastname=="Andrade" && actividad=="python" || nombre=="Tatiana" && lastname=="Cabrera" && actividad=="Java"){
        alert("Respuesta correcta");
    }
    else{
        alert("Respuesta incorrecta");
    }
}