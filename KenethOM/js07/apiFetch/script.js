console.log("js07 api fetch")

function busquedaUsuarios(page=1){
    //console.log("Se ativó el botón de busqueda de ussuarios")

    fetch(`http://reqres.in/api/users?page=${page}`)
    .then( response => response.json())
    .then( users => {
        console.log(users);
    })
    .catch (error => {
        console.log("La solicitud causó eror", error);
    })
}