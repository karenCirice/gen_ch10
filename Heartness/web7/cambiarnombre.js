function cambiarNombre(){
    let nombre = window.prompt("Cual es tu nombre ?");
    document.getElementById("nombre").innerHTML = "Hola " + nombre;
}