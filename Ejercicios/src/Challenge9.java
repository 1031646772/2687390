import java.util.Scanner;
public class Challenge9 {
    static Scanner entrada=new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        int option=1,expensive,global=0,money=0,specificvalue,contador=0; 
      System.out.println("Ingrese el valor global");
        global=entrada.nextInt();
      while(option==1 && global>=100){
        System.out.println("¿Desea ingresar un valor diferente al global para apostar?, 1 si 2 no");
        option=entrada.nextInt();
        if (option==1){
            System.out.println("Ingrese el valor especifico");
            specificvalue=entrada.nextInt();
            System.out.println("inicia el juego, elije 1 cara o 2 sello");
            expensive=entrada.nextInt();
            int  seal=(int) (Math.random()*2+1);
            if (seal==1 && expensive==1 ){
                System.out.println(seal);
                System.out.println("usted ha ganado al escoger cara. felicidades");
                money=specificvalue*2;
                global=global+money;
            }
            else if (seal==2 && expensive==2 ){
                System.out.println(seal);
                System.out.println("usted ha ganado al escoger sello. felicidades");
                money=specificvalue*2;
                global=global+money;
            }
            else{
                System.out.println(seal);
                System.out.println("usted ha perdido, lo siento");
                money=global-specificvalue;
                global=money;
            }
            contador=contador+1;
        }
        else {
            int  seal=(int) (Math.random()*2+1);
            System.out.println("inicia el juego, elije 1 cara o 2 sello");
            expensive=entrada.nextInt();
            if (seal==1 && expensive==1){
                System.out.println(seal);
                System.out.println("usted ha ganado al escoger cara. felicidades");
                money=global*2;
                global=money;
            }
            else if (seal==2 && expensive==2){
                System.out.println(seal);
                System.out.println("usted ha ganado al escoger sello. felicidades");
                money=global*2;
                global=money;
            }
            else{
                System.out.println(seal);
                System.out.println("usted ha perdido, lo siento");
                money=global-global;
                global=money;
            }
            contador=contador+1;
        }
        System.out.println("¿Desea jugar de nuevo?, 1. si 2. no");
        option=entrada.nextInt();
        }
        System.out.println("La cantidad de veces que usted jugo fueron:"+contador+" y el dinero que acumulo fue:"+global);
    }
}
 