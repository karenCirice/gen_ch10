console.log("JS07 api Fetch");


/**Fetch significa como ir a buscar, traer o extraer
 * Fetch es el nombre de una nueva API para javascript con la cuál podemos realizar peticiones 
 * HTTP.
 * Fetch API provee una interfaz para acceder y manipular partes del HTTP pipeline, como puede ser peticiones (request)
 * y respuestas. En este ejemmplo de extrae el contenido del archivo json externo de la página:
 * 
 */
function busquedaUsuarios(page=1){
    console.log("funcion de boton buscar usuarios");

    /*
    //fetch(`https://reqres.in/api/users?page=${page}`)
    fetch("https://reqresMALITO.in/api/usersTT/23")
    .then(response => response.json())
    .then(users => {
        console.log(users)
    })

    .catch(error=>{
        console.log("La solicitud causó un error: ", error);
    })
    */

    fetch(`https://reqres.in/api/users?page=${page}`)
    .then(response => response.json())
    .then((users) => {
        console.log(users);
        console.log(Array.isArray(users.data));
    
        let tBody = document.getElementById("tBody");
        tBody.innerHTML=""
        for(let i of users.data){
        tBody.innerHTML += `
        <tr>
        <td>${i.id} </td>
        <td>${i.first_name}</td>
        <td>${i.last_name}</td>
        <td>${i.email}</td>
        <td><img src="${i.avatar}" class="rounded-circle" alt="avatar" style="width: 60px"</td>
        </tr>
        `;
        }
    })
    .catch((error)=>{
        console.error("Error: ", error);
    })
}