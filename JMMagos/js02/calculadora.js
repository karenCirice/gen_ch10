/**
 * Este documento en Js tiene el propósito de llevar a cabo las operaciones que se le indique
 * en la entrada del documento HTML linkeado a él.
 * Las cuatro funciones: suma resta mult div no reciben parámetros, procesan la información digitada
 * por el usuario en el documento HTML y muestran la información
 */

/**
 * función sum()
 * @returns {number} Regresa la suma de dos numeros
 */
function sum(){
    let a=document.getElementById("v1").value;
    a=parseInt(a);
    console.log("El resultado es %d",a);
    let b=document.getElementById("v2").value;
    b=parseInt(b);
    console.log("El resultado es %d",b);
    let c=a+b;
    console.log("El resultado es %d",c);
    document.getElementById("resultado").textContent=c;
}

function res(){
    let a=document.getElementById("v1").value;
    a=parseInt(a);
    console.log("El resultado es %d",a);
    let b=document.getElementById("v2").value;
    b=parseInt(b);
    console.log("El resultado es %d",b);
    let c=a-b;
    console.log("El resultado es %d",c);
    document.getElementById("resultado").textContent=c;
}

function mult(){
    let a=document.getElementById("v1").value;
    a=parseInt(a);
    console.log("El resultado es %d",a);
    let b=document.getElementById("v2").value;
    b=parseInt(b);
    console.log("El resultado es %d",b);
    let c=a*b;
    console.log("El resultado es %d",c);
    document.getElementById("resultado").textContent=c;
}

function div(){
    let a=document.getElementById("v1").value;
    a=parseInt(a);
    console.log("El resultado es %d",a);
    let b=document.getElementById("v2").value;
    b=parseInt(b);
    console.log("El resultado es %d",b);
    let c=a/b;
    console.log("El resultado es %d",c);
    document.getElementById("resultado").textContent=c;
}