let nombre = "";
let nameHeading = document.getElementById("heading");
function saludar(){
    nombre = prompt('¿Cuál es tu nombre');
    cambiarNombre(nombre);
}
function cambiarNombre(nombre){
    this.nombre = nombre;
    nameHeading.innerText = `Hola ${nombre}`;
    if(nombre===null || nombre===""){
        nameHeading.innerText = "Hola amigo";
    }
    nombre ="";
}