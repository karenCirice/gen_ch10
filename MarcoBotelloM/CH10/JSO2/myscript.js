function limpiar() {
    document.getElementById("OperacionesNúmericas").reset();
    // reset Se utiliza para borrar todos los valores de los elementos del formulario .
}

function sumar() {
    let a = parseInt(document.getElementById("valor1").value);
    let b = parseInt(document.getElementById("valor2").value);
    document.getElementById("el-resultado").innerHTML = a+b;
 }
//   Devuelve una referencia al elemento por su ID. Sintaxis. elemento = document.getElementById(id);

function restar() {
    let a = parseInt(document.getElementById("valor1").value);
    let b = parseInt(document.getElementById("valor2").value);
    document.getElementById("el-resultado").innerHTML = a-b;
}

function multiplicar() {
    let a = parseInt(document.getElementById("valor1").value);
    let b = parseInt(document.getElementById("valor2").value);
    document.getElementById("el-resultado").innerHTML = a*b;
}

function dividir() {
    let a = parseInt(document.getElementById("valor1").value);
    let b = parseInt(document.getElementById("valor2").value);
    document.getElementById("el-resultado").innerHTML = a/b;
}