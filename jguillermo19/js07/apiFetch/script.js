console.log("JS07 apiFetch")

function userList(page=1){
    fetch(`https://reqres.in/api/users?page=${page}`)
    .then(response => response.json())
    .then(users => {
        console.log(users);
        let table = document.getElementById("tBody");
        table.innerHTML="";
        for(let user of users.data){
            table.innerHTML += `
            <tr>
                <td>${user.id}</td>
                <td>${user.first_name}</td>
                <td>${user.last_name}</td>
                <td>${user.email}</td>
                <td>img src="${user.avatar}" class="rounded-circle" alt="avatar" style="widh:60px"</td>
            </tr>`
        }
    })
    .catch((error) => {
        console.error("Error: ",error);
        alert(error);
    })
}

function busquedaUsuarios(page=1){
    //console.log("Funcion boton");
    //fetch(`https://reqresMALITO.in/api/users?page=${page}`)
    fetch(`https://reqres.in/api/users?page=${page}`)
    .then(response => response.json())
    .then(users => {
        console.log(users)
    })
    .catch(error => {
        console.log("La solicitud causo error: ",error)
    }

    )
}