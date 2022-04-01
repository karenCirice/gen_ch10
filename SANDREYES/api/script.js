console.log("js07 apiFetch");

function busquedaUsuarios(page=2){
    //console.log("se activó el botón de busqueda de usuarios");

fetch(`https://reqres.in/api/users?page=2${page}`)
.then( response => response.json())
.then( users => {
    console.log(users);
})
//.catch ( error =>{
    //console.log("la solicitud causo:", error);
//})

}


