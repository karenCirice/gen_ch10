console.log("JS07 apiFetch");
console.log(`Multiplicación ${3*3} y esto es una división ${4/2}`);
console.log(`Multiplicación: `+ (3*3) + `y esto es una división ` + 4/2);

// OTRA OPCION ES DECLARANDO LA URL FUERA DE LA FUNCION "let dirección = URL" Y EN FETCH INVOCAS LA URL y haces "fetch.(direccion)"
// function direcciónHTTPS (pagina=1){
//     return acentograve url =${pagina}acentograve
// }

// FUNCIÓN DE BUSQUEDA DE USUARIOS
function busquedaUsuarios(page=1){
console.log("Se activó el botón de búsqueda de usuarios");
// fetch ("https://reqres.in/api/users/23")
// CON EL ${page} SE HACE DINAMICO POR SI QUEREMOS VER MAS DE UNA PAGINA
fetch (`https://reqres.in/api/users?page=${page}`)
.then(response => response.json())
.then ( users => {
    console.log(users);
    let table= document.getElementById("tBody");
    table.innerHTML = "";
    for (let user of users.data){
        table.innerHTML +=`
        <tr>
            <td>${user.id}</td>
            <td>${user.first_name}</td>
            <td>${user.last_name}</td>
            <td>${user.email}</td>
            <td><img src="${user.avatar}" class="rounded-circle" alt="avatar"></img></td>
        </tr>`;
    }
})
.catch (error => {
    console.log("La solicitud causo error: ", error);
    alerta(error);
});
}

function postUser() {
    let formulario= document.forms["formulario"];
    console.log(`datos a enviar:
    ${formulario.first_name.value} -
    ${formulario.last_name.value} - 
    ${formulario.email.value}
    `);
datosJson=JSON.stringify({name: "John", age:38, city:"NY"});
console.log(datosJson);

fetch("https://regres.in/api/users",{
    method:"POST"
    body: datosJson,
})


fetch ("https:regres.in/api/users",{
method: "POST",
body: {
    first_name: formulario.first_name.value,
    last_name: formulario.last_name.value,
    email: formulario.email.value,
},
})
.then((response)=> response.json())
.then((date)=>{
    console.log("success: ", data);
    console.log("fecha de creacion: ", data.createdAt);
})
.catch((error) => {
    console.error("Error: ", error);
    alerta(error);
});
}
