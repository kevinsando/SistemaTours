<%-- 
    Document   : master
    Created on : 27/03/2021, 02:29:00 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 
    <body>
        <div class="container-fluid">
            <nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="navbar-brand" href="#">
                            <img src="../img/logo.png" alt="Logo" style="width:30px;">
                        </a>                   
                    </li>
                    
                    <li class="nav-item">
                        <a class="nav-link" href="inicio.jsp">Inicio</a>
                    </li>

                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#ParetoVentas" id="navbardrop" data-toggle="dropdown"> 
                            Ventas 
                        </a>
                        <div class="dropdown-menu" id="ParetoVentas">
                            <div id="divReports" runat="server">
                                <ul class="nav nav-collapse">
                                    <a class="dropdown-item" href="prueba.jsp">Productos más vendidos</a> 
                                    <a class="dropdown-item" href="../ventas/menos-vendidos.jsp">Productos menos vendidos</a>
                                    <a class="dropdown-item" href="../ventas/vendidos-mes.jsp">Reporte ventas del mes</a> 
                                </ul>
                            </div>
                        </div>
                    </li>
                </ul>
                
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="login.jsp">Iniciar Sesion</a>
                    </li>
                </ul>
            </nav>
        </div>
    </body>
</html>