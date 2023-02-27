import java.util.Scanner;
import java.util.Random;
public class Challenge3 {
    public static void main(String[] args) throws Exception{
       boolean currency;
       String rrandom;
       Scanner lectura=new Scanner (System.in);
       Random aleatorio=new Random();
       System.out.println("Elija cara o sello");
       rrandom=lectura.nextLine();
       currency=aleatorio.nextBoolean();
       if(currency==true && rrandom.equals("cara")){
        System.out.println("Usted ha ganado al escoger cara");
       }
       else if(currency==false && rrandom.equals("sello")){
        System.out.println("Usted ha ganado al esocger sello");
       }
       else{
        System.out.println("Usted ha perdido");
       }
    lectura.close();
}
}