
let sumar = () => {
    let a = parseInt(document.getElementById("num1").value);
    let b = parseInt(document.getElementById("num2").value);
    document.getElementById("res").value = (a + b);
}
let restar = () => {
    let a = parseInt(document.getElementById("num1").value);
    let b = parseInt(document.getElementById("num2").value);
    document.getElementById("res").value = (a - b);
}

let multiplicar = () => {
    let a = parseInt(document.getElementById("num1").value);
    let b = parseInt(document.getElementById("num2").value);
    document.getElementById("res").value = (a * b);
}

let dividir = () => {
    let a = parseInt(document.getElementById("num1").value);
    let b = parseInt(document.getElementById("num2").value);
    document.getElementById("res").value = (a / b);
}

let borrar = () => {
    document.getElementById("num1").value = "";
    document.getElementById("num2").value = "";
    document.getElementById("res").value = "";
}






