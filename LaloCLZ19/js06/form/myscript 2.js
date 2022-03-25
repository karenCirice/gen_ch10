/**
 * Funcion que obtiene los datos del formulario y los mete en pantalla
 */
function datosForm(){
    let form = document.forms["formulario"];
    let string = "";
    for (const i of form) {
        string = string + " "+ i.value;
    }
    document.getElementById("data").innerHTML = "<h1>"+string+"</h1>"
}

/**
 * Quita y pone el texto que se selecciona en el DOM
 */
function quitButton() {
    let btn = document.getElementById("btnRM");
    if (btn.innerText == "Quitar") {
        document.getElementById("textoRM").style.display = "none"
        btn.innerText = "Poner";
    } else if (btn.innerText == "Poner") {
        document.getElementById("textoRM").style.display = "block"
        btn.innerText = "Quitar";
    }
}


/**
 * Hace invisible el texto para el usuario en el DOM, pero sigue existiendo dentro de
 */
function visibleText() {
    let btn = document.getElementById("btnHD");
    if (btn.innerText == "Ocultar") {
        document.getElementById("textoRM").style.visibility = "hidden";
        btn.innerText = "Mostrar";
    }else if (btn.innerText == "Mostrar") {
        document.getElementById("textoRM").style.visibility = "visible";
        btn.innerText = "Ocultar";
    }
}

/**
 * Funcion para obtener datos por local storage
 */
function dataStorage(){
    let form = document.forms["formulario2"];
    console.log(form["nombre"]["value"]);
    console.log(form["apellido"]["value"]);
    localStorage.setItem(form["nombre"]["name"], form["nombre"]["value"]);
    localStorage.setItem(form["apellido"]["name"], form["apellido"]["value"]);
}


/**
 * Muestra los datos almacenados en las variables
 */
function showStorage(){
    let form = document.forms["formulario2"]
    form["nombre"]["value"] = localStorage.getItem(form["nombre"]["name"]);
    form["apellido"]["value"] = localStorage.getItem(form["apellido"]["name"]);

}