import java.util.Scanner;
import java.util.Random;
public class Azar {
    public static void main(String[] args) throws Exception{
       boolean moneda;
       String azar
       Scanner lectura=new Scanner (System.in);
       Random aleatorio=new Random();
       System.out.println("Elija cara o sello");
       azar=lectura.nextLine();
       moneda=aleatorio.nextBoolean();
       if(moneda==true && azar.equals("cara")){
        System.out.println("Usted ha ganado al escoger cara");
       }
       else if(moneda==false && azar.equals("sello")){
        System.out.println("Usted ha ganado al esocger sello");
       }
       else{
        System.out.println("Usted ha perdido");
       }
    lectura.close();
}
}