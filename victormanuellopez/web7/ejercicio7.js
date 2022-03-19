function cambiarNombre(){
    let newame = prompt("Introduce tu nuevo nombre:");
    document.getElementById("nombre").innerHTML = "¡Hola " + newame + "!";
}