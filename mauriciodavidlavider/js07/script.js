
console.log("js07");

/**
 * Funcion que sirve como API y a su vez imprime los datos.
 */

function busquedaUsuarios(){
    console.log("Se activo boton de busqueda");

    //fetch(`https://regres.in/api/users?page=${page}`)
    //fetch(`https://reqres.in/api/users/100`)
    fetch(`https://reqres.in/api/users?page=2`)  //Regresa a los empleados de la pagina seleccionada
    .then( response => response.json())
    .then( users => {
        console.log(users.data); //imprimimos base de datos
/*      console.log(users.data.id); 
        console.log(users.data.first_name); 
        console.log(users.data.last_name); 
        console.log(users.data.email); 
        console.log(users.data.avatar); //imagen */
    
        let tBody = document.getElementById("tBody");

        //Agregamos a los empleados en la lista al DOM
        for(let element of users.data){
            console.log(element);

            tBody.innerHTML += `
                <tr>
                <td class="table-secondary">${element.id}</td>
                <td class="table-light">${element.first_name}</td>
                <td class="table-light">${element.last_name}</td>
                <td class="table-light">${element.email}</td>
                <td class="table-secondary"><img src="${element.avatar}" class="img-fluid rounded-circle" style="width:40%"</td>
                </tr>
            `;
        }
    
    })
    .catch( error => {
        console.log("la solicitud causo error:", error);
    })
}