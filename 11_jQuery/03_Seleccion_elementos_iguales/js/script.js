

$( document ).ready(function(){
  $(".btn-eliminar").on("click",function(){

    alert("¿Deseas eliminar "+$(this).attr("nombre")+"?");
  });
});
