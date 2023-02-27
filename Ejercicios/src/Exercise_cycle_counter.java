import java.util.Scanner;
public class Exercise_cycle_counter {
    static Scanner entrada=new Scanner(System.in);
    public static void main(String[]arg)throws Exception {
    String telephony;
    int price,amount,i,ticket=0,counter=0,subtotal,total=0,change;
    for(i=1;i<=5;i++){
        System.out.println("Digite el precio del producto");
        price=entrada.nextInt();
        System.out.println("Digite la cantidad del producto");
        amount=entrada.nextInt();
        subtotal=price*amount;
        total=total+subtotal;
        counter=counter+1;
    }
    System.out.println("El valor a pagar por los productos es:"+total);
    System.out.println("Digite el valor con el que paga:");
    ticket=entrada.nextInt();
    change=ticket-total;
    System.out.println("Su cambio es:"+change);
    System.out.println("¿Usted cuenta con telefonia movil exito?");
    entrada.nextLine();
    telephony=entrada.nextLine();
    if (telephony.equals("si")){
        System.out.println("Usted tiene "+counter+" minutos por la adquisicion de: "+counter+" productos");
    }
    else{
        System.out.println("No pierdas mas minutos,adquiere ya tu telefonia movil exito");
    }

}}
