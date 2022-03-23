
console.log("js07");

function busquedaUsuarios(page){
    console.log("Se activo boton de busqueda");

    //fetch(`https://regres.in/api/users?page=${page}`)
    fetch(`https://regres.in/api/users/23`)
    .then( response => response.json())
    .then( users => {
        console.log(users)
    })
    .catch( error => {
        console.log("la solicitud causo error:", error)
    })
}