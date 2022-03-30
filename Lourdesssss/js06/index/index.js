//First declare the function:

/**
 * @param {string} nombre determina el nombre a imprimir
 * @param {string} apellido determina el apellido a imprimir
 * @param {string} colorFondo Determina el color del formulario*/
function obtenerFormulario (colorFondo){
    colorFondo = "blue";
    let formulario = document.forms["formulario"];
    let concatenacion = "";
    for( let datos of formulario){
        concatenacion =  concatenacion + " " + datos.value;
    }
    console.log(concatenacion);
    console.log(formulario.nombre.name);
    console.log(formulario.apellido.value);
    localStorage.setItem(formulario["nombre"]["name"], formulario["nombre"]["value"]);
    localStorage.setItem(formulario["apellido"]["name"], formulario["apellido"]["value"])
}

/**
 * recuperación de los datos en memoria:
 */

function recuperarFormulario(){
    let formulario = document.forms["formulario"];
    console.log("Datos de memoria: ", localStorage.getItem(formulario["nombre"]["name"]));
    formulario["nombre"]["value"] = localStorage.getItem(formulario["nombre"]["name"]);
}

/**
 * colocar invisible y oculto el boton de formulario
 */

function setInvisible (){
    let bottonFormulario = document.getElementById("todos");
    bottonFormulario.style.visibility = "hidden";
}

function setOcultar (){
    let bottonFormulario = document.getElementById("todos");
    bottonFormulario.style.display = "none";
}

/*
let borrar = () => {
    document.getElementById("nombre").value = " ";
    document.getElementById("apellido").value = " ";
    document.getElementById("todos").value = " ";
}
*/