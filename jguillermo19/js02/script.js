function Sumar(){
    let a = parseInt(document.getElementById("num1").value);
    let b = parseInt(document.getElementById("num2").value);
    let suma = a + b;
    document.getElementById("res").value = suma;
}

function Resta(){
    let a = parseInt(document.getElementById("num1").value);
    let b = parseInt(document.getElementById("num2").value);
    let resta = a - b;
    document.getElementById("res").value = resta;
}

function Multi(){
    let a = parseInt(document.getElementById("num1").value);
    let b = parseInt(document.getElementById("num2").value);
    let mult = a * b;
    document.getElementById("res").value = mult;
}

function Division(){
    let a = parseInt(document.getElementById("num1").value);
    let b = parseInt(document.getElementById("num2").value);
    let div = a / b;
    document.getElementById("res").value = div;
}

clearForm = () => {
    document.getElementById("num1").value = "";
    document.getElementById("num2").value = "";
    document.getElementById("res").value = "";
}