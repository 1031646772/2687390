package model.usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.google.protobuf.Method;

import model.conexion;

public class usuarioDo {
    Connection con;
    PreparedStatement prepare;
    String sql=null;
    int confirmacion;
    ResultSet p;
    public int  RegistrarUsu(usuarioVo usuario) {
        sql="insert into usuario (nombre,apellido,usuario,contrasena,fecha_nacimiento) values (?,?,?,?,?);";
        try {
            con=conexion.conecting();
            prepare=con.prepareStatement(sql);
            prepare.setString(1,usuario.getNombre());
            prepare.setString(2,usuario.getApellido());
            prepare.setString(3,usuario.getUsuario());
            prepare.setString(4,usuario.getContrasena());
            prepare.setString(5,usuario.getFecha());
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
    public List<usuarioVo> consultarusu(){
        sql="select * from usuario;";
        List<usuarioVo>array=new ArrayList<>();
        try {
            con=conexion.conecting();
            prepare=con.prepareStatement(sql);
            p=prepare.executeQuery(sql);
            while(p.next()){
                usuarioVo a=new usuarioVo();
                a.setId(p.getInt("id"));
                a.setNombre(p.getString("nombre"));
                a.setApellido(p.getString("apellido"));
                a.setContrasena(p.getString("contrasena"));
                a.setUsuario(p.getString("usuario"));
                a.setFecha(p.getString("fecha_nacimiento"));
                a.setEstado(p.getString("estado"));  
                array.add(a);   
                System.out.println("Se sobre escribio bien");       
            }
            prepare.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error al registrar"+e.getMessage().toString());
        }
        return array;
    }
    public boolean consultaLogin(String contra, String usu, boolean confirmacion){
        sql="select * from usuario where contrasena='"+contra+"' and usuario='"+usu+"'";
        try {
            con=conexion.conecting();
            prepare=con.prepareStatement(sql);
            p=prepare.executeQuery(sql);
            if (p.next()) {
                String usuarioDB=p.getString("usuario");
                String contrasenaBD=p.getString("contrasena");
                System.out.println(usuarioDB);
                System.out.println(contrasenaBD);
                System.out.println(usu);
                System.out.println(contra);
                if (usu.equals(usuarioDB) ) {
                    System.out.println("Usuario correcto");
                    if (contra.equals(contrasenaBD)) {
                        System.out.println("contraseña correcta");
                        confirmacion=true;
                    }else{
                        System.out.println("Contraseña incorrecta");
                        confirmacion=false;
                    }
                }
            }  else{
                System.out.println("Nada correcto careverga");
                confirmacion=false;
            }
        } catch (Exception e) {
            System.out.println("Error al validar Model "+e.getMessage().toString());
        }
        return confirmacion;
    }
     public int  ActualizarUsu(usuarioVo usuario) {
        sql="update usuario set nombre=?,apellido=?,usuario=?,contrasena=?,fecha_nacimiento?,estado=?;";
        try {
            con=conexion.conecting();
            prepare=con.prepareStatement(sql);
            prepare.setString(1,usuario.getNombre());
            prepare.setString(2,usuario.getApellido());
            prepare.setString(3,usuario.getUsuario());
            prepare.setString(4,usuario.getContrasena());
            prepare.setString(5,usuario.getFecha());
            prepare.setString(6,usuario.getEstado());
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
    public int inactivarUsuario(usuarioVo usuario){
         sql="update usuario set estado='Inactivo' where id=?";
         try{
          con=conexion.conecting();
          prepare=con.prepareStatement(sql);
          prepare.setInt(1,usuario.getId());
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
