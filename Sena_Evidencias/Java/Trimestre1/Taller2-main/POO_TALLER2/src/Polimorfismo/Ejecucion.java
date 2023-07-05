package Polimorfismo;
import java.util.Scanner;
public class Ejecucion {
    static Scanner entrada=new Scanner(System.in);
    public static void main(String[] args) {
        Cuadrado ejeucion1=new Cuadrado();
        Circulo ejecucion2=new Circulo();
        Rectangulo ejecucion3=new Rectangulo();
        Triangulo ejecucion4=new Triangulo();
        int op1,op2=1;
        while (op2==1){
        System.out.println("Elija 1.Area circulo,2.Area cuadrado,3.Area triangulo,4 Area rectangulo");
        op1=entrada.nextInt();
        if(op1==1){
            ejecucion2.calcularArea();
        }
        else if(op1==2){
            ejeucion1.calcularArea();
        }
        else if (op1==3){
            ejecucion4.calcularArea();
        }
        else if (op1==4){
            ejecucion3.calcularArea();
        }
        System.out.println("¿Desea calcular de nuevo el area de alguna figura? 1.si 2.no");
        op2=entrada.nextInt();
        }
    }
    
        
}
