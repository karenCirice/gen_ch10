function myFunction(){
    document.getElementById("demo2").style.color = "red";
    console.log("Cambiando el color");
}

function myFunction2(element,color){
    element.style.color = color;
}

function myFunction3(){
    const collection = document.getElementsByClassName("color");
    console.log(collection)

    for (element of collection){
        element.style.color ="green";
    }
}

function cambiar_nombre(){
    let new_nombre = prompt("¿Cuál es tu nombre?");
    document.getElementById("camNombre").innerHTML="Hola "+new_nombre;
}


document.getElementById("demo").innerHTML="My first JavaScript";
document.getElementById("demo2").innerHTML="My second JavaScript";

