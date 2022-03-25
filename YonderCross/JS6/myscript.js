/** 
 * obtiene
 * @param{string} formulario determina el color
 */
function miform(){

    let formulario = document.forms["formulario"];
    let conca = "";
    for (let i of formulario) {  
        conca = conca + " " + i.value;
    }
    console.log(conca);
    console.log(formulario["nombre"]["name"]);
    console.log(formulario["nombre"]["value"]);
    console.log(formulario["apellido"]["name"]);
    console.log(formulario["apellido"]["value"]);
    localStorage.setItem(formulario["nombre"]["name"],formulario["nombre"]["value"]);
    localStorage.setItem(formulario["apellido"]["name"],formulario["apellido"]["value"]);
}

function recForm(){
    let formulario = document.forms["formulario"];
    console.log("Datos en memoria: ",localStorage.getItem(formulario["nombre"]["name"]), localStorage.getItem(formulario["apellido"]["name"]));
    formulario["nombre"]["value"] = localStorage.getItem(formulario["nombre"]["name"]);
    formulario["apellido"]["value"] = localStorage.getItem(formulario["apellido"]["name"]);
}

/*
*Hace invisible el boton principal
*/
function setInvisible(){
    let invisible = document.getElementById("todos");
    invisible.style.visibility="hidden";
}
/**
 * Oculta el boton principal
 */
function setOcultar(){
    let ocultar= document.getElementById("todos");
    ocultar.style.display = "none"
}
