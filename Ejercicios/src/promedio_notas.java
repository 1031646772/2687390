import java.util.Scanner;
public class promedio_notas {
    public static void main(String[] args) throws Exception{
       double nota1, nota2, nota3, promedio,asistencia;
       Scanner lectura=new Scanner (System.in);
       System.out.println("Ingrese la primera nota");
       nota1=lectura.nextDouble();
       System.out.println("Ingrese la segunda nota");
       nota2=lectura.nextDouble();
       System.out.println("Ingrese la tercera nota");
       nota3=lectura.nextDouble();
       promedio=(nota1+nota2+nota3)/3;
       System.out.println("Ingrese el porcentaje de asistencia del estudiante");
       asistencia=lectura.nextDouble();
       if (promedio>=3.5 && asistencia>=70){
        System.out.println("El estudiante aprobo");
       }
       else{
        System.out.println("El estudiante reprobo");
       }
    lectura.close();
}
}