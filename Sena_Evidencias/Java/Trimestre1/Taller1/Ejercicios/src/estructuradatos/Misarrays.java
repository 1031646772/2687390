package estructuradatos;
import java.util.Scanner;
public class Misarrays {
public static void main(String[] args) {
    //definir un vector int [] Nombre o tambien int [] vectory=new int [10];
    int [] vector1={5,2,36,1,55,66,3,1,44,5,66,44};
    int [] vectori={30,50,25,85,12,6,32,41,23,63};
    vectori[6]=32;
    //recorrer vector con for
    for (int i=0;i<=vectori.length;i++){
      System.out.print(vectori[i]+" ");
    }
    // rellernar un arreglo de forma dinamica
    Scanner lectura=new Scanner(System.in);
    for (int p=0;p<vector1.length;p++){
      System.out.println("Digite el dato de la pocision"+p);
     vector1 [p]=lectura.nextInt();
    }
    for (int i :vector1) {
      System.out.println(i);
    }
    lectura.close();
}    
}
