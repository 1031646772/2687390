package Taller1;
import java.util.Scanner;
public class Coding {
    public static void main(String[] args) throws Exception{
       int age;
       Scanner lectura=new Scanner (System.in);
       System.out.println("Ingresa edad");
       age=lectura.nextInt();
       if (age>=18){
        System.out.println("Bienvenido");
       }
       else{
        System.out.println("Pa la casa");
       }
    lectura.close();
}
}