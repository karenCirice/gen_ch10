
function sum(){
let num1= parseInt(document.getElementById("valor1").value);
let num2= parseInt(document.getElementById("valor2").value);
let resultado = num1 + num2;
console.log ("numeros", num1, "a", num2);
document.getElementById("resultado").value= resultado;
}

function resta(){
let num1= parseInt(document.getElementById("valor1").value);
let num2= parseInt(document.getElementById("valor2").value);   
let resultado = num1 - num2;    
document.getElementById("resultado").value= resultado;
}

function multiplicacion(){
let num1= parseInt(document.getElementById("valor1").value);
let num2= parseInt(document.getElementById("valor2").value);      
let resultado = num1 * num2;        
document.getElementById("resultado").value= resultado;
}

function division(){
let num1= parseInt(document.getElementById("valor1").value);
let num2= parseInt(document.getElementById("valor2").value);
let resultado = num1 / num2;
document.getElementById("resultado").value= resultado;
}