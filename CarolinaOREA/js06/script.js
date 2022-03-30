function obtenerFormulario(){
    let form = document.forms["formulario"];
    let concatenar = "";
    for(let i of form){
        concatenar = concatenar + " " + i.value;
    }
    console.log(concatenar);
    console.log(form["nombre"]["name"]);
    console.log(form["apellido"]["value"]);
    localStorage.setItem(form["nombre"]["name"], form["nombre"]["value"]);
    localStorage.setItem(form["apellido"]["name"], form["apellido"]["value"]); 
/**
 * Hace invisible el boton principal
 */
}
function setInvisible() {
    let botonFormulario = document.getElementById("todos");
    botonFormulario.style.visibility = "hidden";
}
/**
 * Oculta el boton principal del formulario
 */
function setOcultar(){
    let botonFormulario = document.getElementById("todos");
    botonFormulario.style.display = "none";

}
/**
 * Recupera losdatos de memoria
 */
function recuperar(){
    let formulario = document.forms["formulario"];
    console.log("Datos en memoria:", localStorage.getItem(formulario["nombre"]["name"]), localStorage.getItem(formulario["apellido"]["name"]));
    formulario["nombre"]["value"] = localStorage.getItem(formulario["nombre"]["name"]);
    formulario["apellido"]["value"] = localStorage.getItem(formulario["apellido"]["name"]);




}