<%-- 
    Document   : inicio
    Created on : Mar 25, 2021, 7:20:07 PM
    Author     : MIGUEL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
        
        <link href="../css/default.css" rel="stylesheet" type="text/css"/>
        
        <title>Inicio</title>
    </head>
    <body>
        <header>
            <div class="container-fluid">
                <nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link text-white" href="#"> Prueba1 </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-white" href="#"> Prueba2 </a>
                        </li>
                        <li class="nav-item ml-auto">
                            <a class="nav-link text-white" href="#"> Prueba3 </a>
                        </li>
                    </ul>
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item">
                            <a class="nav-link text-white" href="#"> Iniciar Sesion </a>
                        </li>
                    </ul>
                </nav>
            </div>
        </header>
        <div class="container">
            <table id="tb-tours" class="table">
                <form id="tours" class="form-inline">
                    <thead class="thead-dark">
                        <tr>
                            <th class="justify-content-center">
                                <label for="options" class="mr-sm-2">Lugar: </label>
                                <select id="options" class="mb-2 mr-sm-2">
                                    <option value="Paris">Paris</option>
                                    <option value="Dubai">Dubai</option>
                                    <option value="Santorini">Santorini</option>
                                    <option value="Roma">Roma</option>                                 
                                </select>
                            </th>
                            <th>
                                <label for="first" class="mr-sm-2">Entrada: </label>
                                <input type="date" id="first" class="mb-2 mr-sm-2" name="trip-start"
                                       value="2018-07-22"
                                       min="2018-01-01" max="2018-12-31">
                            </th>
                            <th>
                                <label for="last" class="mr-sm-2">Salida: </label>
                                <input type="date" id="last" class="mb-2 mr-sm-5" name="trip-end"
                                       value="2018-07-22"
                                       min="2018-01-01" max="2018-12-31">
                                
                                <button type="submit" class="btn btn-light boton"> Buscar </button>
                            </th>
                        </tr>
                    </thead>
                </form>
                <tbody>
                    
                </tbody>
            </table>
        </div>
    </body>
</html>
