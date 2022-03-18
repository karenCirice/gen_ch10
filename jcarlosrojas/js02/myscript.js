let a,b;
let sumaAB, restaAB, productoAB, divisionAB;

function suma() {
    a = parseInt(document.getElementById("numeroA").value);
    b = parseInt(document.getElementById("numeroB").value);

    sumaAB = a + b;
    document.getElementById("resultadoNumero").value = sumaAB;
}

function resta() {
    a = parseInt(document.getElementById("numeroA").value);
    b = parseInt(document.getElementById("numeroB").value);
    console.log(a);
    console.log(b);

    restaAB = a - b;
    document.getElementById("resultadoNumero").value = restaAB;
}

function producto() {
    a = parseInt(document.getElementById("numeroA").value);
    b = parseInt(document.getElementById("numeroB").value);

    productoAB = a * b;
    document.getElementById("resultadoNumero").value = productoAB;
}

function division() {
    a = parseInt(document.getElementById("numeroA").value);
    b = parseInt(document.getElementById("numeroB").value);

    divisionAB = a / b;
    document.getElementById("resultadoNumero").value = divisionAB;
}
