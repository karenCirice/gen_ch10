suma = () => {
    let num1 = parseInt(document.getElementById("num1").value);
    let num2 = parseInt(document.getElementById("num2").value);
    let res = parseInt(num1 + num2);
    document.getElementById("result").innerHTML = "El resultado es: "+ res;
   
}

function resta(){
    let num1 = parseInt(document.getElementById("num1").value);
    let num2 = parseInt(document.getElementById("num2").value);
    let res = parseInt(num1 - num2);
    document.getElementById("result").innerHTML = "El resultado es: "+ res;
}

function multiplicacion(){
    let num1 = parseInt(document.getElementById("num1").value);
    let num2 = parseInt(document.getElementById("num2").value);
    let res = parseInt(num1 * num2);
    document.getElementById("result").innerHTML = "El resultado es: "+ res;
}

function division(){
    let num1 = parseInt(document.getElementById("num1").value);
    let num2 = parseInt(document.getElementById("num2").value);
    let res = parseFloat(num1 / num2);
    document.getElementById("result").innerHTML = "El resultado es: "+ res;
}

limpiar = () => {
    document.getElementById("num1").value = "";
    document.getElementById("num2").value = "";
    document.getElementById("result").innerHTML = "";
}






