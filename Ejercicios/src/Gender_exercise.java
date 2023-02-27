import java.util.Scanner;
public class Gender_exercise{
    static Scanner entrada=new Scanner(System.in);
    public static void main(String[]arg)throws Exception {
    String gender;
    int counter=0,i=0,counter2=0;
    for(i=1;i<=10;i++){
        System.out.println("Digite su genero");
        gender=entrada.nextLine();
        if (gender.equals("Masculino")){
         counter=counter+1;
        }
        else if(gender.equals("Femenino")){
            counter2=counter2+1;
        }
        else if(gender.equals("femenino")){
            counter2=counter2+1;
        }
        else if(gender.equals("masculino")){
            counter=counter+1;
        }
    }
    System.out.println("La cantidad de personas mujeres son: "+counter2);
    System.out.println("La cantidad de personas hombres son: "+counter);

}}

