console.log ("sesión js06")
function obtenerFormulario(){
    let formulario = document.forms["formulario"];
    let concatenacion = "";
    for (let i of formulario){
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

  console.log(concatenacion);
  console.log(formulario["nombre"]["name"]);
  console.log(formulario["nombre"]["value"]);
  localStorage.setItem(formulario["nombre"]["name"], formulario["nombre"]["value"]);
  localStorage.setItem(fomulario["apellido"]["name"],formulario["apellido"]["value"]);

  /**
   * Recuperación de los datos en memoria 
   */
  function recuperarFormulario(){
      let formulario=document.forms["formulario"];
      console.log ("Datos en memoria:",localStorage.getItem(formulario["nombre"]["name"]));
      formulario["nombre"]["value"]=localStorage.getItem(formulario["nombre"]["name"]);
  }


  
