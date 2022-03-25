function post(){

    fetch("https://reqres.in/api/users",{
        /* Especificamos el metodo POST */
        method: "POST",
        body:{
            "name": document.getElementById("name").value,
            "job": document.getElementById("job").value,
            "email":document.getElementById("mail").value,
        },
    })
    /* Definimos las promesas */
    .then((response) => response.json())
    .then((datos) => console.log(datos))
    /* En caso de existir excepcion u error */
    .catch((error) => console.log(`${error}`))
}
