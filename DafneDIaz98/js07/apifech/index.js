function busquedaUsuarios(){
    fetch("https://reqres.in/api/users?page=2")
    .then((result)=> result.json())
    .then((users) => tabla(users) /* console.log(users) */)
    .catch((error) => {
        console.log(`Error showed with ${error}`)
    })
}
function tabla(users){
    let contenido = document.getElementById("contenido");   
    
    for (const usuario of users.data) {
        contenido.innerHTML += `
        <tr>
          <td>${usuario.id}</td>
          <td>${usuario.email}</td>
          <td>${usuario.first_name}</td>
          <td>${usuario.last_name}</td>
          <td><img src="${usuario.avatar}"></td>
        </tr>
        `
    }
}























