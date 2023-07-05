package Salud;
import Salud.Empleado;
public class prueba {
    public static void main(String[] args) {
        Empleado empleado=new Empleado();
        empleado.setNombre("Alejandro");
        empleado.setApellido("Perez");
        empleado.setTipoDoc("Tarjeta identidad");
        empleado.setDocumento(1031646772);
        empleado.setCargo("Cajero");
        double valortotal=empleado.calcularhorarios(3000, 12);
        System.out.println("El nombre del empleado es "+empleado.getNombre()+" "+empleado.getApellido()+" su tipo de documento es "+empleado.getTipoDoc()+" su numero de documento es "+empleado.getDocumento()+" su cargo es "+empleado.getCargo()+" las horas trabajadas son "+empleado.getHorastrabajadas()+" el valor por hora "+empleado.getValorhora()+" y su valor total es:"+valortotal);
    }
}
