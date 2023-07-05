package Clase1;
import java.util.Scanner;
public class Prueba {
    static Scanner entrada=new Scanner (System.in);
    public static void main(String[] args) {
        Animal guacamayo=new Animal ();
        Movie titanic=new Movie ();
        Movie up=new Movie("up", "Familiar");
        Movie la_noche_del_demonio=new Movie("La noche del demonio", "Terror");
        //Aqui usamos el constructor para darle valores a un objeto que acabamos de definir, al usar el constructor llamado animal
        Animal panda=new Animal("Bambu", 10);
        //usando setters aqui usamos los metodos para escribir el valor desde otra clase al atributo privado edad por ejemplo
        guacamayo.setnombre("Pepe");;
        guacamayo.setEdad(12);
        guacamayo.mostrarAnimal();
        //usamos los getters para mostrar valores
        System.out.println("El nombre del guacamayo es:"+guacamayo.getNombre());
        //cosas x de los metodos
        System.out.println("Ingrese el nombre del animal");
        String nombre=entrada.nextLine();
        System.out.println("Ingrese la edad del animal");
        int edad=entrada.nextInt();
        guacamayo.registrarAnimal(nombre, edad);//invocar o llamar un metodo
        guacamayo.mostrarAnimal();
        int duplicado=guacamayo.duplicarEdad(edad);
        System.out.println("La edad duplicada del animal es:"+duplicado);
        // usamos metodo mostrar animal para mostrar los atributos del objeto panda
        panda.mostrarAnimal();
        Movie antman=new Movie();
        antman.Mostrarmovie("terror");
        antman.Mostrarmovie(17);
        
    }
}
