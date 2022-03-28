function busquedaUsuarios() {
  let pagina = parseInt(document.getElementById("select-pagina").value);

  console.log(typeof pagina, pagina);

  
    fetch(`https://reqres.in/api/users?page=${pagina}`)
      .then((result) => result.json())
      .then((users) => {
        limpiarPantalla();
        tabla(users);
      })
      .catch((error) => {
        console.log(`Error showed with ${error}`);
      });
  
}

function tabla(users) {
  let contenido = document.getElementById("contenido");

  for (const usuario of users.data) {
    contenido.innerHTML += `
        <tr class="fila-tabla">
          <td class="elemento-tabla" id="elemento-usuario" >${usuario.id}</td>
          <td class="elemento-tabla" id="elemento-email">${usuario.email}</td>
          <td class="elemento-tabla" id="elemento-name">${usuario.first_name}</td>
          <td class="elemento-tabla" id="elemento-lastName">${usuario.last_name}</td>
          <td class="elemento-tabla" id="elemento-avatar"><img class="elemento-imagen rounded-circle" src="${usuario.avatar}"></td>
        </tr>
        `;
  }
}

let limpiarPantalla = () =>
  (document.getElementById("contenido").innerHTML = ``);
