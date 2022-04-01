console.log("Sesión Js06");
/**
 * Obtiene los datos del forulario
 * @param {boolean} colorFondo Determina el color del formulario
 * 
 */

function obtenerFormulario(){
    
    let formulario = document.forms["formulario"];
    let concatenacion= "";
    for (let i of formulario){
        concatenacion = concatenacion + " " + i.value;

    }
    console.log(concatenacion);
    console.log(formulario["nombre"]["name"]);
    console.log(formulario["nombre"]["value"]);
    localStorage.setItem(formulario["nombre"]["name"],formulario["nombre"]["value"]);
    localStorage.setItem(formulario["apellido"]["name"],formulario["nombre"]["value"]);

     /**
     * Pone invisible  el boton principal del formulario
     */
}
/**
 * Recuperacion de datos
 */
function recuperarFormulario(){
    let formulario = document.forms ["formulario"];
    console.log("Datos en memoria: ", localStorage.getItem(formulario["nombre"]["name"]));
    formulario["nombre"]["value"] = localStorage.getItem(formulario["nombre"]["name"]);
    formulario["apellido"]["value"] = localStorage.getItem(formulario["apellido"]["name"]);

}

function setInvisible(){
    let botonFormulario= document.getElementById("todos");
    botonFormulario.style.visibility = "hidden";
}
    /**
     * Oculta  el boton principal del formulario
     */
 function setOcultar(){
        let botonFormulario= document.getElementById("todos");
        botonFormulario.style.display = "none";
    }
