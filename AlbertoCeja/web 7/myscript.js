console.log("iniciando mi scrpt");

function myfunction() {
    document.getElementById("demo").style.color="red";
    console.log("cambiando el color");  
}

function myfunction2(element,color) {
    console.log("Datos de this ",element);
    element.style.color = color;
}

function myfunction3() {
    const collection = document.getElementsByClassName("color");
    console.log(collection);

    collection[0].style.color="blue";
    collection[1].style.color="blue";
}