console.log("JS07 apiFetch");

function busquedaUsuarios() {
    //console.log(se activo el boton)

    //fetch("https://reqres.in/api/users?page=${page}")
    fetch("https://reqres.in/api/users?page=2")
        .then(response => response.json())
        .then(users => {
            console.log(users);
            console.log(Array.isArray(users.data));
            console.log(users.data);

        let tbody = document.getElementById("tbody")
        tbody.innerHTML = "";

        for (let data of users.data) {
            console.log(users.data);
            tbody.innerHTML += `
        <tr>
        <td>${data.id}</td>
          <td>${data.email}</td>
          <td>${data.first_name}</td>
          <td>${data.last_name}</td>
          <td><img src="${data.avatar}" class="rounded-circle" alt="Eniun"></td>
        </tr>`;
        }

    })

.catch (error => {
    console.log("La solicitud causo un error", error);
    })

}
