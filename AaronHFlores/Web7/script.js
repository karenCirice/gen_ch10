function changeName(){
    let name = prompt("¿Cual es tu nombre?");
    document.getElementById("nombre").innerHTML = "Hola " + name + "!";
}