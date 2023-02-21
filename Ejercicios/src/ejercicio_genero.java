import java.util.Scanner;
public class ejercicio_genero {
    static Scanner entrada=new Scanner(System.in);
    public static void main(String[]arg)throws Exception {
    String genero;
    int contador=0,i=0,contador2=0;
    for(i=1;i<=10;i++){
        System.out.println("Digite su genero");
        genero=entrada.nextLine();
        if (genero.equals("Masculino")){
         contador=contador+1;
        }
        else if(genero.equals("Femenino")){
            contador2=contador2+1;
        }
        else if(genero.equals("femenino")){
            contador2=contador2+1;
        }
        else if(genero.equals("masculino")){
            contador=contador+1;
        }
    }
    System.out.println("La cantidad de personas mujeres son: "+contador2);
    System.out.println("La cantidad de personas hombres son: "+contador);

}}

