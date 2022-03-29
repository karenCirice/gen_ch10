console.log("JS 07 API Fetch")
function busquedaUsuarios() {
    //console.log("Se activo el boton de busqueda de usuarios")

    //fetch("https://reqres.in/api/users?page=2")
    fetch("https://reqres.in/api/tt?page=8")
        .then(response => response.json())
        .then(users => {
            console.log(users);
        })
        .catch(error => {
            console.log("La solicitud causo un error: ", error);
        })
}

let datosJson = JSON.stringify({ name: "John", job: "leader", email: "john@email.com" });
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
        //alerta(error);
    });

