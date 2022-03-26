console.log('Inicia mi script');

//Podemos inicializar los parametros para aplicarlo en caso de que el usuario 
// no ingrese algo en ese mismo parametro, este será el valor por default
function busquedaUsuarios(page=1) {
    //console.log('Se activó el botón búsqueda de usuarios');

    let tbody = document.getElementById("tbody");
    tbody.innerHTML = "";

    fetch(`https://reqres.in/api/users?page=${page}`)
    .then(response => response.json())
    .then(users => {
        console.log(users);
        for (const user of users.data) {
            tbody.innerHTML += `
            <tr>
                <td>${user.id}</td>
                <td>${user.first_name}</td>
                <td>${user.last_name}</td>
                <td>${user.email}</td>
                <td><img class="img-fluid rounded-circle shadow" src="${user.avatar}" /></td>
            </tr>`
            ;
        }
    })
    .catch(error => {
        console.log('Error: ', error);
    });
}

function postUser() {
    let formulario = document.forms['formulario'];
    console.log(`Datos a enviar: ${formulario.first_name.value} - `);
}