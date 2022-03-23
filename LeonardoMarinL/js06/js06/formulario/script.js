console.log("sesión Js06");

function obtenerFormulario(){
    let formulario = document.forms["formulario"];
    //console.log(formulario);
    let concatenacion = " "; //inicializar la variable
    for (let i of formulario){
        //console.log(i.value);
        concatenacion = concatenacion + " " + i.value;
    }
    console.log(concatenacion);
    console.log(formulario.nombre.value);
    console.log(formulario.apellido.value);
    localStorage.setItem(formulario["nombre"]["name"],formulario["nombre"]["value"]); //para almacenar los datos del input nombre {[llave][valor]}
    localStorage.setItem(formulario["apellido"]["name"],formulario["apellido"]["value"]); //para almacenar los datos del input apellido {[llave][valor]}
}

function recuperarFormulario(){
    let formulario = document.forms["formulario"];
    console.log("Datos en su memoria: ",localStorage.getItem(formulario["nombre"]["name"]));
    formulario["nombre"]["value"] = localStorage.getItem(formulario["nombre"]["name"]);
    formulario["apellido"]["value"] = localStorage.getItem(formulario["apellido"]["name"]);
}

/**
 * Pone invisible al botón principal del formulario
 */
function setInvisible(){
    let botonFormulario = document.getElementById("todos");
    botonFormulario.style.visibility="hidden";
}

/**
 * Oculta al botón principal del formulario
 */
 function setOcultar(){
    let botonFormulario = document.getElementById("todos");
    botonFormulario.style.display="none";
}

function recordatorio(){
    let array = ["dato1", "dato2", "dato3"];
    let objeto = {
        clave1:true, 
        clave2:["dato1", "dato2", "dato3"], 
        clave3:{
            claveinterna1:16, 
            claveinterna2:"datoobje2"}
        };
}