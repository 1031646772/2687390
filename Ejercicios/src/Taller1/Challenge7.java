package Taller1;
import java.util.Scanner;
public class Challenge7 {
    public static void main(String[] args)throws Exception {
        Scanner lectura=new Scanner(System.in);
        int ball=(int) (Math.random()*4+1),value,discount,fullvalue;
        System.out.println("Digite el valor de su compra");
        value=lectura.nextInt();
        if(ball==1 && value>50000){
            System.out.println("Usted tiene un descuento del 10%");
            discount=(value*10)/100;
            fullvalue=value-discount;
            System.out.println("Su valor total a pagar con el descuento de la bola roja es:"+fullvalue);
        }
        else if(ball==2 && value>50000){
            System.out.println("Usted tiene un descuento del 30%");
            discount=(value*30)/100;
            fullvalue=value-discount;
            System.out.println("Su valor total a pagar con el descuento de la bola Azul es:"+fullvalue);
        }
        else if(ball==3 && value>50000){
            System.out.println("Usted tiene un descuento del 50%");
            discount=(value*50)/100;
            fullvalue=value-discount;
            System.out.println("Su valor total a pagar con el descuento de la bola Amarilla es:"+fullvalue);
        }
        else if(ball==4 && value>50000){
            System.out.println("Usted tiene un descuento total, su compra es gratis");
            discount=(value*100)/100;
            fullvalue=value-discount;
            System.out.println("Su valor total a pagar con el descuento de la bola blanca es:"+fullvalue);
        }
        else{
            System.out.println("Usted no obtiene el descuento. Su valor a pagar es:"+value);
        }
        lectura.close();
    }
}
