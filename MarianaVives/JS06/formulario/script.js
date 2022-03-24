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
// ES LO MISMO SI USAMOS CORCHETES O EL "." PARA EL FORMULARIO
// console.log(formulario["nombre"]["name"]);
// console.log(formulario["nombre"]["value"]);
console.log(formulario.nombre.value);
console.log(formulario.apellido.value);
localStorage.setItem(formulario["nombre"]["name"],formulario ["nombre"]["value"]);
localStorage.setItem(formulario["apellido"]["name"],formulario["apellido"]["value"]);
}

/**
 * Recuperacion de los datos en memoria.
 */
function recuperarFormulario() {
    let formulario=document.forms["formulario"];
    console.log("Datos en memoria: ", localStorage.getItem(formulario["nombre"]["name"]));
    formulario["nombre"]["value"]=localStorage.getItem(formulario["nombre"]["name"]);
    formulario["apellido"]["value"]= localStorage.getItem(formulario["apellido"]["name"]);
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

function recordatorio(){
    let array=["dato1", "dato2", "dato3"];
    let objeto= {
        clave1: true, 
        clave2:["dato1", "dato2", "dato3"], 
        clave3:{
            claveinterna1: 16, 
            claveinterna2:"datoobje2"}
        };
    
}