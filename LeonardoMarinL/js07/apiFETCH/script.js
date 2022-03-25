console.log("js07 apiFETCH");

/**
 * this function allows to recover the array from de api and asign them to the function tabla(data)
 */
let page;
function busquedaUsuarios(page) {
  fetch(`https://reqres.in/api/users?page=${page}`)
    .then((response) => response.json())
    .then((data) => tabla(data))

    .catch((error) => {
      console.log("La solicitud causó error: ", error);
    });
}

/**
 * this function allows to print the values from the array data on a table and deploy back and forward buttons
 * @param {*} data 
 */
function tabla(data) {
  let contenido = document.getElementById("contenido");
  for (let cont of data.data) {
    contenido.innerHTML += `
    <tr class="row">
        <td class="col sm-col-12">${cont.id}</td>
        <td class="col sm-col-12">${cont.first_name}</td>
        <td class="col sm-col-12">${cont.last_name}</td>
        <td class="col sm-col-12">${cont.email}</td>
        <td class="col sm-col-12"><img class="imagen" src="${cont.avatar}"></td>
    </tr>`;
  }

  /**this is the creation of the Back button */
  document.getElementById("adelante").innerHTML = `
          <button
            onclick="atras()"
            type="button"
            class="btn btn-success boton1"
          >
            <= Back
          </button>`;
  /**this is the creation of the Next button */
  document.getElementById("atrás").innerHTML = `
          <button
            onclick="adelante()"
            type="button"
            class="btn btn-success boton1"
          >
            Next =>
          </button>`;
}

function atras(){
  document.page.innerHTML = -1;
};

function adelante(){
  document.page.innerHTML = +1;
};

/**
 * this function allows to clean the table and remove the back and forward buttons 
 */
function limpiarUsuarios() {
  contenido.innerHTML = "";
  let botonA =document.getElementById("adelante");
  botonA.innerHTML ="";
  let botonB = document.getElementById("atrás");
  botonB.innerHTML ="";
}
