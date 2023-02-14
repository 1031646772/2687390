import java.util.Scanner;
public class Budget {
    public static void main(String[] args) throws Exception {
        Scanner lectura=new Scanner (System.in);
        double ancho,alto,area,presupuesto;
        System.out.println("Digite el ancho de la zona que desea enchapar:");
        ancho=lectura.nextDouble();
        System.out.println("Digite el alto de la zona que desea enchapar:");
        alto=lectura.nextDouble();
        area=ancho*alto;
        presupuesto=area*45000;
        System.out.println("El area a cubrir tiene "+ancho+" metros"+" X "+alto+" metros "+"Un total de "+area+" metros"+" El presupuesto que debe tener para enchapar es de: "+presupuesto);
        lectura.close();
    }
}
