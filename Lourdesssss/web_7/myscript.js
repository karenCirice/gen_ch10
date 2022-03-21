/*function myFunction(){
    document.getElementById("demo").style.color="#a18041";
}

function myFunction2(element, color){
    console.log("datos de this: ", element);
    element.style.color = color;
}
function myFunction3(){
    const collection = document.getElementsByClassName("color");
    //collection[1].style.color = "blue";
    //collection[1].style.color = "blue";
    for(i=0; i<collection.length;i++){
        collection[i].style.color = "#e18049";
    }
    for(element of collection){
        element.style.color = "#e18049";
    }
}*/

function cambiarNombre() {
    let nombreIngresado = prompt("¿Cuál es tu nombre?");
    document.getElementById("nombre").innerHTML = "Hola " + nombreIngresado;
}
