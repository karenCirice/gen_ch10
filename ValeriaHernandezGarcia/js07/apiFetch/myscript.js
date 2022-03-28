console.log("JS07 apiFetch");

function busquedaUsuarios(page=1){
    //console.log("Se activó el botón de búsqueda de usuarios");

    //https://reqres.in/api/users?page=2 DIRECCIÓN USUARIOS

    //Lo que es el GET

    fetch (`https://reqres.in/api/users?page=${page}`)
    //fetch ("https://reqresMALITO.in/api/users/23")
    .then( response => response.json())
    .then( users => 
     tabla(users)
        //console.log(users)
    )
    }

    function tabla(users){
        let tBody = document.getElementById("tBody");

    for (let user of users.data){
        console.log("User: ", user);
         tBody.innerHTML += `
   
           <tr>
             <td>${user.id}</td>
             <td>${user.first_name}</td>
             <td>${user.last_name}</td>
             <td>${user.email}</td>
             <td><img src="${user.avatar}" class="rounded-circle" alt="avatar" </td>
           </tr> `;
     }
    }
        
 //.catch (error => {
        //console.log("La solicitud causo error: ", error);

        //Lo que es el POST

        /*
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

         */
          