import java.util.Scanner;
public class ciclos {
    static Scanner entrada=new Scanner(System.in);
    public static void main(String[]arg)throws Exception {
        int precio,cantidad,i;
        for (i=1;i<=5;i++){
            System.out.println("Digite el precio del producto");
            precio=entrada.nextInt();
            System.out.println("Digite la cantidad del producto");
            cantidad=entrada.nextInt();
            
            System.out.println("el precio de su prodcuto es:"+precio+" y la cantidad es:"+cantidad); 
        }
            
    }
}