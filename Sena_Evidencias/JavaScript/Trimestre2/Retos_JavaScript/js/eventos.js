
function mostrarText(){
    const text= document.getElementById('text');
    text.style.display="block";
}

function validarUsu() {
    let correo= document.getElementById('correo').value;
    let contra= document.getElementById('contra').value;
    if(contra=="Julian123" && correo=="juliperalta1306@gmail.com"){
        alert("Bienvenido julian");
    }
    else{
        alert("Datos incorrectos impostor");
    }                             
}
const botonMostrar=document.getElementById('mostrar');
const botonOcultar=document.getElementById('ocultar');
const img=document.getElementById('img');
botonMostrar.addEventListener("click",()=>{
    img.style.display='block';
})
botonOcultar.addEventListener("click",()=>{
    img.style.display='none';
})

function mostrarinfo(){
    const text2=document.getElementById('text2');
    text2.style.display='block'    
}
function ocultarinfo(){
    const text2=document.getElementById('text2');
    text2.style.display='none'  
}