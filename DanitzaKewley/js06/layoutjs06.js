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
  console.log(formulario["nombre"]["name"]);
  console.log(formulario["nombre"]["value"]);
  console.log(formulario["apellido"]["name"]);
  console.log(formulario["apellido"]["value"]);
  localStorage.setItem(
    formulario["nombre"]["name"],
    formulario["nombre"]["value"]
  );
  localStorage.setItem(
    formulario["apellido"]["name"],
    formulario["apellido"]["value"]
  );
}

/**
 * Recuperación de los datos en memoria
 */
function recuperarFormulario(){
  let formulario = document.forms["formulario"];
  console.log ("Datos en memoria: ", localStorage.getItem(formulario["nombre"]["name"]));
  console.log ("Datos en memoria: ", localStorage.getItem(formulario["apellido"]["name"]));
  formulario["nombre"]["value"] = localStorage.getItem(formulario["nombre"]["name"]);
  formulario["apellido"]["value"] = localStorage.getItem(formulario["apellido"]["name"]);

}

/**
 * Poner invisible el botón principal del formuulario
 */
function setInvisible() {
  let botonFormulario = document.getElementById("todos");
  botonFormulario.style.visibility = "hidden";
}

/**
 * Oculta el botón principal del formulario
 */
function setOcultar() {
  let botonFormulario = document.getElementById("todos");
  botonFormulario.style.display = "none";
}
