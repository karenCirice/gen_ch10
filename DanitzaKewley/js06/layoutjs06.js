/* Comprobar que esta linkeado al html */
console.log("Sesión Js06");

/* Funcion para obtener datos de formularios */
function obtenerFormulario() {
  let formulario = document.forms["formulario"];
  //console.log(formulario);
  let concatenacion = "";
  for (let i of formulario) {
    //console.log(i.value);
    concatenacion = concatenacion + " " + i.value;
  }
  console.log(concatenacion);
}

/**
 * Poner invisible el botón principal del formuulario
 */
function setInvisible(){
  let botonFormulario = document.getElementById("todos");
  botonFormulario.style.visibility = "hidden";
}

/**
 * Oculta el botón principal del formulario
 */
function setOcultar(){
  let botonFormulario = document.getElementById("todos");
  botonFormulario.style.display = "none";
}