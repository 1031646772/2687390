import java.util.Scanner;
public class reto5{
    public static void main(String[] args) throws Exception {
        Scanner lectura=new Scanner (System.in);
        String Nombre, Apellido,completo,letra1,letra2;
        System.out.println("Ingrese su nombre:");
        Nombre=lectura.nextLine();
        System.out.println("Ingrese su apellido:");
        Apellido=lectura.nextLine();
        System.out.println("la longitud de su nombre es: "+Nombre.length());
        System.out.println("la longitud de su apellido es: "+Apellido.length());
        System.out.println("Su nombre en mayusculas es:"+Nombre.toUpperCase());
        System.out.println("Su apellido en minusculas es: "+Apellido.toLowerCase());
        completo=Nombre+" "+Apellido;
        System.out.println("Su nombre completo "+completo);
        System.out.println(Nombre.substring(0, 2)+Apellido);
        lectura.close();
    }
}