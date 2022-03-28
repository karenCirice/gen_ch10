console.log("js07 apiFETCH");

/**
 * this function allows to recover the array from de api and asign them to the function tabla(data)
 */
let page = 1;
function busquedaUsuarios(page) {
  fetch(`https://reqres.in/api/users?page=${page}`)
    .then((response) => response.json())
    .then((data) => tabla(data))

    .catch((error) => {
      console.log("La solicitud causó error: ", error);
    });
}

/**
 * this function allows to print the values from the array data on a table and deploy the Next button
 * @param {*json} data
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

  /**this is the creation of the Next button */
  document.getElementById("adelante").innerHTML = `
          <button
            onclick="adelante()"
            type="button"
            class="btn btn-success boton1"
          >
            Next =>
          </button>`;
  document.getElementById("search").disabled = true;
}

/**
 * This function cleans the table and deploys the previous page of the json
 */
function atras() {
  document.getElementById("contenido").innerHTML = "";
  fetch(`https://reqres.in/api/users?page=${(page -= 1)}`)
    .then((response) => response.json())
    .then((data) => tabla(data))

    .catch((error) => {
      console.log("La solicitud causó error: ", error);
    });
}

/**
 * This function cleans the table, deploys the next page and creates the Back button
 */
function adelante() {
  document.getElementById("contenido").innerHTML = "";
  fetch(`https://reqres.in/api/users?page=${(page += 1)}`)
    .then((response) => response.json())
    .then((data) => tabla(data))

    .catch((error) => {
      console.log("La solicitud causó error: ", error);
    });

  /**this is the creation of the Back button */
  document.getElementById("atrás").innerHTML = `
          <button
            onclick="atras()"
            type="button"
            class="btn btn-success boton1"
          >
            <= Back
          </button>`;
}

/**
 * this function allows to clean the table, remove the back and forward buttons, rehabilitate the search button and set back page value to 1
 */
function limpiarUsuarios() {
  contenido.innerHTML = "";
  document.getElementById("adelante").innerHTML = "";
  document.getElementById("atrás").innerHTML = "";
  document.getElementById("search").disabled = false;
  page = 1;
}
