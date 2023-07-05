package Polimorfismo;
import java.util.Scanner;
public class Cuadrado extends Figura {
    static Scanner entrada=new Scanner(System.in);
    private double lado;
    private double area;
    public double getlado(){
        return lado;
    }
    public void setlado(int lado){
     this.lado=lado;
    }
    
    public double getArea() {
        return area;
    }
    
    public void setArea(double area) {
        this.area = area;
    }
    @Override
    public void calcularArea () {
        System.out.println("Digite el lado del cuadrado");
        this.lado=entrada.nextDouble();
        this.area=lado*lado;
        System.out.println("El area del cuadrado es:"+area);
    }
    
}
