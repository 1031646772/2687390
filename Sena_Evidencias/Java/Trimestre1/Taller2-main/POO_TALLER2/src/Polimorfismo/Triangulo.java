package Polimorfismo;
import java.util.Scanner;
public class Triangulo extends Figura {
    static Scanner entrada=new Scanner(System.in);
    private double base;
    private double altura;
    private double area;
    
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    public double getArea(){
        return area;
    }
    public void setArea(double area){
        this.area=area;
    }
    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void calcularArea(){
    System.out.println("Ingrese la base del triangulo");
    this.base=entrada.nextDouble();
    System.out.println("Ingrese la altura del triangulo");
    this.altura=entrada.nextDouble();
    this.area=(base*altura)/2;
    System.out.println("El area del triangulo es:"+area);
    }
}
