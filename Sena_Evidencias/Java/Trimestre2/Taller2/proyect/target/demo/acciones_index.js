const btnAbrirModal=
document.querySelector("#btn-abrir-modal");
const btnCerrarModal=
document.querySelector("#btn-cerrar-modal");
const modal =
document.querySelector("#modal");
const modal2 =
document.querySelector("#modal2");
const Registrar=
document.querySelector("#boton-registro");
const Cerrarregis=
document.querySelector("#cerrar-modal");
const btnAbrirModal2=
document.querySelector("#btn-abrir-modal2");

btnAbrirModal.addEventListener("click",()=>{
    modal.showModal();
})
btnCerrarModal.addEventListener("click",()=>{
    modal.close();
})
Registrar.addEventListener("click",()=>{
    modal2.showModal()
})
Cerrarregis.addEventListener("click",()=>{
    modal2.close()
})
btnAbrirModal2.addEventListener("click",()=>{
    modal.showModal();
})