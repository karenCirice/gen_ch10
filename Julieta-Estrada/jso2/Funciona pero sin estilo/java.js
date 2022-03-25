//Función suma
function suma(){
    let a = parseInt(document.getElementById("primerNumero").value);
    let b = parseInt(document.getElementById("segundoNumero").value);
    let suma = a + b;
    console.log(suma);
    document.getElementById("res").value = suma 
}

//Función resta
function resta(){
    let a = document.getElementById("primerNumero").value;
    let b = document.getElementById("segundoNumero").value;
    let resta = a - b;
    console.log(resta);
    document.getElementById("res").value = resta;
}

//Función Multiplicación
function multi(){
    let a = document.getElementById("primerNumero").value;
    let b = document.getElementById("segundoNumero").value;
    let multi = a * b;
    console.log(multi);
    document.getElementById("res").value = multi;
}

//Función división
function div(){
    let a = document.getElementById("primerNumero").value;
    let b = document.getElementById("segundoNumero").value;
    let div = a / b;
    console.log(div);
    document.getElementById("res").value = div;
}

//Limpiar terminal 
clearform = () => {
document.getElementById("primerNumero").value = "";
document.getElementById("segundoNumero").value = "";
document.getElementById("res").value = "";
}
