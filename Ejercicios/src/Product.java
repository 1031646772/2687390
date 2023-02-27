import java.util.Scanner;
public class Product {
public static void main(String[] args) throws Exception{
        Scanner lectura=new Scanner(System.in);
        int amountp,totalpayment,money,change;
        System.out.println("Digite la cantidad de productos que desea comprar");
        amountp=lectura.nextInt();
        totalpayment=amountp*10000;
        System.out.println("El total a pagar por "+amountp+" productos es:"+totalpayment);
        System.out.println("Digite el valor con el que cancela:");
        money=lectura.nextInt();
        change=money-totalpayment;
        System.out.println("Tu cambio por la compra de "+amountp+" productos"+" y un valor total de "+totalpayment+" es:"+change);
     lectura.close();
    }
}

