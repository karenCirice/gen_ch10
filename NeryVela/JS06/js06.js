console.log("Sesión Js06");

function obtenerFormulario(){
    let formulario=document.forms["formulario"];
    ///Console.log(formulario);
    let concatenacion="";
    for (let i of formulario){
        //console.log(i.value);
        concatenacion=concatenacion + " "+i.value;
    }
    console.log(concatenacion);
    console.log(formulario["nombre"]["name"]);
    console.log(formulario["nombre"]["value"]);
    localStorage.setItem(formulario["nombre"]["name"],formulario["nombre"]["value"]);
    localStorage.setItem(formulario["apellido"]["name"],formulario["apellido"]["value"]);

}

/**
 * Hace invisible el botón principal del formulario 
 */

function recuperarFormulario(){
    let formulario = document.forms["formulario"];
    console.log("Datos en memoria:", localStorage.getItem(formulario["nombre"]["name"]));
    formulario["nombre"]["value"] = localStorage.getItem(formulario["nombre"]["name"]);
    formulario["apellido"]["value"] = localStorage.getItem(formulario["apellido"]["name"]);
}







function setInvisible(){
    let botonFormulario= document.getElementById("todos");
    botonFormulario.style.visibility= "hiden";
}

/**
 * Oculta el botón principal del formulario 
 */

function setOcultar(){
    let botonFormulario= document.getElementById("todos");
    botonFormulario.style.none= "none";
}


function recordatorio () {
    
}