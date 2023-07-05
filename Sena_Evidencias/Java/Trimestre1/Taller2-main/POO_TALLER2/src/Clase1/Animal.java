package Clase1;
import java.util.Scanner;
public class Animal{
    static Scanner entrada=new Scanner (System.in);
    //atributos por defecto
    String nombre;
    //atributos publicos
    public int edad;
    //atributos privados
    private int eda;
    private String tipo;
    //constructor vacio es el que llamamos por defecto se crea por que los objetos que utilizan uno por defecto no generen conflictos
    public Animal(){

    }
    //metodo constructor: este no lleva void, se usa this para referirnos al atributo nombre debido a que en el parametro se llama igual
    public  Animal(String nombre, int edad){
    this.nombre=nombre;
    this.edad=edad;
    }//sobre carga de metodos tener en cuenta las condiciones de una sobrecarga
    public Animal (String nombre,String tipo){
    this.nombre=nombre;
    this.tipo=tipo;
    }
    //regla de los constructores se define uno vacio y otro con la definicion de atributos
    //definir metodos
    public void registrarAnimal(String n, int e){
        //cuerpo
        nombre=n;
        edad=e;
    }
    //metodos accesores como getters y setters que se utilizan para darle valores a atributos privados aunque tambien sirven para los publicos
    //el get es para mostrar y el set para escribir. El ejemplo mas claro en la clase prueba y en la linea 34
    // en este ejemplo le daremos valor al atributo eda que esta privado
    public int getEdad(){
      return eda;
    }
    // en este ejemplo le daremos valor al atributo nombre que esta publico
    public String getNombre(){
        return nombre;
      }
    //ahora metodos setters que no retornan (void) y este toma el nuevo valor del atributo y lo asigna
    public void setEdad(int edad) {
        this.edad=edad;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
        }

    //metodos sobrecarga
    public void mostrarAnimal (){
       System.out.println("El nombre de animal es:"+nombre+" y tiene "+edad+" años");
       
    }
    public int duplicarEdad(int Edad){
        int duplicado=edad*2;
        return duplicado;
    }
    public static void main(String []args) {
        Animal tigre=new Animal ();
        
    }
}