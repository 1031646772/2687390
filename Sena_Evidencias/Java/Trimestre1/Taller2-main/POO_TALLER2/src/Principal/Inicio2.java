package Principal;
import Salud.Persona2;
import java.util.Scanner;
public class Inicio2 {
    static Scanner entrada=new Scanner (System.in);
    public static void main(String[] args) {
        Persona2 person=new Persona2 ();
        person.pedirDatos();
        person.mostrarPersona();
        person.mayoredad();
        System.out.println("Ingrese el peso de la persona en kilogramos");
        double peso=entrada.nextDouble();
        System.out.println("Ingrese la estatura de la persona en metros");
        double estatura=entrada.nextDouble();
        person.calcularlmc(peso,estatura);
        String variableretorno=person.calcularlmc(peso, estatura);
        if (variableretorno.equals("PESO BAJO")){
            System.out.println("Su peso esta muy bajo");
        }
        else if (variableretorno.equals("PESO IDEAL")){
            System.out.println("Su peso esta ideal");
        }
        else if (variableretorno.equals("SOBREPESO")){
            System.out.println("Usted esta en ¡SOBREPESO! cuidese");
        }
    }
}
