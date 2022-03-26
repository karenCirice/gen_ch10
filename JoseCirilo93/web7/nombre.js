bootbox.prompt("What is your name?", function(result){
    /* your callback code */ 

})


function myFunction() {
    let cambiarNombre = document.getElementById('nombre');
    let nombre = window.prompt("¿Cuál es tu nombre?");
    cambiarNombre.innerHTML = "Hola " + nombre;
    
}