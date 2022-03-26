console.log("apiFetch");

function busquedaUsuarios() {
    // console.log("Se activo el boton busqueda de usuarios");

    fetch(`https://reqres.in/api/users?page=1`)
        .then(response => response.json())
        .then(users => {
            console.log(users);
            let tBody = document.getElementById("tBody");
            tBody.innerHTML = "";
            for (let user of users.data) {
                console.log(user.id);
                tBody.innerHTML += `
            <tr>
    <td>${user.id}</td>
    <td>${user.first_name}</td>
    <td>${user.last_name}</td>
    <td>${user.email}</td>
    <td><img src="${user.avatar}" class= "rounded-circle" alt="avatar" style="width: 70px"></td>
    </tr> `
            }
        })
        .catch(error => {
            console.log("La solicitud causo error", error);
        })
}