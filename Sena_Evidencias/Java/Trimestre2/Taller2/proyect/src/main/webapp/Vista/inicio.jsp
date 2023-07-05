<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="css/estilos.css">
    <title>Inicio</title>
</head>
<body>
    <div class="contenedor">
        <header style="height: 100px;">
            <nav>
            <img src="Imagenes/logo.png" class="logo">
            <input class="barra_busqueda" type="text" placeholder="Amigos, contenido y mas">
            <button class="buscar"><img style="border: 6px;width: 60px;height: 50px;border-radius: 10px;" src="Imagenes/lupa.png"></button>
            <button id="cerrar-sesion" class="boton_cerrar"><a style="text-decoration: none;color: white;" href="index.html">Cerrar</a></button>
            </nav>
            </header>
        <main class="contenido">
           <div class="hamburguesa">
            <button id="botonHa"><img src="Imagenes/menu.png" class="img_boton"></button>
           <dialog  id="lista">
                <ul class="objeto1">
                    <li class="elemento">Usuario
                        <ul class="sub-objeto">
                            <li>
                              <form action="usuario" method="get">
                                <a><button type="submit" name="accion" value="consultar">Ver</button></a></li>
                              </form>
                        </ul>
                    </li>
                    <li class="elemento2">Publicaciones
                       <ul class="sub-objeto2">
                           <li id="mostrar-form">Crear</li>
                           <li>
                            <form action="usuario" method="get">
                              <a><button type="submit" name="accion" value="consultarP">ver</button></a>
                            </form>
                          </li>
                       </ul>
                    </li>
                </ul>
           </dialog>
           <dialog id="modalpubli">
            <form action="publicacion" method="post">
              <button id="cerrar-modal"><img src="Imagenes/cerrar.png" style="width:50px;height: 50px;"></button>
              <div class="formulario2">
                <h1>Crea Tu publicacion</h1>
              <div class="inputbox">
                <input type="text" required="required" name="tema">
                <span>Tema</span>
                <i></i>
              </div>
              <div class="inputbox">
                <input type="text" required="required" name="fecha">
                <span>Fecha de publicacion</span>
                <i></i>
                <br>
              </div>
              <div class="inputbox">
                <input type="text"  required="required" name="contenido">
                <span>Contenido</span>
                <i></i>
                <br>
              </div>
              <div class="inputbox">
                <input type="password" required="required" name="titulo">
                <span>Titulo</span>
                <i></i>
                <br>
              </div>
              <div class="inputbox">
                <input type="number" required="required" name="id">
                <span>Persona que hace la publicacion</span>
                <i></i>
                <br>
              </div>
              <button class="botore" name="accion" value="crear" type="submit">Finish</button>
              </div>
            </form>
        </dialog>
           <script src="acciones_incio.js"></script>
            </main>
    </div>
   <br>
    <footer>
    </footer>
    
</body>
</html>