console.log("Sesión J06");

/**
 * Obtiene los datos del formulario
 */
function obtenerFormulario() {
    let formulario = document.forms["formulario"];
    let concatenacion = "";

    for (let i of formulario) {
        concatenacion += " " + i.value;
    }
    console.log(concatenacion);
    console.log(formulario.nombre.value);
    console.log(formulario.apellido.value);
    localStorage.setItem(formulario["nombre"]["name"], formulario["nombre"]["value"]);
    localStorage.setItem(formulario["apellido"]["name"], formulario["apellido"]["value"]);

}

function setInvisible() {
    let botonFormulario = document.getElementById("todos");
    botonFormulario.style.visibility = "hidden";
}

function setOcultar() {
    let botonFormulario = document.getElementById("todos");
    botonFormulario.style.display = "none";
}

function recuperarFormulario() {
    let formulario = document.forms["formulario"];
    console.log("Datos en memoria: ", localStorage.getItem(formulario["nombre"]["name"]), localStorage.getItem(formulario["apellido"]["name"]));

    formulario["nombre"]["value"] = localStorage.getItem(formulario["nombre"]["name"]);
    formulario["apellido"]["value"] = localStorage.getItem(formulario["apellido"]["name"]);
}