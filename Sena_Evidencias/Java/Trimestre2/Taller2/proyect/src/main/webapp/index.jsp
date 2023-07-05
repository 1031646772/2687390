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
    <title>JuliRedes</title>
</head>
<body>
    <div class="contenedor">
        <header class="header">
            <nav>
            <img src="Imagenes/logo.png" class="logo">
            <button id="boton-registro" class="boton2">Registrarse</button>
            </nav>
            </header>
        <main class="contenido">
         <section class="containerred">
          <div class="red1">
            <button id="btn-abrir-modal" class="ingresoo"><img src="Imagenes/Instagram.webp" class="imgle"></button>
            </div>
            <div class="red1">
              <button id="btn-abrir-modal2" class="ingresoo"><img src="Imagenes/Messenger.webp" class="imgle"></button>
              </div>
         </section>
          <dialog id="modal">
            <form action="usuario" method="post">
              <button id="btn-cerrar-modal"><img src="Imagenes/cerrar.png" style="width:50px;height: 50px;"></button>
              <div class="formulario">
                <h1>Ingrese</h1>
              <div class="inputbox">
                <input type="text" required="required" name="usuario">
                <span>Username</span>
                <i></i>
              </div>
              <div class="inputbox">
                <input type="password" required="required" name="contrasena">
                <span>Password</span>
                <i></i>
                <br>
              </div>
              <div class="links">
                <a href="">¿Olvido su contraseña?</a>
              </div>
              <button class="botolo"  value="validar" name="accion">Login</button>
              </div>
            </form>
        </dialog>
        <dialog id="modal2">
          <form action="usuario" method="post">
            <button id="cerrar-modal"><img src="Imagenes/cerrar.png" style="width:50px;height: 50px;"></button>
            <div class="formulario2">
              <h1>Registrese</h1>
            <div class="inputbox">
              <input type="text" required="required" name="Nombre">
              <span>Nombre</span>
              <i></i>
            </div>
            <div class="inputbox">
              <input type="text" required="required" name="Apellido">
              <span>Apellido</span>
              <i></i>
              <br>
            </div>
            <div class="inputbox">
              <input type="text"  required="required" name="Usuario">
              <span>Usuario</span>
              <i></i>
              <br>
            </div>
            <div class="inputbox">
              <input type="password" required="required" name="Contrasena">
              <span>Contrasena</span>
              <i></i>
              <br>
            </div>
            <div class="inputbox">
              <input type="text" required="required" name="Fecha">
              <span>Fecha Nacimiento</span>
              <i></i>
              <br>
            </div>
            <div class="links">
              <a  href="index.html">¿Ya tienes cuenta? Ingresa por Login</a>
            </div>
            <button class="botore" name="accion" value="registrar" type="submit">Finish</button>
            </div>
          </form>
      </dialog>
        <script src="acciones_index.js"></script>
            </main>
    <div class="contens">
        <section>
            <img src="Imagenes/messeger.avif" class="facebook">
        </section>
        <section class="text">
            <h3>¿Que somos?</h3>
            <p>Facebook Messenger permite a los usuarios de Facebook enviar mensajes entre sí. Complementando las conversaciones regulares, Messenger permite a los usuarios realizar llamadas de voz y videollamadas tanto en interacciones individuales como en conversaciones de grupo.</p>
        </section>
    </div>
   <br>
   <div class="container_foo">
    <footer class="bg-light text-center">
      <!-- Grid container -->
      <div class="container p-4 pb-0">
        <!-- Section: Form -->
        <section class="">
          <form action="">
            <!--Grid row-->
            <div class="row d-flex justify-content-center">
              <!--Grid column-->
              <div class="col-auto">
                <p class="pt-2">
                  <strong>Ingresa tu correo para suscribirte</strong>
                </p>
              </div>
              <!--Grid column-->
    
              <!--Grid column-->
              <div class="col-md-5 col-12">
                <!-- Email input -->
                <div class="form-outline mb-4">
                  <input type="email" id="form5Example27" class="form-control" />
                  <label class="form-label" for="form5Example27">Email</label>
                </div>
              </div>
              <!--Grid column-->
    
              <!--Grid column-->
              <div class="col-auto">
                <!-- Submit button -->
                <button type="submit" class="btn btn-primary mb-4" style="background-color: rgb(39, 224, 178) ;border: none;">
                  Subscribirse
                </button>
              </div>
              <!--Grid column-->
            </div>
            <!--Grid row-->
          </form>
        </section>
        <!-- Section: Form -->
      </div>
      <!-- Grid container -->
    
      <!-- Copyright -->
      <div class="text-center p-3" style="background-color:#fff;">
        © 2023 Desarrollador:
        Julian Peralta
        <br>
        Tel 3508010097
        Email juliperalta1306@gmail.com
      </div>
      <!-- Copyright -->
    </footer>
   </div>
</body>
</html>