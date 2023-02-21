import java.util.Scanner;
public class Ejercicio_ciclos_contador {
    static Scanner entrada=new Scanner(System.in);
    public static void main(String[]arg)throws Exception {
    String telefonia;
    int precio,cantidad,i,billete=0,contador=0,subtotal,total=0,cambio;
    for(i=1;i<=5;i++){
        System.out.println("Digite el precio del producto");
        precio=entrada.nextInt();
        System.out.println("Digite la cantidad del producto");
        cantidad=entrada.nextInt();
        subtotal=precio*cantidad;
        total=total+subtotal;
        contador=contador+1;
    }
    System.out.println("El valor a pagar por los productos es:"+total);
    System.out.println("Digite el valor con el que paga:");
    billete=entrada.nextInt();
    cambio=billete-total;
    System.out.println("Su cambio es:"+cambio);
    System.out.println("¿Usted cuenta con telefonia movil exito?");
    entrada.nextLine();
    telefonia=entrada.nextLine();
    if (telefonia.equals("si")){
        System.out.println("Usted tiene "+contador+" minutos por la adquisicion de: "+contador+" productos");
    }
    else{
        System.out.println("No pierdas mas minutos,adquiere ya tu telefonia movil exito");
    }

}}
