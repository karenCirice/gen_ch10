console.log("Sesión Js07: ");
// alt + 96 = `

/**
 * Función que trae los datos de API en https://reqres.in/
 * @param {Numeric} page le pasamos el número de página que deseamos ver
 */
function buscaUsuario(page= 1){
    console.log("Busca Usuario");

    // fetch(`https://reqress.in/api/users/23`)
    /**
     * Función fetch que nos trae los datos asíncronos de la página
     * @param {asinc} response es la respuesta de la página y lo transformamos a formato JSON para consumir los datos
     * @param {asinc} users el arreglo que traemos de los usuarios de la página
     */
    fetch(`https://reqres.in/api/users?page=2`)    
    .then((response)=>response.json())
    .then(users=>{
        console.log(users);
        let tBody = document.getElementById("tBody");
        tBody.innerHTML="";
        /**
         * Llenado de la tabla de usuarios
         */
        for (let user of users.data) {
            console.log(user.user);
            tBody.innerHTML += `
            <tr>
            <td>${user.id}</td>
            <td>${user.first_name}</td>
            <td>${user.last_name}</td>
            <td>${user.email}</td>
            <td><img style="border-radius: 50%; width: 50px; height: 50px;" src="${user.avatar}" alt="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzZKiLYztQeO3NxgmEJJ1KkTlfVYu61Cg8Xg&usqp=CAU"></td>
            </tr>`;
        }
    })
    .catch(error =>{
        console.log("Error :( ... :", error);
    })
    ;
}


function postUser(){
    // let formulario = document.forms["formulario"];
    console.log(`Datos a enviar:
        ${document.getElementById("myName").value} - 
        ${document.getElementById("lastName").value} - 
        ${document.getElementById("email").value}`);
    
    fetch("https://reqres.in/api/users",{
        method: "POST",
        body:{
            first_name : document.getElementById("myName").value,
            last_name : document.getElementById("lastName").value,
            email : document.getElementById("email").value,
        },
    })
    .then((response)=> response.json())
    .then((data) => {
        console.log("Success: ",data);
        console.log("Fecha de creación: ", data.createdAt);
    })
    .catch((error) => {
        console.log("Error: ", error);
        // alerta(error);
    });
}

// function alerta(error){
//     let message = document.getElementById("message");

//     message.innerHTML = "";
//     message.innerHTML += `
//     <div class="alert alert-danger" role="alert">
//         ESPERA: ${error}
//     </div>
//     `;
// }

