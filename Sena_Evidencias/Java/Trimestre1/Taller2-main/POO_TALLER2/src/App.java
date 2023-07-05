import Clase1.Movie;
import Clase1.Ave;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Movie minions=new Movie();
        Movie avatar=new Movie();
        avatar.setCategory("accion, familia");
        avatar.setDuration(60);
        avatar.setYear(2015);
        avatar.setNombre("Avatar");
        System.out.println("El nombre de la pelicula es:"+avatar.getname());
        System.out.println("La categoria es:"+avatar.getCategory());
        System.out.println("La duracion de la pelicula es:"+avatar.getDuration());
        System.out.println("El año de la pelicula es:"+avatar.getYear());
        Ave condorito=new Ave();
        condorito.setnombre("Condorito");
        condorito.setEdad(50);
        condorito.setEnvergadura("300cm");
        condorito.mostrarAnimal();
        condorito.mostrarave();
    }
}
//el attributo category solo lo ve la clase movie
//el atributo year solo lo ven los que comparten el mismo paquete como animal y prueba
//el atributo duration lo ven todas la clases ya que es publica, teniendo en cuenta que se importe
