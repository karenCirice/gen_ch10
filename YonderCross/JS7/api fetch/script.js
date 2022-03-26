console.log("JS7 apifetch");

/* function busquedaUsuarios(page=1){
//  console.log("se activo mi boton"); //
//   fetch(`https://reqres.in/api/users?page=${page}`)//
    fetch(`https://reqres.in/api/users/23`)
    .then(response => response.json())
    .then( users=>{
        console.log(users)
    })
    .catch ( error => {
        console.log("La solicitud da error", error);
    })
} */


function  userList(page=1){
    fetch(`https://reqres.in/api/users?page=${page}`)
        .then( (response) => response.json())
        .then( (users) =>{
            console.log(users);

        let table = document.getElementById("tBody");
        tBody.innerHTML= "";
        
        for(let user of users.data){
            table.innerHTML += `
            <tr>
            <td>${user.id}</td>
            <td>${user.first_name}</td>
            <td>${user.last_name}</td>
            <td>${user.email}</td>
            <td><img src="${user.avatar}" class="rounded-circle" style="width: 60px"></td>
          </tr> `
        }
        })
        .catch((error) => {
            console.error("Error: ", error);
            alerta(error);
        })
}

function postUser(){
    let formulario = document.forms["formulario"];
    console.log("Datos a enviar:")
}