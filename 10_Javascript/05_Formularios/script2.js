function nuevaCantidad(id){
	var nodoCantidad = document.getElementById(id);
	var cantidad = parseInt(nodoCantidad.value);
	var precioUnitario = parseInt(nodoCantidad.getAttribute("precio"));
	alert(cantidad +"*"+precioUnitario +"€ = " + cantidad*precioUnitario);
}

window.onload = function() {
	document.getElementById("cantidadCamiseta").onchange = nuevaCantidad("cantidadCamiseta");
	document.getElementById("cantidadPantalon").onchange = nuevaCantidad("cantidadPantalon");
}