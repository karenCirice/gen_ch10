
console.log("js07");

function busquedaUsuarios(){
    console.log("Se activo boton de busqueda");

    //fetch(`https://regres.in/api/users?page=${page}`)
    //fetch(`https://reqres.in/api/users/100`)
    fetch(`https://reqres.in/api/users?page=2`)  //Regresa a los empleados de la pagina seleccionada
    .then( response => response.json())
    .then( users => {
        console.log(users.data); 
/*      console.log(users.data.id); 
        console.log(users.data.first_name); 
        console.log(users.data.last_name); 
        console.log(users.data.email); 
        console.log(users.data.avatar); //imagen */
    
        let tBody = document.getElementById("tBody");

        for(let element of users.data){
            console.log(element);

            tBody.innerHTML += `
                <tr>
                <td>${element.id}</td>
                <td>${element.first_name}</td>
                <td>${element.last_name}</td>
                <td>${element.email}</td>
                <td><img style="border-radius: 50%; width: 30%" src="${element.avatar}"</td>
                </tr>
            `;
        }
    
    })
    .catch( error => {
        console.log("la solicitud causo error:", error);
    })
}