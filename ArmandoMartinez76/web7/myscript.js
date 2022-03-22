//document.getElementById("demo").innerHTML = "My first Javascript";
console.log("yo aparezco primero")
function myFunction() {
    let xyz = prompt("Introduce tu nuevo nombre");
    document.getElementById("demo").innerHTML = "¡Hola " + xyz + "!";

    document.getElementById('demo').style.color = "red";
    console.log("yo aparezco despues")
}

function myFunction2(element, color) {
    element.style.color = color;
}

function myFunction3(){
    let abc = prompt("Introduce tu nuevo nombre");
    const collection = document.getElementsByClassName("color");
    console.log(collection);

    collection[0].style.color = 'blue'
    collection[1].style.color = 'blue'
}
