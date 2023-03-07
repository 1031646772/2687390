package estructuradatos;
import java.util.Scanner;
public class Challenge3 {
    static Scanner entrada=new Scanner (System.in);
    public static void main(String[] args) {
        String [][] matriz= new String [4][4];
        int [][] precio= new int [4][4];
        int i,j=0;
        for (i=0;i<4;i++){
            for (j=0;j<4;j++){
                System.out.println("Digite el nombre del producto");
                matriz [i][j]=entrada.nextLine();
                System.out.println("Digite el precio del producto");
                precio [i][j]=entrada.nextInt();
                entrada.nextLine();
            }
        }
        
        for (int p=0;p<4;p++){
            for(int u=0;u<4;u++){
                System.out.print(matriz[p][u]+" ");
                System.out.print(precio[p][u]+" ");
            }
            System.out.println(" ");
        }
    }}

