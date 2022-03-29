console.log('Inicia mi script');

/*Podemos inicializar los parametros para aplicarlo en caso de que el usuario no ingrese algo en ese mismo parametro, este será el valor por default*/
function userList(page=1) {
    fetch(`https://reqres.in/api/users?page=${page}`)
    .then(response => response.json())
    .then(users => {
        console.log(users);
        let table = document.getElementById("tbody");
        table.innerHTML = "";
        for (const user of users.data) {
            table.innerHTML += `
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
        console.error('Error: ', error);
    });
}

// la función de JSON.stringify() convierte un objeto o valor de JavaScript en una cadena de texto JSON
let datosJson = JSON.stringify({
    name:'Jhon',
    job: 'Architech',
    email: 'jhon@gmail.com'
});

// metodo post para crear un nuevo usuario
function postUser() {
    let formulario = document.forms['formulario'];
    console.log(`Datos a enviar: ${formulario.first_name.value} - ${formulario.last_name.value} - ${formulario.email.value}`);

    fetch('https://reqres.in/api/users', {
        //se indica el tipo de peticion
        method: 'POST',
        body: {
            first_name: formulario.first_name.value,
            last_name: formulario.last_name.value,
            email: formulario.email.value,
        },
    })
    .then(response => response.json())
    .then(data =>{
        console.log('Success: ', data);
        console.log('Fecha de creación: ', data.createdAt);
    })
    .catch(error =>{
        console.error('Error: ', error);
    })
}