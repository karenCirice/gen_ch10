//Se realiza un console rápido solo para comprobar que esta linkeada
console.log("Hola Mundo!");

//Función para formulario 
/**
 * Ejemplo de como poner los parámetros para una función.
 * @param {boolean} gera Determina un valor booeleano
 */
function obtenerFormulario(){
    let formulario = document.forms["formulario"];
    //console.log(formulario);
    //se declara concatenacion para emplearla en el for y que nos arroje los valores en un mismo string
    let concatenacion = "";
    //For of
    for (let i of formulario){
        //.value para que nos dé solo el valor de los datos.
        //console.log(i.value);
        concatenacion = concatenacion + " " + i.value;
    }
    console.log(concatenacion);
    //Es lo mismo que poner console.log(formulario.nombre.name); y console.log(formulario["nombre"]["name"]);
    console.log(formulario.nombre.name);
    console.log(formulario.apellido.value);
    
    localStorage.setItem(formulario.nombre.name, 
        formulario.nombre.value);
    localStorage.setItem(formulario.apellido.name, 
        formulario.apellido.value);
}


/**
 * Recuperación de datos
 * @param {*} params 
 */
function recuperarFormulario() {
    let formulario = document.forms["formulario"];
    console.log("Datos en memoria: ",
    localStorage.getItem(formulario.nombre.name)
    );
    formulario.nombre.value =  localStorage.getItem(
        formulario.nombre.name
        );
    formulario.apellido.value =  localStorage.getItem(
        formulario.apellido.name
        );  
}

/**
 * Oculta el botón principal
 * @param {*} params 
 */
function setInvisible(params) {
    let botonFormulario= document.getElementById("todos");
    botonFormulario.style.visibility = "hidden";
}

/**
 * Para ocultar el botón principal
 * @param {*} params 
 */
function setOcultar(params) {
    let botonFormulario= document.getElementById("todos");
    botonFormulario.style.display = "none";
}