console.log("sesión Js06");

function obtenerFormulario(){
    let formulario = document.forms["formulario"];
    //console.log(formulario);
    let concatenacion = " "; //inicializar la variable
    for (let i of formulario){
        //console.log(i.value);
        concatenacion = concatenacion + " " + i.value;
    }
    console.log(concatenacion);
}

/**
 * Pone invisible al botón principal del formulario
 */
function setInvisible(){
    let botonFormulario = document.getElementById("todos");
    botonFormulario.style.visibility="hidden";
}

/**
 * Oculta al botón principal del formulario
 */
 function setOcultar(){
    let botonFormulario = document.getElementById("todos");
    botonFormulario.style.display="none";
}