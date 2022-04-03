console.log("Sesión Js06");

/**
 * Obtener los datos del formulario
 *
 */
function obtenerFormulario() {
  colorFondo = "blue";
  let formulario = document.forms["formulario"];
  //console.log(formulario);
  let concatenacion = "";
  for (let i of formulario) {
    //console.log (i.value);
    concatenacion = concatenacion + " " + i.value;
  }
  console.log(concatenacion);
  console.log(formulario["nombre"]["name"]);
  console.log(formulario["nombre"]["value"]);
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
 * Botón para recuperar los datos en memoria
 */
function recuperarFormulario() {
  let formulario = document.forms["formulario"];
  console.log(
    "Datos en la memoria ",
    localStorage.getItem(formulario["nombre"]["name"])
  );
  console.log(
    "Datos en la memoria ",
    localStorage.getItem(formulario["apellido"]["name"])
  );
  formulario["name"]["value"] = localStorage.getItem(
    formulario["nombre"]["value"]
  );
  formulario["apellido"]["value"] = localStorage.getItem(
    formulario["apellido"]["value"]
  );
}

/**
 * Ocultar el botón principal del formuario
 */
function setInvisible() {
  let botonFormulario = document.getElementById("todos");
  botonFormulario.style.visibility = "hidden";
}

/**
 *
 * Ocultar el boton principal del formulario
 */

function setOcultar() {
  let botonFormulario = document.getElementById("todos");
  botonFormulario.style.display = "none";
}

function recordatorio() {
  let array = ["dato1", "dato2", ["dato3", "dato4"]];
  let obtenerdato1 = array[0];
}