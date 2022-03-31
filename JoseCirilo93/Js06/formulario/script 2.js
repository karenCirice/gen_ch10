console.log("Sesión Js06");

/**
 * Obtienen los datos del formulario
 */
function obtenerFormulario(){
    let formulario = document.forms [ "formulario"];
    let concatenacion = "";
    for (let i of formulario){
        concatenacion = concatenacion + " " + i.value;

    }
    console.log(concatenacion);
    console.log(formulario["Nombre"]["name"]);
    console.log(formulario["Nombre"]["value"]);
    localStorage.setItem(formulario["Nombre"]["name"],formulario["Nombre"]["value"]);
    localStorage.setItem(formulario["Apellido"]["name"],formulario["Apellido"]["value"]);
}
/**
 * Recuperacion de los datos del formulario
 */
 function recuperarFormulario(){
    let formulario = document.forms [ "formulario"];
    console.log("Datos en memoria: ",localStorage.getItem(formulario["Nombre"]["name"]));
    formulario["Nombre"]["value"] = localStorage.getItem(formulario["Nombre"]["name"]);
    formulario["Apellido"]["value"] = localStorage.getItem(formulario["Apellido"]["name"]);
}


function setInvisible(){
    let botonFormulario= document.getElementById("todos")
    botonFormulario.style.visibility = "hidden";
}

function setOcultar(){
    let botonFormulario= document.getElementById("todos")
    botonFormulario.style.display = "none";
}

