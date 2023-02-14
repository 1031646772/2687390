import java.util.Scanner;
public class Product {
public static void main(String[] args) throws Exception{
        Scanner lectura=new Scanner(System.in);
        int cantidadP, TotalPago,pesos,cambio;
        System.out.println("Digite la cantidad de productos que desea comprar");
        cantidadP=lectura.nextInt();
        TotalPago=cantidadP*10000;
        System.out.println("El total a pagar por "+cantidadP+" productos es:"+TotalPago);
        System.out.println("Digite el valor con el que cancela:");
        pesos=lectura.nextInt();
        cambio=pesos-TotalPago;
        System.out.println("Tu cambio por la compra de "+cantidadP+" productos"+" y un valor total de "+TotalPago+" es:"+cambio);
     lectura.close();
    }
}

