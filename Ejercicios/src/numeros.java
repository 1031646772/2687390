import java.util.Scanner;
public class numeros {
    public static void main(String[] args) throws Exception{
       int num1,num2,total;
       Scanner lectura=new Scanner (System.in);
       System.out.println("Ingresa un numero");
       num1=lectura.nextInt();
       System.out.println("Ingresa otro numero");
       num2=lectura.nextInt();
       if (num1>num2){
        total=num1+num2;
        System.out.println("El total de la suma de "+num1+" y "+num2+" es:"+total);
       }
       else{
        total=num2-num1;
        System.out.println("El total de la resta de "+num2+" y "+num1+" es:"+total);
       }
    lectura.close();
}
}