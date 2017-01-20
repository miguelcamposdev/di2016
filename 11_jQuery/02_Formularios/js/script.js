

$( document ).ready(function(){
    // Getter
    var email = $("#email").val();

    // Muestro el valor inicial del campo email
    //alert("Email: "+email);

    // Setter
    //$("#email").val("email@cambiado.com");

    $("#buttonClear").on("click",function(){
      $("#email").val("");
      alert("Alguien ha modificado el email");
    });

    $("#email").on("change",function(){
      alert("Alguien ha modificado el email");
    });
});
