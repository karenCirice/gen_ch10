let numero1 = 0;
let numero2 = 0;
let operacion1 = "";
const calculadoraHTML = document.querySelector('.calculadora');

function retrieve(){
    numero1 = document.getElementById("numero1").value;
    numero2 = document.getElementById("numero2").value;
    operacion = document.getElementById("operacion").value;
    let rest = calcular(numero1, numero2, operacion);
    console.log(rest);
    imprimirHTML(rest);
    
}
function calcular(num1, num2, oper){
    let resultado;
    if(oper==="suma"){
        resultado = parseInt(num1) + parseInt(num2);
    }
    else if(oper==="resta"){
        resultado = num1 - num2;
    }
    else if(oper==="multi"){
        resultado = num1 * num2;
    }
    else if(oper==="div"){
        resultado = num1 / num2;
    }
    else{
        oper="Error"
    }
    return resultado;
}

function imprimirHTML(rest){
        const parrafo = document.createElement("p");
        parrafo.innerText = rest;
        calculadoraHTML.appendChild(parrafo);
}