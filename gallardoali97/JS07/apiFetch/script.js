console.log("js07 apiFetch"); //Imprimimos en consola mensaje para corroborar que vinculamos el JS
let pagina=null;              //Se declara variable página para leer todos los usuarios de ambas páginas
function pagina1(){           //Funciones para botón de cada página
     pagina=1;
     busquedaUsuarios();      //Accedemos a la función de búsqueda al dar click
}
function pagina2(){           
     pagina=2;
     busquedaUsuarios();
}

function busquedaUsuarios() {                    //Función de botón "Leer Usuarios"
   
    fetch(`https://reqres.in/api/users?page=${pagina}`)    
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
                <td><img src="${data.avatar}" class="rounded-circle" alt="Cinque Terre"></td>  
              </tr>
                `;
            }
        })
        .catch((error) => {
            console.error("Error: ", error);      //Atrapamos el error en caso de no poder leer a los users
            alert(error);
        });
}
//Alí G@llardo