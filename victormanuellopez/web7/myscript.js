function myfunction(a,b){
    document.getElementById("demo").style.color = "red";
    console.log("Cambia de color");
}

function myfunction2(element,color){
    console.log("Datos de this: ", element);
    element.style.color = "color";
}

function cambiarcolor(){
    const collection = document.getElementsByClassName("color");
    console.log(collection);

    for(element of collection){
        element.style.color = "blue";
    }
}