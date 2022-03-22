let a,b;
function request1(){
     a =  prompt("Ingrese el primer valor",0)
     a = parseInt(a);
     document.getElementById("but1").innerHTML =a;
    }
function request2(){
     b =  prompt("Ingrese el segundo valor",0)
     b = parseInt(b);
     document.getElementById("but2").innerHTML =b;
}

function suma(){
    s = a + b;
    document.getElementById("result").innerHTML = s;
}
function resta(){
    r = a - b;
    document.getElementById("result").innerHTML = r;
}
function mult(){
    m = a * b;
    document.getElementById("result").innerHTML = m;
}
function div(){
    d = a / b;

    document.getElementById("result").innerHTML = d;
}
function borrar(){
    document.getElementById("but1").innerHTML = "Valor1";
    document.getElementById("but2").innerHTML = "Valor2";
    document.getElementById("result").innerHTML = "Resultado";
}