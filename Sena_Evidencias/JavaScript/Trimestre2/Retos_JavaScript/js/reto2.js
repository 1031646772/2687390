function convertir(){
    let grados= document.getElementById("grados").value;
    const conver= document.getElementById("conver1").value;
    const conver2= document.getElementById("conver2").value;
    if(conver=="Celsius" && conver2=="Fahrenheit"){
        grados=parseInt(grados);
        let conversion=(grados * 9/5)+32;
        let cantidad_decimales=2;
        conversion=conversion.toFixed(cantidad_decimales);
        alert("El resultado de la conversion de grados Celsius a fahrenheit es: "+conversion)
    }
    else if(conver=="Celsius" && conver2=="Kelvin"){
        grados=parseInt(grados);
        let conversion=grados+273.15;
        let cantidad_decimales=2;
        conversion=conversion.toFixed(cantidad_decimales);
        alert("El resultado de la conversion de grados Celsius a Kelvin es: "+conversion)
    }
    else if(conver=="Fahrenheit" && conver2=="Celsius"){
        grados=parseInt(grados);
        let conversion=(grados-32)/1.8;
        let cantidad_decimales=2;
        conversion=conversion.toFixed(cantidad_decimales);
        alert("El resultado de la conversion de grados Fahrenheit a Celsius es: "+conversion)
    }
    else if(conver=="Fahrenheit" && conver2=="Kelvin"){
        grados=parseInt(grados);
        let conversion=(grados-32)*5/9+273.15;
        let cantidad_decimales=2;
        conversion=conversion.toFixed(cantidad_decimales);
        alert("El resultado de la conversion de grados Fahrenheit a Kelvin es: "+conversion)
    }
    else if(conver=="Kelvin" && conver2=="Celsius"){
        grados=parseInt(grados);
        let conversion=grados-273.15;
        let cantidad_decimales=2;
        conversion=conversion.toFixed(cantidad_decimales);
        alert("El resultado de la conversion de grados Kelvin a Celsius es: "+conversion)
    }
    else if(conver=="Kelvin" && conver2=="Fahrenheit"){
        grados=parseInt(grados);
        let conversion=(grados-273.15)*9/5+32;
        let cantidad_decimales=2;
        conversion=conversion.toFixed(cantidad_decimales);
        alert("El resultado de la conversion de grados Kelvin a Fahrenheit es: "+conversion)
    }
  
}
