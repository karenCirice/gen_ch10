
let entrada =() => {
    numeroA = parseInt(document.getElementById("a").value);
    numeroB = parseInt(document.getElementById("b").value);
    return numeroA, numeroB;
  };

function suma() {
    entrada();
    document.getElementById("c").innerHTML = numeroA+numeroB;
}

function resta() {
    entrada();
    document.getElementById("c").innerHTML = numeroA-numeroB;
}

function multiplicacion() {
    entrada();
    document.getElementById("c").innerHTML = numeroA*numeroB;
}

function division() {
    entrada();
    document.getElementById("c").innerHTML = numeroA/numeroB;
}


