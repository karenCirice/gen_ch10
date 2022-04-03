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
function postUser(){
    let formulario = document.forms["formulario"];
    
    fetch("https://reqres.in/api/users", {
        method: "POST",
        body: {
            first_name: formulario.first_name.value,
            last_name: formulario.last_name.value,
            email: formulario.email.value,
        }        
    })
    .then((response) => response.json())
    .then((data) => {

    })    
    .catch(error => {
        console.log("La solicitud causo error", error);
        alerta(error);
    })

    //console.log(formulario);
    /* let datosJson =JSON.stringify({name: "John", job: "leader", email: "john@email.com"});
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
        alerta(error);
        });
    } */

}