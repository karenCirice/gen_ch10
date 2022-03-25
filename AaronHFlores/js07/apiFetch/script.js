console.log("Conexion");
function searchUsers() {
    fetch("https://reqres.in/api/users?page=2")
        .then(response => response.json())
        .then(users => {
            console.log(users);
            let tBody = document.getElementById("tBody");

            for (const us of users.data) {
                tBody.innerHTML += `
                <tr>
                <td>${us.id}</td>
                <td>${us.first_name}</td>
                <td>${us.last_name}</td>            
                <td>${us.email}</td>                 
                <td><img src = ${us.avatar}></td>
                </tr>`;
            }
        })
        .catch(error => {
            console.log("La solicitud causo error", error);
        })
}