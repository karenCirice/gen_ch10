console.log("JS07 apiFetch");

function busquedaUsuarios() {
    //console.log("Se activo el boton de busqueda de usuarios");

    fetch('https://reqres.in/api/users?page=1')
    .then( response => response.json())
    .then( users => {
        console.log(users);
        console.log(Array.isArray(users.data));

        let tBody = document.getElementById("tBody");
        tBody.innerHTML = "";

        for (let user of users.data) {
            tBody.innerHTML += `
            <tr>
                <td>${user.id}</td>
                <td>${user.first_name}</td>
                <td>${user.last_name}</td>
                <td>${user.email}</td>
                <td><img src ="${user.avatar}" class="rounded-circle"></td>
            </tr>`;
        }
        
    });
} 

/**Hacer una tabla de usuarios en una tabla */