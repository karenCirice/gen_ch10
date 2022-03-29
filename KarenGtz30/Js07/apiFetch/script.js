console.log("Js07 apiFetch");

function busquedaUsuarios(page = 1) {

    fetch("https://reqres.in/api/users?page=2")
        .then(response => response.json())
        .then(users => {
            console.log(users.data);

            let tBody = document.getElementById("tBody");

            for (let user of users.data) {
                console.log("User: ", user);
                tBody.innerHTML += `
                <tr class="lostd">
                    <td>${user.id}</td>
                    <td>${user.first_name}</td>
                    <td>${user.last_name}</td>
                    <td>${user.email}</td>
                    <td> <img src = "${user.avatar}" class="rounded-circle" alt="avatar"> </td>
                <tr> `;
            }
        })

        .catch(error => {
            console.log("La solicitud causo error: ", error);
        })
}

