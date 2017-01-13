function insertaUsuario(eventoInput) {
    var evento = window.event || eventoInput;
    console.log("Tecla pulsada: "+evento.keyCode);

    if(evento.keyCode==13) { // el usuario ha pulsado la tecla intro
      var nombreUsuario = document.getElementById("newusername").value;

      if(nombreUsuario!="") {
          var fila = document.createElement("tr");
          var columna = document.createElement("td");
          var texto = document.createTextNode(nombreUsuario);
          columna.setAttribute("colspan","4");

          columna.appendChild(texto);
          fila.appendChild(columna);

          var tbody = document.getElementById("tbodyusuarios");
          tbody.appendChild(fila);

          document.getElementById("newusername").value = "";
      }
    }
}

window.onload = function() {
  document.getElementById("newusername").onkeypress = insertaUsuario;
}
