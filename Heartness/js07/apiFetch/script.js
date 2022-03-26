console.log("JS Listo !!");

function direccionHTTPS(pagina=1){
    return`https://reqres.in/api/users?page=${pagina}`
}

function busquedaUsuarios(){
    console.log("Botón Funcionando");
    fetch(direccionHTTPS())
    //fetch("https://reqres.in/api/users?page=1")
    .then(response => response.json())
    .then( users => {
        console.log(users);
        console.log(Array.isArray(users.data));
        console.log(users.data);

        let tBody = document.getElementById("tBody");
        tBody.innerHTML = "";

        for(let data of users.data){
            console.log(users.data)
            tBody.innerHTML += `
            <tr>
            <td>${data.id}</td>
            <td>${data.email}</td>
            <td>${data.first_name}</td>
            <td>${data.last_name}</td>
            <td><img src="${data.avatar}" class="rounded-circle"></td>
            </tr>`;
        }
    })
    .catch(error => {
        console.log("La solicitúd causo error", error);
    })
}