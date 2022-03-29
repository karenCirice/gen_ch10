console.log("JS 07 API Fetch")
function busquedaUsuarios(page=1){ //inicializando el parámetro con (page=1)
    //

    //
    fetch ("https://reqres.in/api/users/2")
    )
    console.log("Se activo el boton de busqueda de usuarios")
    .then (response => response.json())
    .then(users)
}