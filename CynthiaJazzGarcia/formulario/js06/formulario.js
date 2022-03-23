console.log("sesion Js06");

/**
 * Obtiene los datos del formulario
 * @param {boolean} colorFondo Determina el color del formulario
 */
function obtenerFormulario(colorFondo){
  colorFondo = "blue"
    let formulario = document.forms["formulario"];
  //  console.log(formulario);
   let concatenacion; 
   for (let i of formulario){
      //  console.log(i.value);/*para obtener rapido todos los datos se escribe. value*/ /*para unir todo los valores sin espacio:*/
        concatenacion = concatenacion + "" + i.value/*importante inicializar */;
    }
    console.log(concatenacion);
    console.log(formulario.nombre.name);
    console.log(formulario.apellido.value);
    localStorage.setItem(formulario["nombre"]["value"],formulario["nombre"]["value"]);
    localStorage.setItem(formulario["apellido"]["name"],formulario["apellido"]["value"]);
/**lOCAL NECESITA VALOR, ASI SE RECUPERA */
}

/**
 * Recuperacion de los datos en memoria
 */
function recuperarFormulario(){
  let formulario = document.form["formulario"];
  console.log("Datos en memoria: ",localStorage.getItem(formulario["nombre"]["name"]));
  formulario["nombre"]["value"] = localStorage.getItem(formulario["nombre"]["name"]);
  formulario["apellido"]["value"] = localStorage.getItem(formulario["apellido"]["name"]);
}

/**
 * Pone invisible al boton principal del formulario
 */
function setInvisible(){
  let botonFormulario= document.getElementById("todos");
  botonFormulario.style.visibility = "hidden";

}
/**
 * oculta el boton principal del formulario
 */
function setOcultar(){
  let botonFormulario= document.getElementById("todos");
  botonFormulario.style.display = "none";
}

//obtenerFormulario();

/**
 * Formato JSON:
 */
function recordatorio(){
  let array = ["dato1", "dato2", "dato3"];
  let objeto = {
    clave: true, 
    clave2:["dato1", "dato2", "dato3"], 
    clave3:{ 
      claveInterna1:16, 
      claveInterna2:"datoob2"}
    };
    
}