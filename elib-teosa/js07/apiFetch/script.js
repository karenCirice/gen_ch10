console.log('Inicia mi script');

//Podemos inicializar los parametros para aplicarlo en caso de que el usuario 
// no ingrese algo en ese mismo parametro, este será el valor por default
/**
 * @function busquedaUsuarios Implementa apiFetch para leer datos de una api externa y luego listar esta en una tabla dentro de index.thml
 * @param {numeric} page 
 */
function busquedaUsuarios(page=1) {
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
                <td><img class="img-fluid rounded-circle" width="50rem" src="${user.avatar}" /></td>
            </tr>`
            ;
        }
    })
    .catch(error => {
        console.error('Error: ', error);
    })

}