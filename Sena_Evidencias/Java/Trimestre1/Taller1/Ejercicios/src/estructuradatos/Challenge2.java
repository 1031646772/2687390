package estructuradatos;
import java.util.Scanner;
public class Challenge2 {
    static Scanner lectura= new Scanner (System.in);
    static Scanner entrada= new Scanner (System.in);
    public static void main(String[] args) {
        int competitors,menor,pos=0;
        System.out.println("Digite la catidad de competidores");
        competitors=entrada.nextInt();
        String []datescompetence=new String [competitors];
        int [] timecompetence=new int [competitors];
        String  competidor=datescompetence[pos];
        
        for (int p=0;p<datescompetence.length;p++){
            System.out.println("Digite el nombre del competidor");
            datescompetence[p]=lectura.nextLine();
            System.out.println("Digite el tiempo que registro el competidor en segundos");
            timecompetence[p]=entrada.nextInt();
            }
            for (int p=0;p<datescompetence.length;p++){
                System.out.println("El competidor "+datescompetence[p]+" registro un tiempo de:"+timecompetence[p]);   
            }
                menor=timecompetence[0];
                for (int p=0;p<timecompetence.length;p++){
                    if (timecompetence[p]<menor){
                        menor=timecompetence[p];
                            if (timecompetence[p]==menor){
                                pos=p;
                                competidor=datescompetence[pos];
                            } 
                    }
                
                }
                System.out.println("El competidor que menor tiempo hizo fue "+competidor+" que tiene un tiempo de:"+menor);
            }}
        