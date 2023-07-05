package Clase1;
import java.time.Duration;

public class Movie {
    private String name;
    private String Category;
    private int duration;
    private int year;
    public Movie () {}
    public Movie (String name, String Category) {
    this.name=name;
    this.Category=Category;
    }
    public void Mostrarmovie(String Category) {
        System.out.println("La categoria de la pelicula es:"+Category);
    }
    public void Mostrarmovie() {
        System.out.println("La pelicula es "+name+" y su categoria es:"+Category);
    }
    public void Mostrarmovie(int duracion) {
        System.out.println("La duracion de la pelicula es:"+duration);
    }
    public void setNombre(String name) {
        this.name=name;
    }
    public void setCategory(String category) {
        this.name=category;
    }
    public void setDuration(int duration) {
        this.duration=duration;
    }
    public void setYear(int year) {
        this.year=year;
    }
    public String getname(){
        return name;
    }
    public int getYear(){
        return year;
    }
    public String getCategory(){
        return Category;
    }
    public int getDuration(){
        return duration;
    }
    public static void main(String[] args) {
        
    }
    
}
