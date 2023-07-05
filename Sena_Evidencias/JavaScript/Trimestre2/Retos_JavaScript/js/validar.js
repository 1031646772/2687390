//Accder al formulario
let form=document.getElementById('formulario');
//Reglas de validacion
const $number=/^[0-9]{1,15}/
const $name=/^\w+[A-Za-zñÑáÁ]+\S/
//VALIDACION DE CAMPOS VACIOS
form.numeroDoc.addEventListener('input',(e)=>{
    e.preventDefault();
    console.log(e.target.value);
    if($number.test(e.target.value)){
        form.numeroDoc.setAttribute("class","sucess");
        let mensaje=document.getElementById('feedback1');
        mensaje.style.setProperty("visibility","hidden");
        mensaje.textContent="";
        mensaje.style.setProperty("opacity", "0");
    }
    else{
        form.numeroDoc.setAttribute("class","error");
        let mensaje=document.getElementById('feedback1');
        mensaje.textContent="Campos no admitidos animalito que habla";
        mensaje.style.setProperty("visibility","visible");
        mensaje.style.setProperty("opacity", "1");
    }
}) 

form.nombre.addEventListener('input',(e)=>{
    e.preventDefault();
    console.log(e.target.value);
    if($name.test(e.target.value)){
        form.nombre.setAttribute("class","sucess");
        let mensaje=document.getElementById('feedback2');
        mensaje.style.setProperty("visibility","hidden");
        mensaje.textContent="";
        mensaje.style.setProperty("opacity", "0");
    }
    else{
        form.nombre.setAttribute("class","error");
        let mensaje=document.getElementById('feedback2');
        mensaje.textContent="Campo vacio";
        mensaje.style.setProperty("visibility","visible");
        mensaje.style.setProperty("opacity", "1");
    }
}) 

form.apellido.addEventListener('input',(e)=>{
    e.preventDefault();
    console.log(e.target.value);
    if($name.test(e.target.value)){
        form.apellido.setAttribute("class","sucess");
        let mensaje=document.getElementById('feedback3');
        mensaje.style.setProperty("visibility","hidden");
        mensaje.textContent="";
        mensaje.style.setProperty("opacity", "0");
    }
    else{
        form.apellido.setAttribute("class","error");
        let mensaje=document.getElementById('feedback3');
        mensaje.textContent="No se aceptan numeros";
        mensaje.style.setProperty("visibility","visible");
        mensaje.style.setProperty("opacity", "1");
    }
}) 
