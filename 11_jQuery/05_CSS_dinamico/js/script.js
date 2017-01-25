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
});
