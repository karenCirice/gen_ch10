console.log("Sesión js06");
/**
 * Obtiene los datos del formulario
 * @param {boolean} colorFondo Determina el color en el formulario
*/


function obtenerFormulario(colorFondo){
    colorFondo = "blue";
    let formulario = document.forms["formulario"]
    //console.log(formulario);
    let concatenacion;
    for (let i of formulario){
        //console.log(i.value)
        concatenacion = concatenacion + "" + i.value;

console.log(concatenacion)
console.log(formulario.nombre.value);
console.log(formulario.apellid.value);
localStorage.setItem(formulario["nombre"]["name"],formulario["nombre"]["value"]);
localStorage.setItem(formulario["apellido"]["name"],formulario["apellido"]["value"]);
}

}

/**
 * Recuperación de los datos en la memoria
 */

 function recuperarFormulario (){
    let formulario = document.forms["formulario"];
    console.log("Datos en memoria:",localStorage.getItem(formulario["nombre"]["name"],formulario["nombre"]["value"]));
    console.log("Datos en memoria:",localStorage.getItem(formulario["nombre"]["name"],formulario["apellido"]["value"]));
    formulario["nombre"]["value"] = localStorage.getItem(formulario["nombre"]["name"],formulario["nombre"]["value"]);
    formulario["apellido"]["value"] = localStorage.getItem(formulario["apellido"]["name"],formulario["apellido"]["value"]);
}



/**
 * Pone invisible al botón principal del formulario
 */

function setInvisible(){
    let botonFormulario = document.getElementById("todos");
    botonFormulario.style.visibility = "hidden";

}

/**
 * Oculta el botón principal del formulario
 */

function setOcultar(){
    let botonFormulario = document.getElementById("todos");
    botonFormulario.style.display = "none";
    
}


function recordatorio(){
    let array = ["dato1", "dato2", "dato3"];
    let objeto = {clave1: "dato1",clave2: ["dato1","dato2","dato3"],clave3:, {claveinterna1:"datoobj1",claveinterna2:"datoobj2"}};
}