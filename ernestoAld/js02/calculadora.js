let sumar = ()=>{
    modificarValor((parseInt(document.getElementById("numeroA").value))+(parseInt(document.getElementById("numeroB").value)));
}

let restar = ()=>{
    let numeroA = parseInt(document.getElementById("numeroA").value);
    let numeroB = parseInt(document.getElementById("numeroB").value);
    document.getElementById("resultadoFinal").value = (numeroA-numeroB);
}

let multiplicar = ()=>{
    let numeroA = parseInt(document.getElementById("numeroA").value);
    let numeroB = parseInt(document.getElementById("numeroB").value);
    document.getElementById("resultadoFinal").value = (numeroA*numeroB);
}

let dividir = ()=>{
    let numeroA = parseInt(document.getElementById("numeroA").value);
    let numeroB = parseInt(document.getElementById("numeroB").value);
    document.getElementById("resultadoFinal").value = (numeroA/numeroB);
}

let borrar = ()=>{
    document.getElementById("numeroA").value = "";
    document.getElementById("numeroB").value = "";
    document.getElementById("resultadoFinal").value = "";
}

function modificarValor(resultado){
    document.getElementById("resultadoFinal").value = resultado;
}