
function myFunction() {
    document.getElementById("demo").style.color = "red";
}

function myFunction2(element, color) {
    console.log("Los datos son: "+element);
    element.style.color = color;
}

function myFunction3() {
    const collection = document.getElementsByClassName("color");
    console.log(collection);

    collection[0].style.color = "blue";
    collection[1].style.color = "blue";
}

function cambiarNombre() {
    let nombreUsuario = prompt("Ingrese su nombre");
    document.getElementById("nombre").innerHTML = "Hola "+nombreUsuario;
}
