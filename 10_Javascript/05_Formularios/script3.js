
function restarProducto(idProducto) { // "restarProducto-1"
    var arrayIdProducto = idProducto.split("-");
    // arrayIdProducto[0] > restarProducto
    // arrayIdProducto[1] > 1
    var numeroFila = arrayIdProducto[1];
    var spanCantidadProducto = document.getElementById("cantidadProducto-"+numeroFila);

    var cantidadProductoActual = spanCantidadProducto.innerHTML;
    var precioUnitarioProducto = spanCantidadProducto.getAttribute("precio");

    var cantidadProductoNueva = parseInt(cantidadProductoActual) - 1;

    // Actualizo la cantidad de elementos del producto
    spanCantidadProducto.innerHTML = cantidadProductoNueva;

    // Actualizo el precio totalizado del producto

}

// Este método se lanza cuando la
window.onload = function() {
  document.getElementById("restarProducto-1").onclick = function() {
    restarProducto("restarProducto-1");
  }

  document.getElementById("restarProducto-2").onclick = function() {
    restarProducto("restarProducto-2");
  }

}
