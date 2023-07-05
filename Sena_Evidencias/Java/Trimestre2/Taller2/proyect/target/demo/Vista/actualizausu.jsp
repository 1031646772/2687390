<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="../css/estilos.css">
</head>
<body>
    <main>
     <c:if test="nombre!='null'">
        <form action="usuario" method="post">
            <div class="inputbox">
                <input type="text" value="nombre" name="nombre">
                <span>Nombre</span>
            </div>
           <div class="inputbox">
            <input type="text" value="apellido" name="apellido">
            <span>Apellido</span>
           </div>
           <div class="inputbox">
            <input type="text" value="usuario" name="usuario">
            <span>Usuario</span>
           </div>
           <div class="inputbox">
            <input type="text" value="fecha" name="fecha">
            <span>Fecha de Nacimiento</span>
           </div>
           <div class="inputbox">
            <input type="text" value="contrasena" name="contrasena">
            <span>Contraseña</span>
           </div>
           <select name="estado">
            <option>Seleccione el estado del usuario</option>
            <option value="Activo">Activo</option>
            <option value="Inactivo">Inactivo</option>
           </select>
           <button type="submit" name="accion" value="actualizar">Modificar</button>
        </form>
     </c:if>
    </main>
</body>
</html>