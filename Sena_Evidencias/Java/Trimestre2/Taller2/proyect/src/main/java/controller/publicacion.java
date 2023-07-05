package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.publicacion.publicacionVo;
import model.publicacion.publicacionDo;

public class publicacion extends HttpServlet{
   publicacionVo a=new publicacionVo();
   publicacionDo b=new publicacionDo();
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String accion=req.getParameter("accion");
       publicacion e=new publicacion();
        switch (accion) {
            case "crear":
              e.crearPubli(req, resp);
              break;
            case "eliminar":
              e.EliminarPubli(req,resp);
               break;
            case "actualizar":
             e.EditarPubli(req,resp);
              break;
            case "consultar":
             e.mostrarPubli(req, resp);
              break;
        }
    }
   
    private void crearPubli(HttpServletRequest req, HttpServletResponse resp) {
        if (req.getParameter("tema")!=null) {
            a.setTema(req.getParameter("tema"));
        }
        if(req.getParameter("fecha")!=null){
            a.setFecha_publi(req.getParameter("fecha"));
        }
        if(req.getParameter("contenido")!=null){
            a.setContenido(req.getParameter("contenido"));
        }
        if(req.getParameter("titulo")!=null){
            a.setTitulo(req.getParameter("titulo"));
        }
        if(req.getParameter("id")!=null){
            int id=Integer.parseInt(req.getParameter("id"));
            a.setId(id);
        }
        try{
             int c=b.CrearPubli(a);
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
    private void mostrarPubli(HttpServletRequest req, HttpServletResponse resp){
       try{
        List<publicacionVo> array=b.Verpubli();
        req.setAttribute("datos", array);
       }
       catch(Exception e){
       System.out.println("Error al comunicarse con el modelo"+e.getMessage()+e.toString());
       }
    }
    private void EditarPubli(HttpServletRequest req, HttpServletResponse resp){
        if (req.getParameter("tema")!=null) {
            a.setTema(req.getParameter("tema"));
        }
        if (req.getParameter("fecha")!=null) {
            a.setFecha_publi(req.getParameter("fecha"));
        }
        if(req.getParameter("contenido")!=null){
            a.setContenido(req.getParameter("contenido"));
        }
        if(req.getParameter("titulo")!=null){
            a.setTitulo(req.getParameter("titulo"));
        }
        if(req.getParameter("id_user")!=null){
            int id=Integer.parseInt(req.getParameter("id_user"));
            a.setUser(id);
        }
        try{
            int c=b.Editar(a);
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
    private void EliminarPubli(HttpServletRequest req, HttpServletResponse resp){
        if(req.getParameter("id")!=null){
                int id=Integer.parseInt(req.getParameter("id"));
                a.setId(id);
        }
        try{
            int c=b.Eliminar(a);
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
}