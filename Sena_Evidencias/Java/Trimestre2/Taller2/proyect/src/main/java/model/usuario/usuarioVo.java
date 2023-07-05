package model.usuario;

public class usuarioVo {
    private int id;
    private String nombre;
    private String apellido;
    private String usuario;
    private String contrasena;
    private String fecha;
    private String estado;

    //Getters

    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getUsuario() {
        return usuario;
    }
    public String getContrasena() {
        return contrasena;
    }
    public String getFecha() {
        return fecha;
    }
    public String getEstado() {
        return estado;
    }
    
    //Setters

    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
   
    //Contructor
     public usuarioVo(){}
     public usuarioVo(int id, String nombre, String apellido, String usuario, String contrasena,
            String fecha, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.fecha = fecha;
        this.estado = estado;
    }
    

}
