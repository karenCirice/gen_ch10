console.log("Sesión Js06");


/**
 * Obtiene los datos del formulario.
 * @param {boolean} colorFondo Determina el color del formulario
 */
function obtenerFormulario(colorFondo){
    colorFondo = "blue";
    let formulario = document.forms["formulario"];
    //console.log(formulario);
    let concatenacion = "";
    for (let i of formulario){
        //console.log(i.value);
        concatenacion = concatenacion + " " + i.value;        
    }
    console.log(concatenacion);
}

/**
 * Pone invisble al botón principal del formulario
 */
function setInvisible(){
    let botonFormulario= document.getElementById("todos");
    botonFormulario.style.visibility = "hidden";
}

/**
 * Oculta el botón principal del formulario
 */
function setOcultar(){
    let botonFormulario= document.getElementById("todos");
    botonFormulario.style.display = "none";
}

