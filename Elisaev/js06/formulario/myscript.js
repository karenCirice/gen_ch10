console.log("Sesion js06");


/**
 * Obtiene los datos del formulario
 * 
 */
function obtenerFormulario() {
    let formulario = document.forms["formulario"];

    //se declara una unir lo valores en un mismo string
    let concatenacion = "";

    // itera el formulario para obtener todos los datos (nombre y apellido)
    for (let i of formulario) {
    
        concatenacion = concatenacion + " " + i.value;

    }
    console.log(concatenacion);
    console.log(formulario["nombre"]["value"]);
    console.log(formulario["apellido"]["value"]);
    localStorage.setItem(formulario["nombre"]["name"], formulario["nombre"]["value"]);
    localStorage.setItem(formulario["apellido"]["name"], formulario["apellido"]["value"]);
}


/**
 * Recupera los datos en memoria
 */

function recuperarFormulario() {
    let formulario = document.forms['formulario'];
    console.log("Datos en memoria: ", localStorage.getItem(formulario["nombre"]["name"]));
    
    formulario["nombre"]["value"] = localStorage.getItem(formulario["nombre"]["name"]);
    formulario["apellido"]["value"] = localStorage.getItem(formulario["apellido"]["name"]);


}

/**
 * Pone invisible al boton principal.
 */
function setInvisible() {
    let botonFormulario = document.getElementById('todos');
    botonFormulario.style.visibility = "hidden";
}


/**
 * Oculta el boton principal del formulario
 */
function setOcultar() {
    let botonFormulario = document.getElementById('todos');
    botonFormulario.style.display = "none";
}