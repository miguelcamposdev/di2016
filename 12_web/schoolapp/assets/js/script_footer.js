$(document).ready(function(){
  $(document).on("click",".btn-editar",function(){
    var idEst = $(this).parent().parent().attr("id");

    $.ajax({
      method: "GET",
      url: baseUrl+"students/editajax/",
      data: { id: idEst}
    })
    .done(function(respuesta) {
        $("#contenido-modal").text("Editando el usuario "+respuesta);
    })
    .fail(function() {
      alert( "error" );
    });

  });
});
