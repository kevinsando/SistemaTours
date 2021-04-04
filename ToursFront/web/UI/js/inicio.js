$(init);

function init(){
    listar();
}

function listar(){
    $.ajax({
        type: "GET",
        url: "/ToursFront/api/tours/disponibles",
        contentType: "application/json"
    }).then((list) => {
        construirMenu(list);
    });
}

function construirMenu(datos){
    var refMenu = document.getElementById('SelectLugares');
    console.log("contruyendo combo...");
    if (refMenu) {
        refMenu.options.length = 0;
        {
            var opc = document.createElement("option");//crea una opcion default, no está relacionada con ningun producto
            opc.setAttribute("value", "null");
            opc.appendChild(document.createTextNode("(Seleccione su destino)"));
            refMenu.appendChild(opc); //lo agrega al menu
        }
        datos.forEach(
                function (elemento, i, arreglo) {
                    var opcion = document.createElement("option");
                    opcion.setAttribute("value", String(i + 1));
                    opcion.appendChild(document.createTextNode(elemento.id));
                    refMenu.appendChild(opcion);
                }
        );
        refMenu.selectedIndex = 0;
        mostrarOpcion();
    }
}

function mostrarOpcion() {
    var refMenu = document.getElementById('selectLugares');
    if (refMenu) {
        var refCampo = document.getElementById('selección');
        if (refCampo) {
            var textoItem = refMenu.children[refMenu.selectedIndex].text;
            refCampo.innerHTML = `${refMenu.value} &rarr; '${textoItem}'`;
        }
    }
}