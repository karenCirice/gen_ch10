 function buscarUsuarios(page=1){
     console.log("se activo boton");

     fetch(`https://reqres.in/api/users?page=${page}`)
     .then(response => response.json())
     .then(users => {
         console.log(users);

         let tbody = document.getElementById("tbody");
         for (let user of users.data){
            tbody.innerHTML += `
        <tr>
          <td>${user.id}</td>
          <td>${user.first_name}</td>
          <td>${user.last_name}</td>
          <td>${user.email}</td>
          <td><img src="${user.avatar}" width="50px" class="img-fluid rounded-circle"></td>

        </tr>`;
         }
     })
     .catch(error => {
         console.log("La solicitud causo error: ", error);
     })
 }