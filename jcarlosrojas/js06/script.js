console.log("Sesion Js06");

/**
 * Obtiene los datos del formulario
 * @param {string} colorFondo Determina el color del formulario
 */
function obtenerFormulario(colorFondo) {
    let formulario = document.forms["formulario"];
    let concatenacion = "";

    for (let i of formulario) {
        concatenacion += " "+i.value;
    }
    console.log(concatenacion);
    console.log(formulario.nombre.value);
    console.log(formulario.apellido.value);
    localStorage.setItem(formulario["nombre"]["name"], formulario["nombre"]["value"]);
    localStorage.setItem(formulario["apellido"]["name"], formulario["apellido"]["value"]);
}

function recuperarFormulario() {
    let formulario =  document.forms["formulario"];
    console.log("Datos en memoria: ",localStorage.getItem(formulario["nombre"]["name"]), localStorage.getItem(formulario["apellido"]["name"]));
    formulario["nombre"]["value"] = localStorage.getItem(formulario["nombre"]["name"]);
    formulario["apellido"]["value"] = localStorage.getItem(formulario["apellido"]["name"]);
}

/**
 * Pone invisible al boton principal
 */
function setInvisible() {
    let botonFormulario = document.getElementById("todos");
    botonFormulario.style.visibility = "hidden";
}

/**
 * Oculta el boton principal del formulario
 */
function setOcultar() {
    let botonFormulario = document.getElementById("todos");
    botonFormulario.style.display = "none";

}

function recordatorio() {
    let array = ["dato1", "dato2", "dato3"];
    let objeto = {
        clave1: "dato1",
        clave2: "dato2",
        clave3: { claveInterna1: "dato1", claveInterna2: "dato2"}
    };

    objeto.clave3.claveInterna1
}
