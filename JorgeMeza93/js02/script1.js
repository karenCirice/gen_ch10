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
    const overlay = document.createElement('div');
    const resultado = document.createElement('p');
    resultado.textContent = rest;
    resultado.classList.add('resultado');
    overlay.appendChild(resultado);
    overlay.classList.add('overlay');
    //Añadir boton cerrar
    const botonCerrar = document.createElement('p');
    botonCerrar.textContent = "X"
    botonCerrar.classList.add('btn-cerrar');
    botonCerrar.onclick = function(){
        const body = document.querySelector('body');
        body.classList.remove('fijar-body');
        overlay.remove();
    };
    document.addEventListener("keydown", (e)=>{
        const key = e.key;
        if(key==="Escape"){
            const body = document.querySelector('body');
            body.classList.remove('fijar-body');
            overlay.remove();
        }
    });
    //Añadir el elelemnto a body
    const body = document.querySelector('body');
    body.appendChild(overlay);
}