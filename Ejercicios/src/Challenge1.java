import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        double degreesf, conversion;
        System.out.println("Digite los grados fahrenheit a convertir");
        degreesf=lectura.nextDouble();
        conversion=(degreesf-32)/1.8;
       System.out.println(degreesf+"grados fahrenheit convertidos a celsius dan:"+conversion+"grados celsius");
     lectura.close();
    }
}
