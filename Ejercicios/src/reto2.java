import java.util.Scanner;
public class reto2 {
    public static void main(String[] args) throws Exception {
        int dosis,peso,meses;
        Scanner lectura=new Scanner (System.in);
        System.out.println("Digite el peso del bebe");
        peso=lectura.nextInt(); 
        System.out.println("Digite los meses que tiene el bebe");
        meses=lectura.nextInt();
        dosis=((peso + 10)/(meses * 10))* 8;
        System.out.println("La dosis que requiere el bebe es:"+dosis);

        lectura.close();
}}
