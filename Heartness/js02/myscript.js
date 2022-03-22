let total = 0;

function suma(){
    let a = parseInt(document.getElementById("a").value);
    let b = parseInt(document.getElementById("b").value);
    total = a + b;
    console.log(total);
    document.getElementById("c").innerHTML = total;
    return total;
}

function resta(){
    let a = document.getElementById("a").value;
    let b = document.getElementById("b").value;
    total = a - b;
    console.log(total);
    document.getElementById("c").innerHTML = total;
    return total;
}

function multi (){
    let a = document.getElementById("a").value;
    let b = document.getElementById("b").value;
    total = a * b;
    console.log(total);
    document.getElementById("c").innerHTML = total;
    return total;
}

function divi (){
    let a = document.getElementById("a").value;
    let b = document.getElementById("b").value;
    total = a / b;
    console.log(total);
    document.getElementById("c").innerHTML = total;
    return total;
}