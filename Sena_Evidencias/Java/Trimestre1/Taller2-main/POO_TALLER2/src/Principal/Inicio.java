package Principal;
import Salud.Persona;
public class Inicio {
    public static void main(String[] args) {
        Persona person=new Persona ();
        person.pedirDatos();
        person.mostrarPersona();
        person.mayoredad();
        person.calcularlmc();
    }
}
