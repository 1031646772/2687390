package Taller1;
import java.util.Scanner;
public class Challenge6 {
    public static void main(String []args) throws Exception{
        Scanner lectura=new Scanner(System.in);
        int dice1, dice2, score;
        dice1=(int) (Math.random() *6+1);
        dice2=(int) (Math.random() *6+1);
        score=dice1+dice2;
        
        if (dice1==1 && dice2==1 ){
            System.out.println("El lanzamiento del dado uno cayo en:"+dice1);
            System.out.println("El lanzamiento del dado dos cayo en:"+dice2);
            System.out.println("El puntaje total es:"+score);
            System.out.println("Usted ha ganado al sacar puntaje de par de unos y un puntaje de dos");
        }
        else if(dice1==1 && dice2==2 || dice1==2 && dice2==1){
            System.out.println("El lanzamiento del dado uno cayo en:"+dice1);
            System.out.println("El lanzamiento del dado dos cayo en:"+dice2);
            System.out.println("El puntaje total es:"+score);
            System.out.println("Usted ha ganado al sacar puntaje de tres");
        }
        else if (dice1==5 && dice2==6 || dice1==6 && dice2==5){
            System.out.println("El lanzamiento del dado uno cayo en:"+dice1);
            System.out.println("El lanzamiento del dado dos cayo en:"+dice2);
            System.out.println("El puntaje total es:"+score);
            System.out.println("Usted ha ganado al sacar puntaje de once");
        }
        else if (dice1==5 && dice2==2||dice1==2 && dice2==5|| dice1==6 && dice2==1 ||dice1==1 && dice2==6 || dice1==4 && dice2==3 || dice1==3 && dice2==4){
            System.out.println("El lanzamiento del dado uno cayo en:"+dice1);
            System.out.println("El lanzamiento del dado dos cayo en:"+dice2);
            System.out.println("El puntaje total es:"+score);
            System.out.println("Usted ha ganado al sacar puntaje de siete");
        }
        else if (dice1==6 && dice2==6){
            System.out.println("El lanzamiento del dado uno cayo en:"+dice1);
            System.out.println("El lanzamiento del dado dos cayo en:"+dice2);
            System.out.println("El puntaje total es:"+score);
            System.out.println("Usted ha ganado al sacar puntaje de doce");
        }
        else{
                System.out.println("El lanzamiento del dado uno cayo en:"+dice1);
                System.out.println("El lanzamiento del dado dos cayo en:"+dice2);
                System.out.println("El puntaje total es:"+score);
                System.out.println("Usted ha perdido el juego");
            }
        lectura.close();
    }
}
