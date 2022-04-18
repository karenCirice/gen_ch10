console.log("Bienvenido JS07");
//console.log("Multiplicación "+ (3*3) + " y esto es una división "+ 4/2);
//console.log( `Multiplicación: ${3*3} y esto es una división ${4/2}` );
function direcccionHTTPS(pagina) {
  return `https://reqres.in/api/users?page=${pagina}`
}

function userList(nPagina=1 ) {
  //fetch(`https://reqres.in/api/users?page=${page}`)
   fetch (direcccionHTTPS())
    .then((response) => response.json())     // user = response.json();
    .then((users) => {
      console.log(users);
      let table = document.getElementById("tbody");
      table.innerHTML = "";
      for (let user of users.data) {
        table.innerHTML += `
          <tr>
            <td>${user.id}</td>
            <td>${user.first_name}</td>
            <td>${user.last_name}</td>
            <td>${user.email}</td>
            <td><img src="${user.avatar}" class="rounded-circle" alt="avatar" style="width: 60px" ></td>          
           </tr> `;
      }
    })
    .catch((error) => {
      console.error("Error: ", error);
      alerta(error);
    });
}
//<td><img src="${user.avatar}" class="rounded-circle" alt="avatar" style="width: 60px"></td>
function postUser() {
  let formulario = document.forms["formulario"];
  
  console.log(`Datos a enviar: 
    ${formulario.first_name.value} - 
    ${formulario.last_name.value} -
    ${formulario.email.value}
    `);
  //console.log(formulario);
  let datosJson =JSON.stringify({name: "John", job: "leader", email: "john@email.com"});
  console.log(datosJson);

  fetch("https://reqres.in/api/users", {
    method: "POST",
    body: datosJson,
  })
    .then((response) => response.json())
    .then((data) => {
      console.log("Success: ", data);
      console.log("Fecha de creación: ", data.createdAt);
    })
    .catch((error) => {
      console.error("Error: ", error);
      //alerta(error);
    });
}

function alerta(error) {
  let message = document.getElementById("message");

  message.innerHTML = "";
  message.innerHTML += `
        <div class="alert alert-warning alert-dismissible fade show" role="alert">
         <strong>${error}</strong>
         <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
        </div>
         `;
}