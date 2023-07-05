package model.publicacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.google.protobuf.Method;

import model.conexion;

public class publicacionDo {
    Connection con;
    PreparedStatement prepare;
    String sql=null;
    int confirmacion;
    ResultSet p;
    public int  CrearPubli(publicacionVo publicacion) {
        sql="insert into publicacion (tema,fecha_publicacion,contenido,titulo,id_user) values (?,?,?,?,?);";
        try {
            con=conexion.conecting();
            prepare=con.prepareStatement(sql);
            prepare.setString(1,publicacion.getTema());
            prepare.setString(2,publicacion.getFecha_publi());
            prepare.setString(3,publicacion.getContenido());
            prepare.setString(4,publicacion.getTitulo());
            prepare.setInt(5,publicacion.getUser());
            prepare.executeUpdate();
            prepare.close();
            con.close();
            confirmacion=1;
        } catch (Exception e) {
            System.out.println("Error al registrar"+e.getMessage().toString());
        }
        if (confirmacion==1){
            return 1;
        }
        return 0;
    }
    public List<publicacionVo> Verpubli(){
        sql="select * from usuario;";
        List<publicacionVo>array=new ArrayList<>();
        try {
            con=conexion.conecting();
            prepare=con.prepareStatement(sql);
            p=prepare.executeQuery();
            while(p.next()){
                publicacionVo a=new publicacionVo();
                a.setId(p.getInt("id"));
                a.setTema(p.getString("tema"));
                a.setFecha_publi(p.getString("fecha_publicacion"));
                a.setContenido(p.getString("contenido"));
                a.setTitulo(p.getString("titulo"));
                a.setUser(p.getInt("id_user"));
                array.add(a);          
            }
            prepare.close();
            con.close();
            confirmacion=1;
        } catch (Exception e) {
            System.out.println("Error al registrar"+e.getMessage().toString());
        }
        return array;
    }
     public int  Editar(publicacionVo publicacion) {
        sql="update usuario set nombre=?,apellido=?,usuario=?,contrasena=?,fecha_nacimiento?,estado=?;";
        try {
            con=conexion.conecting();
            prepare=con.prepareStatement(sql);
            prepare.setString(1,publicacion.getTema());
            prepare.setString(2,publicacion.getFecha_publi());
            prepare.setString(3,publicacion.getContenido());
            prepare.setString(4,publicacion.getTitulo());
            prepare.setInt(5,publicacion.getUser());
            prepare.executeUpdate();
            prepare.close();
            con.close();
            confirmacion=1;
        } catch (Exception e) {
            System.out.println("Error al registrar"+e.getMessage().toString());
        }
        if (confirmacion==1){
            return 1;
        }
        return 0;
    }
    public int Eliminar(publicacionVo publicacion){
         sql="delete from publicacion where id=?";
         try{
          con=conexion.conecting();
          prepare=con.prepareStatement(sql);
          prepare.setInt(1,publicacion.getId());
          confirmacion=1;
         }
         catch (Exception e){
            System.out.println("Error al inactivar"+e.getMessage()+e.toString());
         }
         if(confirmacion==1){
            return 1;
         }
         return 0;
    }
}


