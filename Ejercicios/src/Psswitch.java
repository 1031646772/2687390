import java.util.Scanner;
public class Psswitch {
    public static void main(String[] args) throws Exception {
       Scanner lectura=new Scanner (System.in);
       String vowel;
       System.out.println("digite una vocal");
       vowel=lectura.nextLine();
       switch (vowel){
        case "A": 
        System.out.println("Usted eigio la vocal Aa");
        break;
        case "E":
        System.out.println("Usted eigio la vocal Ee");
        break;
        case "I":
        System.out.println("Usted eligio la vocal Ii");
        break;
        case "O":
        System.out.println("Usted eligio la vocal Oo");
        break;
        case "U":
        System.out.println("Usted eligio la vocal Uu");
        break;
        case "a": 
        System.out.println("Usted eigio la vocal Aa");
        break;
        case "e": 
        System.out.println("Usted eigio la vocal Ee");
        break;
        case "i": 
        System.out.println("Usted eigio la vocal Ii");
        break;
        case "o": 
        System.out.println("Usted eigio la vocal Oo");
        break;
        case "u": 
        System.out.println("Usted eigio la vocal Uu");
        break;
        default:
        System.out.println("usted no digito una vocal reintente");
       }
       
        lectura.close();
    }
}