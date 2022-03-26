console.log("JS07 ApiFetch");

/**
 * Funcion para activar el fetch
 */
function busquedaUsuarios(page=1){
    //console.log("Se activó el botón de búsqueda")

fetch(`https://reqres.in/api/users?page=${page}`)
.then(response => response.json())
.then(users =>{
    console.log(users);
})
.catch (error => {
    console.log("La solicitud causo error: ", error);
})
}