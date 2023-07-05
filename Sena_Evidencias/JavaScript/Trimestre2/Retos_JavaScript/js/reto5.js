
function mostrarmodal1(){
    let modal1=document.getElementById('modal_area_c');
    modal1.style.display='block';
}
function mostrarmodal2(){
    let modal2=document.getElementById('modal_per_c');
    modal2.style.display='block';
}
function mostrarmodal3(){
    let modal3=document.getElementById('modal_area_cu');
    modal3.style.display='block';
}
function mostrarmodal4(){
    let modal4=document.getElementById('modal_peri_cu');
    modal4.style.display='block';
}
function mostrarmodal5(){
    let modal5=document.getElementById('modal_area_tri');
    modal5.style.display='block';
}
function mostrarmodal6(){
    let modal6=document.getElementById('modal_per_tri');
    modal6.style.display='block';
}
function mostrarmodal7(){
    let modal7=document.getElementById('modal_area_rec');
    modal7.style.display='block';
}
function mostrarmodal8(){
    let modal8=document.getElementById('modal_per_rec');
    modal8.style.display='block';
}

function cerrar(){
    let modal1=document.getElementById('modal_area_c');
    modal1.style.display='none';
    let modal2=document.getElementById('modal_per_c');
    modal2.style.display='none';
    let modal3=document.getElementById('modal_area_cu');
    modal3.style.display='none';
    let modal4=document.getElementById('modal_peri_cu');
    modal4.style.display='none';
    let modal5=document.getElementById('modal_area_tri');
    modal5.style.display='none';
    let modal6=document.getElementById('modal_per_tri');
    modal6.style.display='none';
    let modal7=document.getElementById('modal_area_rec');
    modal7.style.display='none';
    let modal8=document.getElementById('modal_per_rec');
    modal8.style.display='none';
}


function Areacir(){
    let radio=document.getElementById('radio_c').value;
    let radio2=parseInt(radio);
    area=3.1416*(radio2*radio2);
    alert ("El resultado del area para el circulo es: "+area);
}
function percir(){
    let diametro=document.getElementById('diametro_c').value;
    let diametro2=parseInt(diametro);
    perimetro=3.1416*diametro2;
    alert ("El resultado del perimetro para el circulo es: "+perimetro);
}
function areacua(){
    let lado=document.getElementById('lado_cu').value;
    let lado2=parseInt(lado);
    area=lado2*lado2*lado2*lado2;
    alert("El area del cuadrado es: "+area);
}
function percua(){
    let lado=document.getElementById('lado2_cu').value;
    let lado2=parseInt(lado);
    area=lado2+lado2+lado2+lado2;
    alert("El perimetro del cuadrado es: "+area);
}
function Areatri(){
    let base=document.getElementById('lado_tri').value;
    let altura=document.getElementById('lado2_tri').value;
    let base2=parseInt(base);
    let altura2=parseInt(altura);
    area=(base2*altura2)/2;
    alert("El area del triangulo es: "+area);
}
function Pertri(){
    let lado1=document.getElementById('_lado').value;
    let lado2=document.getElementById('_lado2').value;
    let lado3=document.getElementById('_lado3').value;
    let _lado=parseInt(lado1);
    let _lado2=parseInt(lado2);
    let _lado3=parseInt(lado3);
    perimetro=_lado+_lado2+_lado3;
    alert("El perimetro del triangulo es: "+perimetro);
}

function Arearec(){
    let base=document.getElementById('lado1_rec').value;
    let altura=document.getElementById('lado_rec').value;
    let _base=parseInt(base);
    let _altura=parseInt(altura);
    area=_base*_altura;
    alert("El area del rectangulo es: "+area);
}

function Perirect(){
    let lado1=document.getElementById('_lado_rec').value;
    let lado2=document.getElementById('_lado2_rec').value;
    let lado3=document.getElementById('_lado3_rec').value;
    let lado4=document.getElementById('_lado4_rec').value;
    let _lado=parseInt(lado1);
    let _lado2=parseInt(lado2);
    let _lado3=parseInt(lado3);
    let _lado4=parseInt(lado3);
    perimetro=_lado+_lado2+_lado3+_lado4;
    alert("El perimetro del rectangulo es: "+perimetro);
}