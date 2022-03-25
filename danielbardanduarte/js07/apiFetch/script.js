console.log("Si jala");
/**
 * Ayuda a buscar el Usuario
 */
function busquedaUsuarios(page=1){
    // console.log("Activo el boton")
    fetch(`https://reqres.in/api/users?page=${page}`)
    .then(response => response.json()) //-----Poner forzosamente el .json
    .then (users => 
        tabla(users)
     //  console.log(users)
    )
    }
// ------------Funcion Tabla -------------
    function tabla(users){

        let tBody = document.getElementById("tBody");

        tBody.innerHTML += ""
        for (let user of users.data){
    
            tBody.innerHTML += `
            <tr> 
            <td>${user.id}</td>
            <td>${user.first_name}</td>
            <td>${user.last_name}</td>
            <td>${user.email}</td>
            <td><img src="${user.avatar}" class="rounded-circle" alt="avatar" style="width:90px"></td>
         </tr>
        `;
    }

    }
    

 
    

    //.catch (error => {
    //    console.log("La solicitud causo error: " , error);
        
