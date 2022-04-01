console.log("js07 apiFetch");



function userList(page = 1) {console.log("Se activo el boton de usuario");  /*se pego link de pag regres.in*/
    fetch(`https://regres.in/api/users?page=${page}`)
        .then((response) => response.json())
        .then (users => {
            console.log(users);
            let table = document.getElementById ("tBody");
                table.innerHTML ="";
                for (let user of users.data){
                table.innerHTML += `
                <tr>
                <td>${user.id}</td>
                <td>${user.first_name}</td>
                <td>${user.last_name}</td>
                <td>${user.email}</td>
                ><img src="${users.avatar}" class="rounded-circle" alt="avatar" style="width: 60px"></td>
                </tr> `;
                }
        })
        .catch((error)=> {
        console.error("Error: ", error);
        alerta(error);
        });
}

function postUser() {
  let formulario = document.forms["formulario"];
  console.log(`Datos a enviar:
  ${formulario.firts_name.value} -
  ${formulario.last_name.value} -
  ${formulario.email.value}
  `);
  let userData;
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
    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label"Close"></button>
    </div>
 `
    
}