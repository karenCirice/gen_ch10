console.log("Iniciando script");

function myFunction(){
    let primernombre = document.getElementById('nombre');
    let nombre = window.prompt("Cual es tu nombre?");
    primernombre.innerHTML = `Hola ${nombre}!`;
}