console.log("js07");

/**
 * Nos regresa los datos de usuarios desde una api
 * @param {object} page devuelve los datos del usuario en la posicion x
 */
function searchUser(page = 1) {

    // solicitud de una api desde internet.
    fetch(`https://reqres.in/api/users?page=${page}`)
        // response es una varieble que se convierte a json
        .then(response => response.json())
        .then(users => {  //users = response.json()
            console.log(users);

            let tBody = document.getElementById('tbody');
            tBody.innerHTML = "";

            for (let user of users.data) {

                console.log(user.id);
                tBody.innerHTML +=

                // se crea la tabla con los datos de la api
                    `
                <tr>
                    <td>${user.id}</td>
                    <td>${user.first_name}</td>
                    <td>${user.last_name}</td>
                    <td>${user.email}</td>
                    <td><img src ="${user.avatar}" class="rounded-circle" alt="avatar" style="width:65px"></td>
                </tr>
                    `
            }

        })
        //   cuando no se encuntre la dirrecion 
        .catch(error => {
            console.log("La solicitud causa error:", error);
        });
};


// POST

// function postUser() {
//     let formulario = document.forms["formulario"];

//     fetch("https://reqres.in/api/users"), {
//         method: "POST",
//         body: {
//             first_name: formulario.first_name.value,
//             last_name: formulario.last_name.value,
//             email: formulario.email.value,
//         }
//     }


// }



