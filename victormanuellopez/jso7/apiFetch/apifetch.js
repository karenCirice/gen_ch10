let page = 1;  
  function buscarUsuarios(page){
     console.log("se activo boton");

     fetch(`https://reqres.in/api/users?page=${page}`)
     .then(response => response.json())
     .then(data => mostrartabla(data))
   
     .catch(error => {
         console.log("La solicitud causo error: ", error);
     });
     document.getElementById("boton").style.visibility="hidden";
     document.getElementById("add").style.visibility="hidden";
    
 }

function mostrartabla(data){
    let tbody = document.getElementById("tbody");
         for (let user of data.data){
            tbody.innerHTML += `
                <tr>
                <td>${user.id}</td>
                <td>${user.first_name}</td>
                <td>${user.last_name}</td>
                <td>${user.email}</td>
                <td><img src="${user.avatar}" width="50px" class="img-fluid rounded-circle"></td>
                </tr>`;
         }
}

function atras(){
    document.getElementById("tbody").innerHTML = "";
    fetch(`https://reqres.in/api/users?page=${page -= 1}`)
     .then(response => response.json())
     .then(data => mostrartabla(data))
   
     .catch(error => {
         console.log("La solicitud causo error: ", error);
     });

     document.getElementById("boton").style.visibility="hidden";
     document.getElementById("add").style.visibility="hidden";
}

function siguiente(){
    document.getElementById("tbody").innerHTML = "";
    fetch(`https://reqres.in/api/users?page=${page += 1}`)
     .then(response => response.json())
     .then(data => mostrartabla(data))
   
     .catch(error => {
         console.log("La solicitud causo error: ", error);
     });
     document.getElementById("boton").style.visibility="hidden";
     document.getElementById("add").style.visibility="hidden";
}



 function agregaruser(){
    /* 
    let form = document.forms["form"];
     console.log(`Datos a enviar:{
        ${form.first_name.value},
        ${form.last_name.value},
        ${form.email.value}
     }`);
     */
     //let formdata = new FormData();
     let first_name = document.getElementById("nombre");
     let last_name = document.getElementById("apellido");
     let email = document.getElementById("email");
     
     //formdata.append('first_name', first_name);


     /*
     let datosJson = JSON.stringify({
         first_name: "john", last_name: "leader",
         email: "john@email.com"
     });
     */
     
     let datosJson2 = JSON.stringify({
        first_name: 'first_name', last_name: last_name,
        email: email
    });
    
     console.log(datosJson2);

    fetch("https://regres.in/api/users",{
        method: "POST",
        body:datosJson2,
    })
        .then((response) => response.json())
        .then((data) => {
            console.log("Success: ", data);
            console.log("Fecha de creacion: ", data.createAt);
        })

        .catch(error => {
            console.log("La solicitud causo error: ", error);
        });
 }

 function alerta(error){
     let message = document.getElementById("message");

     message.innerHTML = "";
     message.innerHTML += `
     <div class="alert alert warning alert-dismissible fade show" role="alert">
     <strong>${error}</strong></div>
     `; 
 }