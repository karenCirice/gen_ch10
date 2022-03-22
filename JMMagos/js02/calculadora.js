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