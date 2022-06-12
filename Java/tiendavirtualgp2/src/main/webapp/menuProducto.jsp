<%-- 
    Document   : menuProducto
    Created on : 7/10/2021, 05:01:39 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
        <link rel="shortcut icon" href="tv.ico">       
        <title>Tienda Virtual</title>
        <div align="center"> <img src="imagenes/tienda2.jpg" height="250" width=100%></div>
         
    </head>
    <body>
        <form action="enlace3.jsp" method="post">
            <br>
            <div class="card text-center">

                <div class="card-header">
                    <h1 class="card-title">Tienda Virtual</h1>
                </div>
                <div class="card-body">

                    <h4 class="card-title">Menú Productos</h4>
                    <br>
                    <input type = "radio" name ="opcion1" value= "leer" file="menuProducto" checked>  Leer Producto <br><br>
                    <input type = "radio" name ="opcion1" value= "insertar" file="menuProducto">  Crear Producto <br><br>
                    <input type = "radio" name ="opcion1" value= "actualizar" file="menuProducto">  Actualizar Producto <br><br>
                    <input type = "radio" name ="opcion1" value= "eliminar" file="menuProducto">  Eliminar Producto <br><br>
                    <input type = "radio" name ="opcion1" value= "activar" file="menuProducto">  Activar Producto <br><br><br><br>
                    <hr>
                    <input type="submit"  class="btn btn-primary" value="Aceptar">
                    <a href="menuPrincipal.jsp" class="btn btn-primary">Regresar</a>
                </div>
            </div>
        </form>
    </body>
    
    <div class="card text-center">
        <div class="card-footer text-muted">
            Desarrollado por Grupo 8 - Global Project 
        </div>
    </div>
    
</html>
