package Taller1;
import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) throws Exception{
       int number1,number2,total;
       Scanner lectura=new Scanner (System.in);
       System.out.println("Ingresa un numero");
       number1=lectura.nextInt();
       System.out.println("Ingresa otro numero");
       number2=lectura.nextInt();
       if (number1>number2){
        total=number1+number2;
        System.out.println("El total de la suma de "+number1+" y "+number2+" es:"+total);
       }
       else{
        total=number2-number1;
        System.out.println("El total de la resta de "+number2+" y "+number1+" es:"+total);
       }
    lectura.close();
}
}
