console.log("JS07 Ejercicio ApiFetch");

 /**
 * Funcion para activar el fetch pag1
 */

  function busquedaUsuarios1(){
    fetch(`https://reqres.in/api/users?page=1`)
    .then((response) => response.json())
    .then((users) => añadirTabla(users))
    .catch ((error) => {
      console.log(`El error ${error} me apareció`);
    })
     }

      /**
 * Funcion para agregar las columnas a la tabla pag1
 */

  function añadirTabla(users){
  let tBody = document.getElementById("tBody");
  //tBody.innerHTML = "";
    //por cada usuario del arreglo users.data hacer lo siguiente
  for (let usuario of users.data){
    tBody.innerHTML += `
    <tr>
    <td>${usuario.id}</td>
    <td>${usuario.first_name}</td>
    <td>${usuario.last_name}</td>
    <td>${usuario.email}</td>
    <td id="avatar"> <img src="${usuario.avatar}" class="rounded-circle" style="border-color:pink" alt="avatar"></td>
    </tr>`;
    }
  }

   /**
 * Funcion para activar el fetch pag2
 */

    function busquedaUsuarios2(){
      fetch(`https://reqres.in/api/users?page=2`)
      .then((response) => response.json())
      .then((users) => añadirTabla(users))
      .catch ((error) => {
        console.log(`El error ${error} me apareció`);
      })
       }
  
        /**
   * Funcion para agregar las columnas a la tabla pag2
   */
  
    function añadirTabla(users){
    let tBody = document.getElementById("tBody");
    //tBody.innerHTML = "";
      //por cada usuario del arreglo users.data hacer lo siguiente
    for (let usuario of users.data){
      tBody.innerHTML += `
      <tr>
      <td>${usuario.id}</td>
      <td>${usuario.first_name}</td>
      <td>${usuario.last_name}</td>
      <td>${usuario.email}</td>
      <td> <img src="${usuario.avatar}" class="rounded-circle" alt="avatar" id="avatar"></td>
      </tr>`;
      }
    }




/* Para hacer un post */

/*   function postUser(){
let formulario = document.forms["formulario"];
console.log(`Datos a enviar:
${formulario.first_name.value}
${formulario.last_name.value}
${formulario.email.value}
`);
} */


/*   fetch("https://reqres.in/api/users",{
    method: "POST",
    body: {
first_name: formulario.first_name.value,
last_name: formulario.last_name.value,
email: fformulario.email.value
    },
  })
  .then((response) => response.json())
  .then((data) => {
    console.log("Success: ", data);
    console.log("Fecha de creación: ", data.createdAt);
  })
  .catch((error) => {
    console.log("El error es: ", error);
  });
} */