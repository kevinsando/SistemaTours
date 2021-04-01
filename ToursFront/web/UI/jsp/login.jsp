
<html>

    <head>
        <title>Login</title>

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
        <script src="js/jquery.min.js" type="text/javascript"></script>
        <script src="https://unpkg.com/swup@latest/dist/swup.min.js"></script>
        
        <script src="../js/login.js" type="text/javascript"></script>

        <link href="../css/cssLogin.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>
            <div class="container">
                    <div class="d-flex justify-content-center h-100">
                            <div class="card">
                                    <div class="card-header">
                                            <h3>Inicio</h3>
                                            <div class="d-flex justify-content-end social_icon">
                                                    <span><i class="fab fa-facebook-square"></i></span>
                                                    <span><i class="fab fa-google-plus-square"></i></span>
                                            </div>
                                    </div>
                                    <div class="card-body">
                                            <form>
                                                    <div class="input-group form-group">
                                                            <div class="input-group-prepend">
                                                                    <span class="input-group-text"><i class="fas fa-user"></i></span>
                                                            </div>
                                                            <input type="text" class="form-control" placeholder="usuario">

                                                    </div>
                                                    <div class="input-group form-group">
                                                            <div class="input-group-prepend">
                                                                    <span class="input-group-text"><i class="fas fa-key"></i></span>
                                                            </div>
                                                            <input type="password" class="form-control" placeholder="contraseña">
                                                    </div>
                                                    <div class="row align-items-center remember">
                                                            <input type="checkbox">Recordar
                                                    </div>
                                                    <div class="d-flex justify-content-center form-group">
                                                            <input type="submit" value="Ingresar" class="btn float-right login_btn">
                                                    </div>
                                            </form>
                                    </div>
                                    <div class="card-footer">
                                            <div class="d-flex justify-content-center links">
                                                    No tienes cuenta?<a href="registro.jsp">Registrarse</a>
                                            </div>
                                    </div>
                            </div>
                    </div>
            </div>
    </body>
</html>
