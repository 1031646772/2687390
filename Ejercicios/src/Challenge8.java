import java.util.Scanner;
public class Challenge8{
    static Scanner entrada=new Scanner (System.in);
  public static void main(String[]args)throws Exception {
   int i=1,price,amount,amountp,bolas=(int) (Math.random()*6+1),subtotal=0,discount,value=0,full_value;
   System.out.println("Ingrese la cantidad de productos que va a registrar");
   amount=entrada.nextInt();
   for (i=1;i<=amount;i++){
    System.out.println("ingrese el precio del producto");
    price=entrada.nextInt();
    System.out.println("Ingrese la cantidad de este producto");
    amountp=entrada.nextInt();
    subtotal=price*amountp;
    value=value+subtotal;
   }
if(bolas==1 && value>50000){
    System.out.println("Usted tiene un descuento del 10%");
    discount=(value*10)/100;
    full_value=value-discount;
    System.out.println("Su valor total a pagar con el descuento de la bola roja es:"+full_value);
}
else if(bolas==2 && value>50000){
    System.out.println("Usted tiene un descuento del 30%");
    discount=(value*30)/100;
    full_value=value-discount;
    System.out.println("Su valor total a pagar con el descuento de la bola Azul es:"+full_value);
}
else if(bolas==3 && value>50000){
    System.out.println("Usted tiene un descuento del 50%");
    discount=(value*50)/100;
    full_value=value-discount;
    System.out.println("Su valor total a pagar con el descuento de la bola Amarilla es:"+full_value);
}
else if(bolas==4 && value>50000){
    System.out.println("Usted tiene un descuento total, su compra es gratis");
    discount=(value*100)/100;
    full_value=value-discount;
    System.out.println("Su valor total a pagar con el descuento de la bola blanca es:"+full_value);
}
else{
    System.out.println("Usted no obtiene el descuento. Su valor a pagar es:"+value);
}
  }
}
