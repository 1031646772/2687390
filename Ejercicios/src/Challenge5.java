import java.util.Scanner;
public class Challenge5{
    public static void main(String[] args) throws Exception {
        Scanner lectura=new Scanner (System.in);
        String name, lastname,complete;
        System.out.println("Ingrese su nombre:");
        name=lectura.nextLine();
        System.out.println("Ingrese su apellido:");
        lastname=lectura.nextLine();
        System.out.println("la longitud de su nombre es: "+name.length());
        System.out.println("la longitud de su apellido es: "+lastname.length());
        System.out.println("Su nombre en mayusculas es:"+name.toUpperCase());
        System.out.println("Su apellido en minusculas es: "+lastname.toLowerCase());
        complete=name+" "+lastname;
        System.out.println("Su nombre completo "+complete);
        System.out.println(name.substring(0, 2)+lastname);
        lectura.close();
    }
}