package Polimorfismo;
import java.util.Scanner;
public class Rectangulo extends Figura {
    static Scanner entrada=new Scanner (System.in);
    private double alto;
    private double ancho;
    private double area;
    public double getAlto() {
        return alto;
    }
    public double getAncho() {
        return ancho;
    }
    public double getArea() {
        return area;
    }
    public void setAlto(double alto) {
        this.alto = alto;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public void calcularArea() {
    System.out.println("Digite el alto del rectangulo");
    this.alto=entrada.nextDouble();
    System.out.println("Digite el ancho del rectangulo");
    this.ancho=entrada.nextDouble();
    area=alto*ancho;
    System.out.println("El area del rectangulo es:"+area);
    }
}
