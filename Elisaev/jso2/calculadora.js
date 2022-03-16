

function suma() {
    let numero1 = parseFloat(document.getElementById("numero1").value);
    let numero2 = parseFloat(document.getElementById("numero2").value);

    let resultado = numero1 + numero2;
    document.getElementById("resultado").value = resultado;
}

function resta() {
    let numero1 = parseFloat(document.getElementById("numero1").value);
    let numero2 = parseFloat(document.getElementById("numero2").value);

    let resultado = numero1 - numero2;

    document.getElementById("resultado").value = resultado;
}

function multi() {
    let numero1 = parseFloat(document.getElementById("numero1").value);
    let numero2 = parseFloat(document.getElementById("numero2").value);

    let resultado = numero1 * numero2;

    document.getElementById("resultado").value = resultado;
}


function division() {
    let numero1 = parseFloat(document.getElementById("numero1").value);
    let numero2 = parseFloat(document.getElementById("numero2").value);

    let resultado = numero1 / numero2;
    document.getElementById("resultado").value = resultado;
}

// function imprimir() {
//     document.getElementById("resultado").value = resultado;
// }