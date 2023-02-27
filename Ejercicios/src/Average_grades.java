import java.util.Scanner;
public class Average_grades {
    public static void main(String[] args) throws Exception{
       double note1, note2, note3, average,attendance;
       Scanner lectura=new Scanner (System.in);
       System.out.println("Ingrese la primera nota");
       note1=lectura.nextDouble();
       System.out.println("Ingrese la segunda nota");
       note2=lectura.nextDouble();
       System.out.println("Ingrese la tercera nota");
       note3=lectura.nextDouble();
       average=(note1+note2+note3)/3;
       System.out.println("Ingrese el porcentaje de asistencia del estudiante");
       attendance=lectura.nextDouble();
       if (average>=3.5 && attendance>=70){
        System.out.println("Su promedio de notas fue "+average+" y su asistencia fue de "+attendance+"%"+" usted aprobo");
       }
       else{
        System.out.println("Su promedio de notas fue "+average+" y su asistencia fue de "+attendance+"%"+" usted no logro aprobar");
       }
    lectura.close();
}
}