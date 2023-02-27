import java.util.Scanner;
public class Cycle {
    static Scanner entrada=new Scanner(System.in);
    public static void main(String[]arg)throws Exception {
        int price,amount,i;
        for (i=1;i<=5;i++){
            System.out.println("Digite el precio del producto");
            price=entrada.nextInt();
            System.out.println("Digite la cantidad del producto");
            amount=entrada.nextInt();
            
            System.out.println("el precio de su prodcuto es:"+price+" y la cantidad es:"+amount); 
        }
            
    }
}