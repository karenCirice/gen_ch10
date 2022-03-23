function suma(){
    let a = parseInt(document.getElementById("numero1").value);
    let b = parseInt(document.getElementById("numero2").value);
    let suma = a + b;
    document.getElementById("resultado").value = suma;
}

function resta(){
    let a = parseInt(document.getElementById("numero1").value);
    let b = parseInt(document.getElementById("numero2").value);
    let suma = a - b;
    document.getElementById("resultado").value = suma;
}

function multiplicar(){
    let a = parseInt(document.getElementById("numero1").value);
    let b = parseInt(document.getElementById("numero2").value);
    let suma = a * b;
    document.getElementById("resultado").value = suma;
}

function dividir(){
    let a = parseInt(document.getElementById("numero1").value);
    let b = parseInt(document.getElementById("numero2").value);
    let suma = a / b;
    document.getElementById("resultado").value = suma;
}

limpiarFormato = () => {
    document.getElementById("numero1").value = "";
    document.getElementById("numero2").value = "";
    document.getElementById("resultado").value = "";

}

