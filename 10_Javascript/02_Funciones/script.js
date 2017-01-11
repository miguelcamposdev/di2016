var mensaje = "";
var op1, op2;

function sumar() {
  op1 = document.getElementById("operando1").value;
  op2 = document.getElementById("operando2").value;
  var resultado = parseInt(op1)+parseInt(op2);
  alert(op1+"+"+op2+"="+resultado);
}

function restar() {
  op1 = document.getElementById("operando1").value;
  op2 = document.getElementById("operando2").value;
  if(op1<op2) {
    alert(op1+" debería ser mayor que "+op2);
  } else {
    var resultado = parseInt(op1)+parseInt(op2);
    alert(op1+"-"+op2+"="+resultado);
  }
}
