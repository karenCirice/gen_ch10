console.log ("JS07 apiFetch");

/**
 * La fuction es ingresar usuarios de una pagína de un servidor en una tabla.
 * JSON “define seis tipos de valores: nulo, números, cadenas, booleanos, matrices y objetos”.
 * @param {*} page 
 * @param img class="rounded-circle" clase agrega esquinas redondeadas a una imagen
 */

function busquedaUsuarios(page=1){
    //console.log("Se activo el boton de busqueda de usuarios");

    fetch ( `https://reqres.in/api/users?page=${page}`)
   .then(response => response.json())
    .then(users =>{
        console.log(users.data);
        
        let tBody = document.getElementById("tBody");
       
        for (let user of users.data) {
            console.log("User: ", user);
            tBody.innerHTML += `
            <tr>
              <td>${user.id}</td>
              <td>${user.first_name}</td>
              <td>${user.last_name}</td>
              <td>${user.email}</td>
              <td><img src="${user.avatar}" class="rounded-circle" alt="Circle image"}></img></td> 
            </tr>`;         
        }


    })
    .catch(error =>{
        console.log("La solicitud causo error: ", error);
    })
}
