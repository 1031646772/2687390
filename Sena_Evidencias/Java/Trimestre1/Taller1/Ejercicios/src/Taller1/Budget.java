package Taller1;
import java.util.Scanner;
public class Budget {
    public static void main(String[] args) throws Exception {
        Scanner lectura=new Scanner (System.in);
        double broad,high,zone,budget;
        System.out.println("Digite el ancho de la zona que desea enchapar:");
        broad=lectura.nextDouble();
        System.out.println("Digite el alto de la zona que desea enchapar:");
        high=lectura.nextDouble();
        zone=broad*high;
        budget=zone*45000;
        System.out.println("El area a cubrir tiene "+broad+" metros"+" X "+high+" metros "+"Un total de "+zone+" metros"+" El presupuesto que debe tener para enchapar es de: "+budget);
        lectura.close();
    }
}
