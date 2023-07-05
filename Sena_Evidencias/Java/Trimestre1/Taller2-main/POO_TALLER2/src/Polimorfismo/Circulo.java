package Polimorfismo;
import java.util.Scanner;
public class Circulo extends Figura {
    static Scanner entrada=new Scanner (System.in);
    private double radio;
    private double area;
    public double getRadio(){
        return radio;
    }
    public double getArea() {
        return area;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public void calcularArea(){
    System.out.println("Ingrese el radio del circulo");
    radio=entrada.nextDouble();
    radio=Math.pow(radio,2);
    area=3.1416*radio;
    System.out.println("El area del circulo es:"+area);
    }
}
