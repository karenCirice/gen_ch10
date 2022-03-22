function cambiarNombre(){
    let nuevoNombre = prompt("¿cuál es tu nombre?");
   document.getElementById("nombre").innerHTML = "¡Hola " +nuevoNombre + "!";

}