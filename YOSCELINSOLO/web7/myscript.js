/*
function myFunction(){
    document.getElementById("demo").style.color ="red";

}

function myFunction2(element, color){
    element.style.color =color;

}
// Uso Elements porque en una clase puedo obtener varios elementos

// 
function myFunction3(){
    const collection = document.getElementsByClassName ('color');
    console.log(collection);

    collection[0].style.color ="blue";
    collection[1].style.color ="blue";
}

function CambiarColor(){
    const collection = document.getElementsByClassName ('color');
    console.log(collection);

    for (element of collection){

    }

*/

    function myFunction(){
        let newName = prompt("¿Cuál es tu nombre?");
        document.getElementById("name").innerHTML = "Hola " + newName;

    
    }
