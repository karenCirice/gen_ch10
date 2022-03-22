
console.log("Sesión js06")

/**
 * Obtiene datos del formulario
 * @param {boolean} colorFondo Dtermina el color del formulario
 */

function obtenerFormulario(){
    let formulario = document.forms["formulario"];
    let concatenacion = "";

    for(let i of formulario){
        concatenacion = concatenacion + " " + i.value;
    }

    console.log(concatenacion);
    console.log(formulario["nombre"]["name"]);
    console.log(formulario["apellido"]["name"]);
    localStorage.setItem(formulario["nombre"]["name"], formulario["nombre"]["value"]);
    localStorage.setItem(formulario["apellido"]["name"], formulario["apellido"]["value"]);
}

function recuperarFormulario(){
    let formulario = document.forms["formulario"];
    console.log("Datos en memoria: ", localStorage.getItem(formulario["nombre"]["name"]));
    formulario["nombre"]["value"] = localStorage.getItem(formulario["nombre"]["name"]);
    formulario["apellido"]["value"] = localStorage.getItem(formulario["apellido"]["name"]);
}