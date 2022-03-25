document.getElementById("demo").innerHTML= "pwpwpwpwpwpw"
function myFunction(){
    document.getElementById("demo").style.color = "red";
}
function myFunction2(element, color) {
    console.log("Datos de this:", element);
    element.style.color = color;
}
function myFunction3(){
    const collection = document.getElementsByClassName ("color");
    console.log(collection);
    collection[0].style .color = "blue";
    collection[1].style.color = "green";
}
function cambiarNombre(){
    let nombre =prompt("¿Cuál es tu nombre?");
    document.getElementById("f").innerHTML= "Hola " +nombre;
    document.getElementById("f").style.color = "green";

}


