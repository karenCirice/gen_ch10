console.log('sesion js06');
/**
 * Obtiene los datos del formulario
 */
/**
 * Hacer esto, es considerado muy buena practica.
 * @param {string} colorFondo  Dtermina el color de fondo
 */


function obtenerFormulario(colorFondo) {
  colorFondo = "blue";
  let formulario = document.forms["formularios"];
  //console.log(formulario);
  let concactenacion = "";
  for (let i of formulario) {
    //console.log(i.value);
    concactenacion = concactenacion + " " + i.value;
    console.log(concactenacion);
    //console.log(i.name + ": " + i.value);
  }
  console.log(formulario["nombre"]["name"]);
  console.log(formulario["apellido"]["value"]);
  localStorage.setItem(formulario["nombre"]["name"], formulario["nombre"]["value"]);
  localStorage.setItem(formulario["apellido"]["apellido"], formulario["apellido"]["value"]);
}

function recuperarFormulario() {
  let formulario = document.forms["formularios"];
  console.log("datos en memoria: ", localStorage.getItem(formulario["nombre"]["name"]));
  console.log("datos en memoria: ", localStorage.getItem(formulario["apellido"]["name"]));
  formulario["nombre"]["value"] = localStorage.getItem(formulario["nombre"]["name"]);
  formulario["apellido"]["value"] = localStorage.getItem(formulario["apellido"]["apellido"]);

}

//obtenerFormulario();

/**
 * Pone invisible el boton principal del formulario
 */
function setInvisible() {
  let botonFormulario = document.getElementById("todos");
  botonFormulario.style.visibility = "hidden";
}

/**
 * Pone oculto el boton principal del formulario
 */

function setOcultar() {
  let botonFormulario = document.getElementById("todos");
  botonFormulario.style.display = "none";
}


function recordatorio() {
  let array = [dato1, dato2, dato3];
  let objeto = {
    clave1: "dato1",
    clave2: ["dato1", "dato2", "dato3"],
    clave3: {
      claveinterna1: 16,
      claveinterna2: "datoobjeto2"
    }
  };
}