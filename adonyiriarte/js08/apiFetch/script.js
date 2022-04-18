//console.log(js08 apiFetch);

function busquedaUsuarios(){
//function busquedaUsuarios(page=1){
    console.log("se activo el botón de búsqueda de usuarios")
    fetch("https://reqres.in/api/users?page=2")

    //fetch("https://reqresheellou.in/api/users23")
    //fetch("https://reqres.in/api/users?page=2"${page}`)
    .then(response => console.log(response))
    .then(response => response.json())
    .then (users => {
        console.log(users);
    })
    .catch ( error => {
        console.log("la solicitud causó un error: ", error);
    })
}