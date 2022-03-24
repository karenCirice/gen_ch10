function iniciarApp(){
    console.log("Hola");
    busquedaUsuarios();
}
function busquedaUsuarios(){
    fetch("https://reqres.in/api/users?page=2")
        .then( (response)=>{
            return  response.json()
        })
        .then( users =>{
            saludar();
            console.log(users.data[0].email);
        })
        .catch( (error)=>{
            console.log("La solicitud causo error ", error)
        })

}
function saludar(){
    console.log("Hay una serpiente en mi bota");
}