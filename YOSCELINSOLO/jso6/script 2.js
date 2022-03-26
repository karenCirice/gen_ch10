console.log("sesion Js06");


 /***
  * 
  */

function obtenerFormulario(){
  
    let formulario =document.forms["formulario"];
    //console.log(formulario);
    let concatenacion = "";
    for(let i of formulario){
        //console.log(i.value);
        concatenacion = concatenacion + " " + i.value;
    }
    console.log(concatenacion);
/**
 * 
 * Script para la instrucción localStorage.setItem necesita recuperar la llave y un valor +++ y para recuperar el valor solo necesitamos la llave
 */
    console.log(formulario["nombre"]["name"]);
    // console.log(formulario.nombre.value);     otra forma de hacerlo
    console.log(formulario["nombre"]["value"]);
    // console.log(formulario.apellido.value);
    localStorage.setItem(formulario["nombre"]["name"], formulario["nombre"]["value"]); //+++
    localStorage.setItem(formulario["apellido"]["name"], formulario["apellido"]["value"]); //+++


}

/**
 * Recuperación de los datos en memoria
 */

function recuperarFormulario(){
    let formulario = document.forms["formulario"];
    console.log ("Datos en memoria:", localStorage.getItem(formulario["nombre"]["name"]));
    formulario["nombre"]["value"]= localStorage.getItem(formulario["nombre"]["name"]);
    formulario["apellido"]["value"] = localStorage.getItem(formulario["apellido"]["name"]);
}

/**
 * Pone visible el boton principal del formulario
 */

function setInvisible(){
    let botonFormulario = document.getElementById("todos");
    botonFormulario.style.visibility ="hidden";
}

function setOcultar(){
    let botonFormulario = document.getElementById("todos");
    botonFormulario.style.display ="none";
}
/**
 * Esta función no hace nada en nuestro script, solo es para demostrar como los valores de las claves de un objeto 
 * pueden ser arreglos, objetos, booleanos, strings o numéricos
 */
function recordatorio(){
let array =["dato1","dato2", "dato3"];
let objeto ={ 
    clave1: true, 
    clave2: "dato2", 
    clave3:{
        claveinterna1: 16,
         claveinerna2:"datoObj2"}
        }
}