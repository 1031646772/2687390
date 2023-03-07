package Taller1;
import java.util.Scanner;
public class Challenge4{
    public static void main(String[] args) throws Exception {
        int number= (int) (Math.random() *3+1);
        String rrandom;
        Scanner lectura=new Scanner (System.in);
        System.out.println("Elija entre piedra, papel o tijera");
        rrandom=lectura.nextLine();
        if (rrandom.equals("piedra") && number==1){
            System.out.println("Usted ha empatado piedra contra piedra");
        }
        else if (rrandom.equals("papel") && number==2){
            System.out.println("Usted ha empatado papel contra papel");
        }
        else if (rrandom.equals("tijera") && number==3){
            System.out.println("Usted ha empatado tijera contra tijera");
        }
        if (rrandom.equals("piedra") && number==3){
            System.out.println("Usted ha ganado al escoger piedra contra tijeras");
        }
        else if (rrandom.equals("papel") && number==1){
            System.out.println("Usted ha ganado al escoger papel contra piedra");
        }
        else if (rrandom.equals("tijera") && number==2){
            System.out.println("Usted ha ganado al escoger tijera contra papel");
        } 
        if (rrandom.equals("piedra") && number==2){
            System.out.println("Usted ha perdido al escoger piedra contra papel");
        }
        else if (rrandom.equals("papel") && number==3){
            System.out.println("Usted ha perdido al esocger papel contra tijeras");
        }
        else if (rrandom.equals("tijera") && number==1){
            System.out.println("Usted ha perdido al escoger tijera contra piedra");
        }
 lectura.close();
}}