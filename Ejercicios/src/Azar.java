import java.util.Scanner;
import java.util.Random;
public class Azar {
    public static void main(String[] args) throws Exception{
       boolean azar,moneda;
       Scanner lectura=new Scanner (System.in);
       Random aleatorio=new Random();
       System.out.println("Elija true para cara o false para cello");
       azar=lectura.nextBoolean();
       moneda=aleatorio.nextBoolean();
       if(moneda==true && azar==true){
        System.out.println("Usted ha ganado al escoger cara");
       }
       else if(moneda==false && azar==false){
        System.out.println("Usted ha ganado al esocger cello");
       }
       else{
        System.out.println("Usted ha perdido");
       }
    lectura.close();
}
}