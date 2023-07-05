package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.usuario.usuarioVo;
import model.usuario.usuarioDo;

public class usuario extends HttpServlet{
   usuarioVo a=new usuarioVo();
   usuarioDo b=new usuarioDo();
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String accion=req.getParameter("accion");
       usuario e=new usuario();
        switch (accion) {
            case "consultar":
                e.mostrarUsuario(req, resp);
                break;
        }
    }
   
    private void registrarUsuario(HttpServletRequest req, HttpServletResponse resp) {
        if (req.getParameter("Nombre")!=null) {
            a.setNombre(req.getParameter("Nombre"));
        }
        if(req.getParameter("Apellido")!=null){
            a.setApellido(req.getParameter("Apellido"));
        }
        if(req.getParameter("Usuario")!=null){
            a.setUsuario(req.getParameter("Usuario"));
        }
        if(req.getParameter("Contrasena")!=null){
            a.setContrasena(req.getParameter("Contrasena"));
        }
        if(req.getParameter("Fecha")!=null){
            a.setFecha(req.getParameter("Fecha"));
        }
        try{
             int c=b.RegistrarUsu(a);
            if(c==1){
            req.getRequestDispatcher("Vista/Registro_Exitoso.jsp").forward(req, resp);
            }
            else{
            System.out.println("No funciona");
            }
        }
        catch(Exception e){
            System.out.println("Error en la inserción del registro "+e.getMessage().toString());
        }
    }
    private void mostrarUsuario(HttpServletRequest req, HttpServletResponse resp){
       try{
        List<usuarioVo> array=b.consultarusu();
        req.setAttribute("datos", array);
        req.getRequestDispatcher("Vista/consulta.jsp").forward(req, resp);
        System.out.println("Se mostraron los datos");
       }
       catch(Exception e){
       System.out.println("Error al comunicarse con el modelo"+e.getMessage()+e.toString());
       }
    }
    private void ActualizarUsu(HttpServletRequest req, HttpServletResponse resp){
        if (req.getParameter("nombre")!=null) {
            a.setNombre(req.getParameter("nombre"));
        }
        if (req.getParameter("estado")!=null) {
            a.setEstado(req.getParameter("estado"));
        }
        if(req.getParameter("apellido")!=null){
            a.setApellido(req.getParameter("apellido"));
        }
        if(req.getParameter("usuario")!=null){
            a.setUsuario(req.getParameter("usuario"));
        }
        if(req.getParameter("contrasena")!=null){
            a.setContrasena(req.getParameter("contrasena"));
        }
        if(req.getParameter("fecha")!=null){
            a.setFecha(req.getParameter("fecha"));
        }
        try{
            int c=b.ActualizarUsu(a);
            if(c==1){
            req.getRequestDispatcher("Vista/Registro_Exitoso.jsp").forward(req, resp);
            }
            else{
            System.out.println("No funciona");
            }
        }
        catch(Exception e){
            System.out.println("No se pudo actualizar"+e.getMessage()+e.toString());
        }
    }
    private void validarUsu(HttpServletRequest req, HttpServletResponse resp){
        String usu=req.getParameter("usuario");
        String  contra=req.getParameter("contrasena");
        try{
            Boolean c=b.consultaLogin(contra, usu, true);
            System.out.println(c);
            if(c==true){
                req.getRequestDispatcher("Vista/inicio.jsp").forward(req, resp);
                System.out.println("Se inicio sesión controller");
            }else{
                System.out.println("No se inicio sesión pero entro al try");
            }
        }
        catch (Exception e){
            System.out.println("No se pudo validar usuario controller "+e.getMessage()+e.toString());
        }
    }
    private void EliminarUsu(HttpServletRequest req, HttpServletResponse resp){
        if(req.getParameter("id")!=null){
                int id=Integer.parseInt(req.getParameter("id"));
                a.setId(id);
        }
        try{
            int c=b.ActualizarUsu(a);
            if(c==1){
            req.getRequestDispatcher("Vista/Eliminacion.jsp").forward(req, resp);
            }
            else{
            System.out.println("No funciona");
            }
        }
        catch (Exception e){
            System.out.println("No se pudo eliminar"+e.getMessage()+e.toString());
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String accion=req.getParameter("accion");
        System.out.println(accion);
        usuario e=new usuario();
        switch (accion) {
            case "registrar":
                e.registrarUsuario(req, resp);;
              break;
            case "actualizar":
                e.ActualizarUsu(req, resp);
                break;
            case "validar":
                e.validarUsu(req, resp);
                break;
            case "eliminar":
                e.EliminarUsu(req, resp);
                break;
        }
    }
}
