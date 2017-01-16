function tramitarPedido(){
	var validacionOk = true;
	var cantidad = document.getElementById("cantidad").value;
	if(cantidad=="" || cantidad=="0") {
		validacionOk = false;
	}

	if(validacionOk) {
		swal("Gracias", "Estamos preparando tu pedido", "success");
	} else {
		swal("Oops!", "No hay nada en el carrito de la compra!", "error");
	}
}

window.onload = function() {
	var btnCompra = document.getElementById("sendShip");	
	btnCompra.onclick = tramitarPedido;
}
