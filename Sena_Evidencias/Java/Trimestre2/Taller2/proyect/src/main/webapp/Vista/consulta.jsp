<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="css/mostrar.css">
    <link rel="stylesheet" href="css/estilos.css">
</head>
<body>
    <header class="header">
        <nav>
        <img src="Imagenes/logo.png" class="logo">
        </nav>
        </header>
    <main>
     <c:forEach var="datos" items="${datos}">
    <div class="target">
     <img src="Imagenes/user.avif"  class="imgusu">
     <h3 class="name">Nombre:${datos.getNombre()}</h3>
     <h3 class="name">Apellido:${datos.getaApellido()}</h3>
     <h3 class="usu">Usuario:${datos.getUsuario()}</h3>
     <h3 class="usu">Contraseña:${datos.getContrasena()}</h3>
     <h3 class="fecha">Fecha de Nacimiento:${datos.getFecha()}</h3>
     <h3 class="Estado">Estado de usuario:${datos.getEstado()}</h3>
    <form action="usuario" method="post">
    <input type="hidden" value=${datos.getId()} name="id">
    <button type="submit" name="accion" value="actualizar">Actualizar</button>
     </form>
     <form action="usuario" method="post">
        <input type="hidden" value=${datos.getId()} name="id">
        <button type="submit" name="accion" value="eliminar">Eliminar</button>         
    </form>
    </div>
     </c:forEach>
    </main>
    <footer></footer>
</body>
</html>