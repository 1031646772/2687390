package interfaz;
import java.util.Scanner;
public class carisellaso implements juego{
    static Scanner entrada=new Scanner (System.in);
    int op1;
    int num;
    String nombre;
    public void iniciar(){
        System.out.println("Ingrese el nombre del jugador");
        nombre=entrada.nextLine();
    }
    public void jugar(){
        num=(int)(Math.random()* 2+1);
        System.out.println("Selecciona 1 para cara y 2 para sello");
        op1=entrada.nextInt();
    }
    public void finalizar(){
        if (op1==1 && num==1){
           System.out.println(" ha ganado al seleccionar cara");
        }
        else if(op1==2 && num==2){
          System.out.println(" ha ganado al seleccionar sello");
        }
        else {
            System.out.println(" ha perdido");
        }
    }
    
    
}
