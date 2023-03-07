package Taller1;
import java.util.Scanner;
public class Challenge2 {
    public static void main(String[] args) throws Exception {
        int dose,weight,months;
        Scanner lectura=new Scanner (System.in);
        System.out.println("Digite el peso del bebe");
        weight=lectura.nextInt(); 
        System.out.println("Digite los meses que tiene el bebe");
        months=lectura.nextInt();
        dose=((weight + 10)/(months * 10))* 8;
        System.out.println("La dosis que requiere el bebe es:"+dose);

        lectura.close();
}}
