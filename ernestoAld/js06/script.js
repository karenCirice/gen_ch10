console.log("JS06");


/**
 * Obtiene los datos del formulario
 * @param {string} nombre determina el nombre a mostrar
 * @param {string} apellido determina el apellido a mostrar
 */

function obtenerFormulario(){
    let nombre = document.getElementById("nombre-input");
    let apellido = document.getElementById("apellido-input");

    localStorage.setItem(nombre.name,nombre.value);
    localStorage.setItem(apellido.name,apellido.value);

    document.getElementById("nombre-input").value = "";
    document.getElementById("apellido-input").value = "";
    

    
}
//FUNCION PARA RECUPERAR LOS DATOS ALMACENADOS EN EL LOCAL STORAGE
function recuperarDatos(){
    let nombre = document.getElementById("nombre-input");
    let apellido = document.getElementById("apellido-input");
    document.getElementById("resultado").value = `${localStorage.getItem(nombre.name)} ${localStorage.getItem(apellido.name)}`;
    
}



/**
 * Funciones para ocultar el formulario
 */

function esconderFormulario(){
    document.getElementById("formulario").style.visibility = "hidden";
}

function invisibleFormulario(){
    document.getElementById("formulario").style.display = "none";
}

function mostrarFormulario(){
    document.getElementById("formulario").style.visibility = "visible";
    document.getElementById("formulario").style.display = "";
}

