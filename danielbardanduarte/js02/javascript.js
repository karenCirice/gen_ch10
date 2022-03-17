
function sumar() {
    let a  = parseInt (document.getElementById("a").value);
    let b  = parseInt (document.getElementById("b").value); 
 let suma = a + b;
 document.getElementById("c").innerHTML = "El resultado es: " + suma;
    
}
function resta() {
    let a  = parseInt (document.getElementById("a").value);
    let b  = parseInt (document.getElementById("b").value); 
 let resta = a - b;
 document.getElementById("c").innerHTML = "El resultado es: " + resta;
    
}
function mult() {
    let a  = parseInt (document.getElementById("a").value);
    let b  = parseInt (document.getElementById("b").value); 
 let mult = a * b;
 document.getElementById("c").innerHTML = "El resultado es: " + mult;
    
}
function div() {
    let a  = parseInt (document.getElementById("a").value);
    let b  = parseInt (document.getElementById("b").value); 
 let div = a / b;
 document.getElementById("c").innerHTML = "El resultado es: " + div;
    
}
function borrar() {
 document.getElementById("a").value = "";
 document.getElementById("b").value = "";
 document.getElementById("c").innerHTML = "";
    
}


