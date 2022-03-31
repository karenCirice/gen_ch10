console.log("js07 apiFETCH");

/**
 * this function allows to recover the array from de api and asign them to the function tabla(data)
 */
let page=1;
document.getElementById("atrás").style.visibility="hidden";
document.getElementById("adelante").style.visibility="hidden";
document.getElementById("clear").style.visibility="hidden";

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
  console.log("Página en curso: ",data.page); 
  console.log("Total de páginas: ",data.total_pages);
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
  document.getElementById("search").style.visibility = "hidden";
  document.getElementById("adelante").style.visibility="visible";
  document.getElementById("clear").style.visibility="visible";
}

/**
 * This function cleans the table and deploys the previous page
 */
function atras() {
  document.getElementById("contenido").innerHTML = "";
  fetch(`https://reqres.in/api/users?page=${(page -= 1)}`)
    .then((response) => response.json())
    .then((data) => tabla(data))

    .catch((error) => {
      console.log("La solicitud causó error: ", error);
    });
    if (page==1){
      document.getElementById("atrás").style.visibility="hidden";
    }
}

/**
 * This function cleans the table and deploys the next page
 */
function adelante() {
  document.getElementById("contenido").innerHTML = "";
  fetch(`https://reqres.in/api/users?page=${(page += 1)}`)
    .then((response) => response.json())
    .then((data) => tabla(data))

    .catch((error) => {
      console.log("La solicitud causó error: ", error);
    });
    if (page>1){
      document.getElementById("atrás").style.visibility="visible";
    }
}

/**
 * this function allows to clean the table and rehabilitate the search button
 */
function limpiarUsuarios() {
  contenido.innerHTML = "";
  document.getElementById("search").style.visibility = "visible";
  document.getElementById("adelante").style.visibility="hidden";
  document.getElementById("clear").style.visibility="hidden";
  document.getElementById("atrás").style.visibility="hidden";
  page = 1;
}
