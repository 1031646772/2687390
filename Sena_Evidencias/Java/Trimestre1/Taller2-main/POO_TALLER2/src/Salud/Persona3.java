package Salud;
import java.util.Scanner;
public class Persona3 {
static Scanner entrada=new Scanner (System.in);
private String tipoDoc;
   private int documento;
   private String nombre;
   private String apellido;
   private double peso;
   private double estatura;
   private int edad;
   private double peso_estatura;
   private double peso_actual;
   private String sexo;
   public  String variableretorno;
   public Persona3(){

   }
   //setters
public void setTipoDoc(String tipoDoc) {
    this.tipoDoc = tipoDoc;
}


public void setDocumento(int documento) {
    this.documento = documento;
}


public void setNombre(String nombre) {
    this.nombre = nombre;
}


public void setApellido(String apellido) {
    this.apellido = apellido;
}


public void setPeso(double peso) {
    this.peso = peso;
}


public void setEstatura(double estatura) {
    this.estatura = estatura;
}


public void setEdad(int edad) {
    this.edad = edad;
}


public void setSexo(String sexo) {
    this.sexo = sexo;
}
//getters
public String getTipoDoc() {
    return tipoDoc;
}
public int getDocumento() {
    return documento;
}
public String getNombre() {
    return nombre;
}
public String getApellido() {
    return apellido;
}
public double getPeso() {
    return peso;
}
public double getEstatura() {
    return estatura;
}
public int getEdad() {
    return edad;
}
public String getSexo() {
    return sexo;
}
public void mostrarPersona(){
    System.out.println("La persona registrada con el nombre "+nombre+" "+apellido+" tiene:");
    System.out.println("Una edad de: "+edad);
    System.out.println("Su tipo de documento es: "+tipoDoc);
    System.out.println("Su numero de documento es: "+documento);
    System.out.println("y su sexo es: "+sexo);
   }
public String calcularlmc (double n, double j){
    peso=n;
    estatura=j;
    peso_estatura=Math.pow (estatura,2);
    peso_actual=peso/peso_estatura;
    if (peso_actual<20.0){
        variableretorno="PESO BAJO";
    }
    else if (peso_actual>=20.0 && peso_actual<=25.0){
        variableretorno="PESO IDEAL";
            }
    else if (peso_actual>25.0){
        variableretorno="SOBREPESO";
    }
    return variableretorno;
   }
   public void mayoredad(){
    if (edad<18){
      System.out.println("Es menor de edad al tener "+edad+" años");
    }
    else if (edad>=18){
        System.out.println("Es mayor de edad al tener "+edad+" años");
    }
   }
}
