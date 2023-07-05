<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <header></header>
    <main>
     <c:forEach var="datos" items="${datos}">
     <div class="target">
     <img src="" alt="" class="imgusu">
     <h1 class="name">${datos.getTitulo}</h1>
     <h1 class="name">${datos.getTema}</h1>
     <h1 class="usu">${datos.getFecha_publi}</h1>
     <h1 class="usu">${datos.getContenido}</h1>
     <button><a href="publicacion?accion='actualizar'&&titulo=${datos.getaTitulo}&&tema=${datos.getTema}&&fecha=${datos.getFecha_publi}&&contenido=${datos.getContenido}&&id=${datos.getId}">Actualizar</a></button>
     <button><a href="publicacion?accion='eliminar'&&id=${datos.getId}">Eliminar</a></button>
    </div>
     </c:forEach>
    </main>
    <footer></footer>
</body>
</html>