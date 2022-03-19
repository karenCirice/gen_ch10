function Sumar(){
    let a = parseInt(document.getElementById("value1").value);
    let b = parseInt(document.getElementById("value2").value);
    let Suma = a + b;
    document.getElementById("valorFinal").value=Suma;
}

function Restar(){
    let a = parseInt(document.getElementById("value1").value);
    let b = parseInt(document.getElementById("value2").value);
    let Resta = a - b;
    document.getElementById("valorFinal").value=Resta;
}

function Multiplicar(){
    let a = parseInt(document.getElementById("value1").value);
    let b = parseInt(document.getElementById("value2").value);
    let Multiplicacion = a * b;
    document.getElementById("valorFinal").value=Multiplicacion;
}

function Dividir(){
    let a = parseInt(document.getElementById("value1").value);
    let b = parseInt(document.getElementById("value2").value);
    let Division = a / b;
    document.getElementById("valorFinal").value=Division;
}

Clear = () => {
    (document.getElementById("value1").value = "");
    (document.getElementById("value2").value = "");
    (document.getElementById("valorFinal").value = "");
}