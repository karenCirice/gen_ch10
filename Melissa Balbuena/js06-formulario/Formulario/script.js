console.log("sesion Js06");

/**
 * Esta seccion obtiene datos del formulario
 * @param {string} colorFondo Determina el color del formulario
 */

//Tambien puede hacerse el metodo retorno

function obtenerFormulario(colorFondo){

    colorFondo = "magenta" ;

    let formulario = document.forms["formulario"];
    // console.log(formulario);

    let concatenacion =" ";
    for (let i of formulario){ 
        // console.log(i.value);
        concatenacion = concatenacion +" "+ i.value;
    }
    console.log(concatenacion);
    console.log(formulario.nombre.value);
    console.log(formulario.apellido.value);
    localStorage.setItem(formulario["nombre"]["name"],formulario["nombre"]["value"]);
    localStorage.setItem(formulario["apellido"]["name"],formulario["apellido"]["value"]);
}

/**
 * Esta seccion recupera los datos del formulario
 */
function recuperarFormulario(){
    let formulario = document.forms["formulario"];
    console.log("Datos en la memoria:", localStorage.getItem(formulario["nombre"]["name"]), localStorage.getItem(formulario["apellido"]["name"]));
    // console.log("Datos en la memoria:", localStorage.getItem(formulario["apellido"]["name"]));
    formulario["nombre"]["value"] = localStorage.getItem(formulario["nombre"]["name"]);
    formulario["apellido"]["value"] = localStorage.getItem(formulario["apellido"]["name"]);

}

/**
 * Esta seccion pone invisible al boton principal del formulario
 */
function setInvisible(){
    let botonFormulario = document.getElementById("todos");
    botonFormulario.style.visibility="hidden";

}

/**
 * Esta seccion oculta el boton principal del formulario
 */
function setOcultar(){
    let botonFormulario = document.getElementById("todos");
    botonFormulario.style.display="none";

}

function recordatorio(){
    let array = ["dato1", "dato2", ["dato3", "dato4"]];
    let obtenerdato1 = array[0];
    
}
//obtenerFormulario(); no hacer esto, porque llama la funcion, solo si lo necesito
//setInvisible();
//setOcultar();