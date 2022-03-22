console.log("Sesión JS06");

/**
 * Obtiene instrucción de formulario
 * @param 
 */
function obtenerFormulario(){
    let formulario= document.forms["formulario"];
    //console.log(formulario);
    let concatenacion = "";
    for (let i of formulario){
        //console.log(i.value);
       concatenacion = concatenacion + " " + i.value; 
    }
    console.log(concatenacion);
}
/**
 * Pone invisible el botón principal
 */
function setInvisible(){
    let botonFormulario=document.getElementById("todos");
    botonFormulario.style.visibility = "hidden";

}

/**
 * Oculta el boton principal del formulario
 */
function setOcultar(){
    let botonFormulario= document.getElementById("todos");
    botonFormulario.style.display = "none";
}

