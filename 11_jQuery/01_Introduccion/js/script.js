

$( document ).ready(function(){
    //alert("Se ha cargado la página");

    // Selector de etiqueta
    //$( "tr" ).css( "background-color", "#f1f1f1" );

    // Selector de clase
    //$("td.nombreProducto").css("font-weight","bold");

    // Selector múltiple
    //$( ".nombreProducto, .cantidadProducto" ).css( "color", "red" );

    // Selector elementos anidados
    //$('thead tr').css("background-color","#f1f1f1");

    var fila1 = $("tbody tr:first").html();
    $("tbody").append(fila1);

    
});
