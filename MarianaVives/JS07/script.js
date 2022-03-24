console.log("JS07 apiFetch");

// FUNCIÓN DE BUSQUEDA DE USUARIOS
function busquedaUsuarios(page=1){
console.log("Se activó el botón de búsqueda de usuarios");
// fetch ("https://reqres.in/api/users/23")
fetch (`https://reqres.in/api/users?page=${page}`)
.then(response => response.json())
.then ( users => {
    console.log(users);
    let tBody= document.getElementById("tBody");
    for (let user of data.user){
        console.log(user.user)
    }
})
.catch (error => {
    console.log("La solicitud causo error: ", error);
})
}
