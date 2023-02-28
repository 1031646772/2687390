package estructuradatos;
import java.util.Scanner;
public class Challenge1_arreglos {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        int numnotes;
        double notas=0,promedio;
        System.out.println("Digite la cantidad de notas");
        numnotes=lectura.nextInt();
        double []amountnote=new double [numnotes];
        for (int i=0;i<amountnote.length;i++){
            System.out.println("Digite la nota");
            amountnote [i]=lectura.nextDouble();
            notas=notas+amountnote[i];
        }
        promedio=notas/numnotes;
        lectura.close();
        if ( promedio<3.0){
            System.out.println("Su promedio fue:"+promedio);
            System.out.println("Reprobaste la asignatura");
        }
        else if (promedio<4.0){
            System.out.println("Su promedio fue:"+promedio);
            System.out.println("Pasaste raspando la asignatura");
        }
        else if (promedio>4.0){
            System.out.println("Su promedio fue:"+promedio);
            System.out.println("Aprobaste la materia");
        }
    }
}
