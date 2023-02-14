import java.util.Scanner;
public class Condicional_multiple {
    public static void main(String[] args) throws Exception{
       int num;
       Scanner lectura=new Scanner (System.in);
       System.out.println("Ingresa un numero");
       num=lectura.nextInt();
       if (num>0){
        System.out.println("El numero "+num+" es positivo");
       }
       else if (num==0){
        System.out.println("El numero "+num+" es neutro");
       }
       else{
        System.out.println("El numero "+num+" es negativo");
       }
    lectura.close();
}
}