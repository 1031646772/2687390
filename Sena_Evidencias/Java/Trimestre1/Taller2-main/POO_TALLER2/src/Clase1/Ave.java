package Clase1;

public class Ave extends Animal{
    //Atributos propios
    private String envergadura;
    //constructor
    public Ave() {      
    }
    public Ave(String name, int Edad, String envergadura){
    super(envergadura, Edad);// estos los traemos de la clase Animal que es la super
    this.envergadura=envergadura;//y estos son propios
    }
    //Metodos getters y setters
    public String getEnvergadura() {
        return envergadura;
    }
    public void setEnvergadura(String envergadura) {
        this.envergadura=envergadura;
    }
    //metodos propios
    public void mostrarave() {
        System.out.println("El nombre del animal es"+getNombre()+" su edad es"+getEdad()+" la envergadura del ave es "+envergadura);
    }
    
}
