console.log("js07 apiFETCH");

/**
 * this function allows to recover the array from de api and print the values from its array "data", 
 * which contains user's information
 */
function busquedaUsuarios() {
  fetch("https://reqres.in/api/users?page=1")
    .then((response) => response.json())
    .then((data) => tabla(data))

    .catch((error) => {
      console.log("La solicitud causó error: ", error);
    });
}

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
}

/**
 * this function allows to clean the table
 */
function limpiarUsuarios() {
  contenido.innerHTML = "";
}
