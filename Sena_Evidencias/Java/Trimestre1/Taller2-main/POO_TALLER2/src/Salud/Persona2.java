package Salud;
import java.util.Scanner;
public class Persona2 {
   static Scanner entrada=new Scanner (System.in);
   String tipoDoc;
   int documento;
   String nombre;
   String apellido;
   double peso;
   double estatura;
   int edad;
   double peso_estatura;
   double peso_actual;
   String variableretorno;
   String sexo;
   public void pedirDatos(){
    System.out.println("Ingrese el nombre de la persona");
    nombre=entrada.nextLine();
    System.out.println("Ingrese el apellido de la persona");
    apellido=entrada.nextLine();
    System.out.println("Ingrese la edad de la persona");
    edad=entrada.nextInt();
    if (edad<=0){
        System.out.println("la edad no puede ser menor o igual a cero por favor digite la edad de nuevo");
        edad=entrada.nextInt();
    }
    entrada.nextLine();
    System.out.println("Ingrese el tipo de documento de la persona");
    tipoDoc=entrada.nextLine();
    if (edad<18 && tipoDoc.equals("cedula")){
        System.out.println("Usted no puede tener cedula ingrese por favor su tipo de documento");
        tipoDoc=entrada.nextLine();
    }
    System.out.println("Ingrese el numero de documento de la persona");
    documento=entrada.nextInt();
    
    
    entrada.nextLine();
    System.out.println("Ingrese el sexo de la persona");
    sexo=entrada.nextLine();
   }
   public void mostrarPersona(){
    System.out.println("La persona registrada con el nombre "+nombre+" "+apellido+" tiene:");
    System.out.println("Una edad de: "+edad);
    System.out.println("Su tipo de documento es: "+tipoDoc);
    System.out.println("Su numero de documento es: "+documento);
    System.out.println("y su sexo es: "+sexo);
   }
   public String calcularlmc (double n, double j){
    peso=n;
    estatura=j;
    peso_estatura=Math.pow (estatura,2);
    peso_actual=peso/peso_estatura;
    if (peso_actual<20.0){
        variableretorno="PESO BAJO";
    }
    else if (peso_actual>=20.0 && peso_actual<=25.0){
        variableretorno="PESO IDEAL";
            }
    else if (peso_actual>25.0){
        variableretorno="SOBREPESO";
    }
    return variableretorno;
   }
   public void mayoredad(){
    if (edad<18){
      System.out.println("Es menor de edad al tener "+edad+" años");
    }
    else if (edad>=18){
        System.out.println("Es mayor de edad al tener "+edad+" años");
    }
   }
}
