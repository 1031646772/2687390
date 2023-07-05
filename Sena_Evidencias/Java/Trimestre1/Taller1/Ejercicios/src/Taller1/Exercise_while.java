package Taller1;
import java.util.Scanner;
public class Exercise_while {
    public static void main(String[] args)throws Exception {
        Scanner lectura=new Scanner(System.in);
        int spent,budget=100000, op=1,counter=1;
        
            while (op==1 && counter<=3){
            System.out.println("Ingrese el gasto");
            spent=lectura.nextInt();
            System.out.println("Desea registrar otro gasto 1. si o 2.no");
            op=lectura.nextInt();
            budget=budget-spent;
            System.out.println("El gasto fue:"+spent+" el presupuesto restante es:"+budget);
            counter=counter+1;
            }
            lectura.close();
        }
        
    }
