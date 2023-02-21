import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) throws Exception {
        Scanner lectura=new Scanner (System.in);
        double num1, num2, total, total2;
        int operacion;
        System.out.println("Digite la operacion a realizar: 1 suma, 2 resta, 3 multiplicacion, 4 division, 5 potencia, 6 raiz cuadrada");
       operacion=lectura.nextInt();
        System.out.println("Digite los 2 numeros");
        num1=lectura.nextDouble();
        num2=lectura.nextDouble();
        switch (operacion){
            case 1:
            total=num1+num2;
            System.out.println("El resultado de la operacion "+operacion+" entre "+num1+" y "+num2+" es "+total);
            break;
            case 2:
            total=num1-num2;
            System.out.println("El resultado de la operacion "+operacion+" entre "+num1+" y "+num2+" es "+total);
            break;
            case 3:
            total=num1*num2;
            System.out.println("El resultado de la operacion "+operacion+" entre "+num1+" y "+num2+" es "+total);
            break;
            case 4:
            total=num1/num2;
            System.out.println("El resultado de la operacion "+operacion+" entre "+num1+" y "+num2+" es "+total);
            break;
            case 5:
            total=Math.pow (num1,num2);
            System.out.println("El resultado de la operacion de elevar "+num1+"a "+num2+" es "+total);
            break;
            case 6:
            total=Math.pow (num1,0.5);
            total2=Math.pow (num2,0.5);
            System.out.println("El resultado de la operacion de raiz cuadrada para "+num1+" es "+total+" y para "+num2+" es "+total2);
            break;
            default:
            System.out.println("no selecciono entre las opciones reintente");
            
        }
 lectura.close();
}
}
