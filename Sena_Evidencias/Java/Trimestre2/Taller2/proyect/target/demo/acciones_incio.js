const botonHam=document.querySelector("#botonHa");
const Lista=document.querySelector("#lista");
const modal2=document.getElementById("modalpubli");
const mostrar=document.getElementById("modalpubli");


botonHam.addEventListener("click",()=>{
   Lista.showModal();
})

mostrar.addEventListener("click",()=>{
   modal2.showModal();
})