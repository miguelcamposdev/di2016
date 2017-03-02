//var esDia = true;

$( document ).ready(function(){
  $(document).on("click","#btnDiaNoche",function(){
    // METODO 1
    /*
    if(esDia) {
      $(this).text("Modo día");
      $("body").addClass("night");
      $("body").removeClass("day");
    } else {
      $(this).text("Modo noche");
      $("body").addClass("day");
      $("body").removeClass("night");
    }
    esDia = !esDia;
    */

    // METODO 2
    $("body").toggleClass("night");
  });

  $(document).on("click","#obtenerDatos",function(){
      $.ajax({
        method: "GET",
        cache: false,
        url: "http://rest.miguelcr.com/keeper/notas/",
        data: { userid: $("#idUser").val()}
      })
      .done(function(respuesta) { // se recibe una respuesta correcta
        alert( "success: "+respuesta );
      })
      .fail(function(respuesta) { // cuando ha ocurrido
        alert( "error: "+respuesta );
        console.log(respuesta);
      })
      .always(function() {
        alert( "complete" );
      }); // ajax
  }); // on click
}); // document.ready
