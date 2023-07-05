package interfaz;
import java.util.Scanner;
public class Reto5 implements juego {
    static Scanner entrada=new Scanner(System.in);
    int number;
    String nombre, rrandom;
    public void iniciar(){
        System.out.println("Ingrese el nombre del jugador");
        nombre=entrada.nextLine();
    }
    public void jugar(){
    number=(int)(Math.random()*3+1);
    System.out.println("Elija piedra papel o tijera");
    rrandom=entrada.nextLine();
    }
    public void finalizar(){
        if (rrandom.equals("piedra") && number==1){
            System.out.println("El jugador "+nombre+" ha empatado piedra contra piedra");
        }
        else if (rrandom.equals("papel") && number==2){
            System.out.println("El jugador "+nombre+" ha empatado papel contra papel");
        }
        else if (rrandom.equals("tijera") && number==3){
            System.out.println("El jugador "+nombre+" ha empatado tijera contra tijera");
        }
        if (rrandom.equals("piedra") && number==3){
            System.out.println("El jugador "+nombre+" ha ganado al escoger piedra contra tijeras");
        }
        else if (rrandom.equals("papel") && number==1){
            System.out.println("El jugador "+nombre+" ha ganado al escoger papel contra piedra");
        }
        else if (rrandom.equals("tijera") && number==2){
            System.out.println("El jugador "+nombre+" ha ganado al escoger tijera contra papel");
        } 
        if (rrandom.equals("piedra") && number==2){
            System.out.println("El jugador "+nombre+" ha perdido al escoger piedra contra papel");
        }
        else if (rrandom.equals("papel") && number==3){
            System.out.println("El jugador "+nombre+" ha perdido al esocger papel contra tijeras");
        }
        else if (rrandom.equals("tijera") && number==1){
            System.out.println("El jugador "+nombre+" ha perdido al escoger tijera contra piedra");
        }
    }
}
