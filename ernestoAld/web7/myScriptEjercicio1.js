function cambiarNombre(){
    let nuevoNombre = prompt("Cual es el nuevo nombre?: ");
    document.getElementById("nombre").innerHTML = "Hola "+nuevoNombre;
}