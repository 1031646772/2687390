import java.util.Scanner;
public class reto4{
    public static void main(String[] args) throws Exception {
        int num= (int) (Math.random() *3+1);
        String azar;
        Scanner lectura=new Scanner (System.in);
        System.out.println("Elija entre piedra, papel o tijera");
        azar=lectura.nextLine();
        System.out.println(num);
        if (azar.equals("piedra") && num==1){
            System.out.println("Usted ha empatado piedra contra piedra");
        }
        else if (azar.equals("papel") && num==2){
            System.out.println("Usted ha empatado papel contra papel");
        }
        else if (azar.equals("tijera") && num==3){
            System.out.println("Usted ha empatado tijera contra tijera");
        }
        if (azar.equals("piedra") && num==3){
            System.out.println("Usted ha ganado al escoger piedra contra tijeras");
        }
        else if (azar.equals("papel") && num==1){
            System.out.println("Usted ha ganado al escoger papel contra piedra");
        }
        else if (azar.equals("tijera") && num==2){
            System.out.println("Usted ha ganado al escoger tijera contra papel");
        } 
        if (azar.equals("piedra") && num==2){
            System.out.println("Usted ha perdido al escoger piedra contra papel");
        }
        else if (azar.equals("papel") && num==3){
            System.out.println("Usted ha perdido al esocger papel contra tijeras");
        }
        else if (azar.equals("tijera") && num==1){
            System.out.println("Usted ha perdido al escoger tijera contra piedra");
        }
 lectura.close();
}}