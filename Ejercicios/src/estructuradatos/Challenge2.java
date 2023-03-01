package estructuradatos;
import java.util.Scanner;
public class Challenge2 {
    static Scanner lectura= new Scanner (System.in);
    static Scanner entrada= new Scanner (System.in);
    public static void main(String[] args) {
        int competitors,mayor;
        System.out.println("Digite la catidad de competidores");
        competitors=entrada.nextInt();
        String []datescompetence=new String [competitors];
        int [] timecompetence=new int [competitors];
        
        for (int p=0;p<datescompetence.length;p++){
            System.out.println("Digite el nombre del competidor");
            datescompetence[p]=lectura.nextLine();
            System.out.println("Digite el tiempo que registro el competidor en segundos");
            timecompetence[p]=entrada.nextInt();
            for (String i: datescompetence) {
                for (int j : timecompetence) {
                System.out.print("El competidor "+i+" registro un tiempo de:");
                 System.out.println(j);
                 break;
                }
                }
            }
            mayor=timecompetence[0];
            for (int p=0;p<datescompetence.length;p++){
            if (timecompetence[p]>mayor){
                mayor=timecompetence[p];
                for( int u=0;u<timecompetence.length;u++){
                    if (timecompetence[u]==mayor){
                        int pos=u;
                        String conversion=String.valueOf(mayor);
                        String competidor=datescompetence[pos];
                        System.out.println(competidor);
                        System.out.println("El competidor que mas tiempo hizo fue "+competidor+"que tiene un tiempo de:"+conversion);
                    } 
                    break;
                 }   
            }
        
        }
    }}
        