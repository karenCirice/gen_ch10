console.log("inicia mi script");

function myFunction() {
    let h1_nombre = document.getElementById('nombre');
    let button = document.getElementById('button');
    let nombre = window.prompt("¿Cuál es tu nombre?");
    //button.classList.replace(' ', 'btn-secondary');
    h1_nombre.innerHTML = "Hola " + nombre;
    button.style.backgroundColor = "green";

}