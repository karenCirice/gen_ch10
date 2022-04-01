console.log("Iniciando script...")

function busquedaUsuarios() {

    fetch("https://reqres.in/api/users?page=2")
        .then(response => response.json())
        .then(users => {
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
                    <td>
                        <div 
                            style = "
                                width: 100px;
                                height: 100px;
                                position: relative;
                                overflow: hidden;
                                border-radius: 50%;
                            ">

                            <img 
                                style = "
                                    display: inline;
                                    margin: 0 auto;
                                    margin-left: -25%; //centers the image
                                    height: 100%;
                                    width: auto;"
                                src = "${user.avatar}">
                        </div>
                    </td>
                <tr>
            `;
            }
        })



    //.catch (error => {
    //console.log("La solicitud causó un error", error);
    //})
}

function postUser() {
    let formulario = document.forms["formulario"];

    let jsonData = JSON.stringify({ "name": "Leonardo", "job": "Leader", "email": "john@gmail.com" })

    console.log(`Datos a enviar":
        ${formulario.first_name.value}
        ${formulario.last_name.value}
        ${formulario.email.value}`
    );

    fetch("https://reqres.in/api/users?page=2", {
        method: "POST",
        body: jsonData
    })
    .then((response) => response.json())
    .then((data) => {
        console.log("Success: ", data);
        console.log("Fecha: ", data.createdAt);
    })
    .catch((error) => {
        console.error("Error " , error);
        //alerta(error);
    });
}