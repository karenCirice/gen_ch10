
function suma(){

    let numero1;
    let numero2;
    let resultado;

    numero1=parseInt(document.getElementById("numero1").value);
    numero2=parseInt(document.getElementById("numero2").value);

    resultado=numero1+numero2;

    document.getElementById("resultado").value=resultado;

}

function resta(){
    let numero1;
    let numero2;
    let resultado;

    numero1=parseInt(document.getElementById("numero1").value);
    numero2=parseInt(document.getElementById("numero2").value);

    resultado=numero1-numero2;

    document.getElementById("resultado").value=resultado;
}

function multiplicacion(){
    let numero1;
    let numero2;
    let resultado;

    numero1=parseInt(document.getElementById("numero1").value);
    numero2=parseInt(document.getElementById("numero2").value);

    resultado=numero1*numero2;

    document.getElementById("resultado").value=resultado;
}

function division(){
    let numero1;
    let numero2;
    let resultado;

    numero1=parseInt(document.getElementById("numero1").value);
    numero2=parseInt(document.getElementById("numero2").value);

    resultado=numero1/numero2;

    document.getElementById("resultado").value=resultado;
}


function limpiar(){

    document.getElementById("numero1").value="";
    document.getElementById("numero2").value="";
    document.getElementById("resultado").value="";
    
}