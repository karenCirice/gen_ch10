console.log("JS07 apiFetch");

function Usuarios(page=1){
    //console.log("Se ha activado el boton de busqueda de usuarios");
    
    //fetch("https://reqres.in/api/users?page=2")

    //Este causa un error, no esta el usuario, es un error
    //fetch("https://regresMALITO.in/api/users/23") 

    fetch(`https://reqres.in/api/users?page=${page}`)
    .then( response => response.json())
    .then( users => {
        console.log(users);
        console.log(Array.isArray(users.data));
        console.log(users.data);


    let tBody = document.getElementById("tBody");
    //let img = createNode('img');
    tBody.innerHTML="";

    for (let data of users.data){
        console.log(data.data);
        tBody.innerHTML += `
        <tr>
        <th> ${data.id} </th>
        <td> ${data.email} </td>
        <td> ${data.first_name} </td>
        <td> ${data.last_name} </td>
        <td> <img src="${data.avatar}" class="rounded-circle" alt="avatar" style="width:80px" ></td>
        </tr>
      `;
    }
    })

    .catch (error => {
        console.log("Su solicitud ha causado un error:", error);
        alerta(error);
    });
}


  