let sumar = ()=>{
    let numeroA = parseInt(document.getElementById("numeroA").value);
    let numeroB = parseInt(document.getElementById("numeroB").value);
    document.getElementById("resultadof").value = (numeroA+numeroB);

}
let restar = ()=>{
    let numeroA = parseInt(document.getElementById("numeroA").value);
    let numeroB = parseInt(document.getElementById("numeroB").value);
    document.getElementById("resultadof").value = (numeroA-numeroB);

}
let multiplicar = ()=>{
    let numeroA = parseInt(document.getElementById("numeroA").value);
    let numeroB = parseInt(document.getElementById("numeroB").value);
    document.getElementById("resultadof").value = (numeroA*numeroB);

}
let dividir = ()=>{
    let numeroA = parseInt(document.getElementById("numeroA").value);
    let numeroB = parseInt(document.getElementById("numeroB").value);
    document.getElementById("resultadof").value = (numeroA/numeroB);

}
let borrar = ()=>{
    document.getElementById("numeroA").value = "";
    document.getElementById("numeroB").value = "";
    document.getElementById("resultadof").value = "";

}