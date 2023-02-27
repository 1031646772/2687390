import java.util.Scanner;
public class Multiple_conditional {
    public static void main(String[] args) throws Exception{
       int number;
       Scanner lectura=new Scanner (System.in);
       System.out.println("Ingresa un numero");
       number=lectura.nextInt();
       if (number>0){
        System.out.println("El numero "+number+" es positivo");
       }
       else if (number==0){
        System.out.println("El numero "+number+" es neutro");
       }
       else{
        System.out.println("El numero "+number+" es negativo");
       }
    lectura.close();
}
}