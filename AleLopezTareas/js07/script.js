console.log("JS07 apiFetch")

function busquedaUsuarios(){
    //console.log("Se activó el botón de byusqueda de ususraio ");
    
    fetch(`https://reqres.in/api/users?page=2 ${page}`)
    .then(response => response.json())
    .then(users =>{
        console.log(users);
    })
    .catch ( error => {
        console.log("La solicitud causo error: ", error);
    })


}


