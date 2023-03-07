package Taller1;
import java.util.Scanner;
public class Loginn {
    public static void main(String[] args) throws Exception{
       String user, password;
       Scanner lectura=new Scanner (System.in);
       System.out.println("Ingrese el usario");
       user=lectura.nextLine();
       System.out.println("Ingrese la contraseña");
       password=lectura.nextLine();
       if (user.equals("Julian") && password.equals("Julian536")){
        System.out.println("Bienvenido");
       }
       else if(user.equals("Julian") && password!="Julian536"){
        System.out.println("Parece que olvidaste tus credenciales de acceso");
       }
       else if(user!="Julian536" && password.equals("Julian536")){
        System.out.println("Algo paso con tus datos de acceso");
       }
        else{
            System.out.println("Datos de igreso incorrectos");
        }
    lectura.close();
}
}
