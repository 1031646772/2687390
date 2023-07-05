function triangulo(){
   let lado1=document.getElementById("lado1").value;
   let lado2=document.getElementById("lado2").value;
   let lado3=document.getElementById("lado3").value;
   lado1=parseInt(lado1);
   lado2=parseInt(lado2);
   lado3=parseInt(lado3);
   
   let lado1_alcuadrado= lado1*lado1;
   let lado2_alcuadrado= lado2*lado2;
   let lado3_alcuadrado= lado3*lado3;


   if(lado1==lado2 && lado1==lado3){
    alert("Este triangulo es equilatero");
   }
   else if(lado3_alcuadrado > lado1_alcuadrado+lado2_alcuadrado){
    alert("Es un triangulo obtusangulo")
    }
   else if (lado1!=lado2 && lado1!=lado3 && lado2!=lado3){
   alert("Este triangulo es escaleno");
   }
   else{
    alert("Este triangulo no es ni equilatero, ni obtusangulo, ni escaleno");
   }
}