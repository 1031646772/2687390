package Taller1;
import java.util.Scanner;
public class Practical_exercise_matter {
    static Scanner entrada=new Scanner(System.in);
    public static void main(String []args) throws Exception{
        int i=0;
        double note,accumulator=0,average=0;
        for(i=1;i<=4;i++){
        System.out.println("Ingrese la nota del taller");
        note=entrada.nextDouble();
        accumulator=note/4;
        average=average+accumulator;
        }
        if ( average<=2.9){
            System.out.println("Su promedio fue:"+average);
            System.out.println("Reprobaste la asignatura");
        }
        else if (average<=4.0){
            System.out.println("Su promedio fue:"+average);
            System.out.println("Pasaste raspando la asignatura");
        }
        else if (average>4.0){
            System.out.println("Su promedio fue:"+average);
            System.out.println("Aprobaste la materia");
        }
    }
}
