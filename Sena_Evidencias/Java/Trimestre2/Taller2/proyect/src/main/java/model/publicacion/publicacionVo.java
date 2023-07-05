package model.publicacion;

public class publicacionVo {
    private String tema;
    private int id;
    private String fecha_publi;
    private String contenido;
    private String titulo;
    private int user;
   
    //Getters

     public String getTema() {
        return tema;
    }
    public int getId() {
        return id;
    }
    public String getFecha_publi() {
        return fecha_publi;
    }
    public String getContenido() {
        return contenido;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getUser() {
        return user;
    }
    
    
    //Setters

    public void setTema(String tema) {
        this.tema = tema;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setFecha_publi(String fecha_publi) {
        this.fecha_publi = fecha_publi;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setUser(int user) {
        this.user = user;
    }
    
    
    //Contructor
    public  publicacionVo(){}
    public publicacionVo(String tema, int id, String fecha_publi, String contenido, String titulo, int user) {
        this.tema = tema;
        this.id = id;
        this.fecha_publi = fecha_publi;
        this.contenido = contenido;
        this.titulo = titulo;
        this.user = user;
        
    }

    
}
