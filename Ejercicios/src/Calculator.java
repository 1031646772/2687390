import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner lectura=new Scanner (System.in);
        double number1, number2, total, total2;
        int operacion;
        System.out.println("Digite la operacion a realizar: 1 suma, 2 resta, 3 multiplicacion, 4 division, 5 potencia, 6 raiz cuadrada");
       operacion=lectura.nextInt();
        System.out.println("Digite los 2 numeros");
        number1=lectura.nextDouble();
        number2=lectura.nextDouble();
        switch (operacion){
            case 1:
            total=number1+number2;
            System.out.println("El resultado de la operacion "+operacion+" entre "+number1+" y "+number2+" es "+total);
            break;
            case 2:
            total=number1-number2;
            System.out.println("El resultado de la operacion "+operacion+" entre "+number1+" y "+number2+" es "+total);
            break;
            case 3:
            total=number1*number2;
            System.out.println("El resultado de la operacion "+operacion+" entre "+number1+" y "+number2+" es "+total);
            break;
            case 4:
            total=number1/number2;
            System.out.println("El resultado de la operacion "+operacion+" entre "+number1+" y "+number2+" es "+total);
            break;
            case 5:
            total=Math.pow (number1,number2);
            System.out.println("El resultado de la operacion de elevar "+number1+"a "+number2+" es "+total);
            break;
            case 6:
            total=Math.pow (number1,0.5);
            total2=Math.pow (number2,0.5);
            System.out.println("El resultado de la operacion de raiz cuadrada para "+number1+" es "+total+" y para "+number2+" es "+total2);
            break;
            default:
            System.out.println("no selecciono entre las opciones reintente");
            
        }
 lectura.close();
}
}
