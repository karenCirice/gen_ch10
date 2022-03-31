console.log("Sí funciona :)");

function busquedaUsuarios() {

    //console.log("Se activo el botón de búsqueda de usuarios");
    fetch(`https://reqres.in/api/users?page=1`)
        .then(response => response.json())
        .then(users => {
            
            
            
            console.log(users);
        
            let tBody = document.getElementById("tBody");
            tBody.innerHTML = "";
            
            for (let data of users.data) {
                console.log(data.data);
                tBody.innerHTML += `
                <tr>
                <td>${data.id}</td>
                <td>${data.first_name}</td>
                <td>${data.last_name}</td>
                <td>${data.email}</td>
                <td><img src="${data.avatar}" class="rounded-circle" alt="..."></td>
              </tr>
                `;
            }
        });

      
   
}

let limpiarPantalla = () =>
  (document.getElementById("tBody").innerHTML = ``);