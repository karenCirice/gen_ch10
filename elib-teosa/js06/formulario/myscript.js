console.log("Se inicio mi Script");

/**
 * @function obtenerFormulario Obtiene el formulario desde el documento HTML
 * mediante su id. Son esto tiene acceso a cada elemento en él y es capaz de
 * concatenar cada valor en una cadena, lo que permite la impresión en una línea.
 * También, guarda los datos en el formulario en localStorage según su llave e información.
 */
function obtenerFormulario() {
  let form = document.forms["formulario"];
  let cadena = "";
  for (const iterator of form) {
    //console.log(iterator.value);
    cadena += " " + iterator.value;
  }
  console.log(cadena);
  console.log(form["nombre"]["name"]);
  console.log(form["nombre"]["value"]);
  console.log(form.apellido.value);
  localStorage.setItem(form["nombre"]["name"], form["nombre"]["value"]);
  localStorage.setItem(form["apellido"]["name"], form["apellido"]["value"]);
}

/**
 * @function recuperarFormulario Recupera los datos guardados en localStorage obtenidos del formulario.
 * También, recupera los datos almacenados en el localStorage según su llave.
 */
function recuperarFormulario() {
  let form = document.forms["formulario"];
  console.log(
    "Datos en memoria: ",
    localStorage.getItem(form["nombre"]["name"]),
    localStorage.getItem(form["apellido"]["name"])
  );
  form["nombre"]["value"] = localStorage.getItem(form["nombre"]["name"]);
  form["apellido"]["value"] = localStorage.getItem(form["apellido"]["name"]);
}

/**
 * @function setInvisible Hace invisible al botón con el id 'todos' con el atributo
 * de estilo visibility = "hidden".
 */
function setInvisible() {
  let botonFormulario = document.getElementById("todos");
  botonFormulario.style.visibility = "hidden";
}

/**
 * @function setOcultar Oculta el botón con el id 'todos' mediante el atributo de
 * estilo display = 'none'
 */
function setOcultar() {
  let botonFormulario = document.getElementById("todos");
  botonFormulario.style.display = "none";
}
