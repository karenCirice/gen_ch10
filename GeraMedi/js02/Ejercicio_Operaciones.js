//Función para introduccir A
function suma(){
    let a=parseInt(document.getElementById("a").value)
    let b=parseInt(document.getElementById("b").value)
    let total=a+b;
//Se asocia el titulo h2 ("c") para que nos cambie el resultado ahí
    document.getElementById("c").innerHTML = "El resultado es: " + total;

}

//Función para introduccir B
function resta(){
    let a=parseInt(document.getElementById("a").value)
    let b=parseInt(document.getElementById("b").value)
    let total=a-b;
//Se asocia el titulo h2 ("c") para que nos cambie el resultado ahí
    document.getElementById("c").innerHTML = "El resultado es: " + total;

}

//Función para introduccir C
function divi(){
    let a=parseInt(document.getElementById("a").value)
    let b=parseInt(document.getElementById("b").value)
    let total=a/b;
    document.getElementById("c").innerHTML = "El resultado es: " + total;

}

//Función para introduccir D
function multi(){
    let a=parseInt(document.getElementById("a").value)
    let b=parseInt(document.getElementById("b").value)
    let total=a*b;
    document.getElementById("c").innerHTML = "El resultado es: " + total;

}

//Función para limpiar datos ingresados en input
function clear(){
    document.getElementById("a").value = "";
    document.getElementById("b").value = "";
    document.getElementById("c").innerHTML = "El resultado es: ";
}