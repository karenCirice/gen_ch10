function busquedaUsuarios() {
    // console.log("Se activo el buton de usuarios")
    // console.log(`Multiplicación: ${3*3} y esto es una división ${4/2} `);

    fetch(`https://reqres.in/api/users?page=2`)
    .then(response => response.json())  //users = response.json();
    .then((users) => {
        console.log(users);
        let tabla = document.getElementById("tBody");
        tabla.innerHTML = "";

        for(let user of users.data){
        tabla.innerHTML += ` 
        <tr>
        <td class="text-warning bg-dark">${user.id}</td> 
        <td class="text-light bg-dark">${user.email}</td>
        <td class="text-warning bg-dark">${user.first_name}</td>
        <td class="text-light bg-dark">${user.last_name}</td>
        <td class="text-warning bg-dark"><img src="${user.avatar}"class="rounded-circle" alt="avatar"</td>
        </tr>`;
        }
    })

    .catch(error => {
        console.log("La solicitud causa error"+error)
    })
    
}      

