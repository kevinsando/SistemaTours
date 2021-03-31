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

        <!-- LIBRERIAS -->
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"  crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>       
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"  crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"  crossorigin="anonymous"></script>

        <!-- STYLE -->
        <link href="../css/default.css" rel="stylesheet" type="text/css"/>

        <!--SWEET ALERT-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.10/jquery.mask.js"></script>
        <script src="sweetalert2.all.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@10"></script>

        <!--DATATABLE-->
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.20/css/jquery.dataTables.css">  
        <script type="text/javascript" charset="utf-8" src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.js"></script>

        <!-- JS -->
        <script src="../js/inicioJS.js" type="text/javascript"></script>

        <title>Inicio</title>
    </head>
    <body>
        <header>
            <!-- Master page -->
            <%@include file="master.jsp" %>
            <!-- End Master page -->
        </header>
        <div class="container">

            <form id="tours" class="form-inline">
                <table id="tb-tours" class="table">
                    <thead class="thead-dark">
                        <tr>
                            <th class="justify-content-center">
                                <select id="SelectLugares" class="mb-2 mr-sm-2" onchange="mostrarOpcion();">                              
                                </select>
                            </th>
                            <th>
                                <input type="text" id = "ida" placeholder="Ida" onfocus="(this.type = 'date')">
                            </th>
                            <th>
                                <input type="text" id = "vuelta" placeholder="Ida" onfocus="(this.type = 'date')">

                                
                            </th>
                            <th>
                                <button type="submit" class="btn btn-success"> Buscar </button>
                            </th>
                        </tr>
                    </thead>
                    <tbody>

                    </tbody>
                </table>
            </form>


        </div>
    </body>
</html>
