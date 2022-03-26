console.log("Sesión Js06");


/**
 * Función que trae los datos del formulario
 * @param {string} myName obtengo el nombre
 * @param {string} lastName obtengo el apellido
 */
function obtenerFormulario(){
    let formulario= document.forms["formulario"];
    //console.log(formulario);
    let acumulador="";
    for (let i of formulario){
        //console.log(i.value);
        acumulador= acumulador+" "+i.value;

    }
    console.log(acumulador);
    console.log(formulario.myName.value);
    console.log(formulario.lastName.value);
    localStorage.setItem(formulario.myName.name,formulario.myName.value);
    localStorage.setItem(formulario.lastName.name,formulario.lastName.value);
}

/**
 * Función que recupera los datos de LocalStorage
 * Trae Nombre y Apellido
 */
function recoverForm(){
    let formulario = document.forms["formulario"];
    console.log("Datos en memoria. Nombre: ",localStorage.getItem(formulario.myName.name));
    formulario.myName.value = localStorage.getItem(formulario.myName.name);
    console.log("Datos en memoria. Apellido: ",localStorage.getItem(formulario.lastName.name));
    formulario.lastName.value = localStorage.getItem(formulario.lastName.name);

}

/**
 * Función que pone invisible el botón principal
 */
function setInvisible(){
    let botonForm = document.getElementById("todos");
    botonForm.style.visibility = "hidden";
}

/**
 * Función que oculta el botón principal
 * (Lo desaparece del container)
 */
function setOcultar(){
    let botonForm = document.getElementById("todos");
    botonForm.style.display = "none";
}


/**
 * Reinicia los campos en el formulario
 */
function borrar(){
    document.getElementById('formulario').reset();
}

