function suma(){
    let a = parseInt(document.getElementById("a").value);
    let b = parseInt(document.getElementById("b").value);
    document.getElementById("resultado").value = (a+b);
}

function resta(){
    let a = parseInt(document.getElementById("a").value);
    let b = parseInt(document.getElementById("b").value);
    document.getElementById("resultado").value = (a-b);
}

function multi(){
    let a = parseInt(document.getElementById("a").value);
    let b = parseInt(document.getElementById("b").value);
    document.getElementById("resultado").value = (a*b);
}

function divi(){
    let a = parseInt(document.getElementById("a").value);
    let b = parseInt(document.getElementById("b").value);
    document.getElementById("resultado").value = (a/b);
}

let borrar = () => {
    document.getElementById("a").value="";
    document.getElementById("b").value="";
    document.getElementById("resultado").value ="";
}