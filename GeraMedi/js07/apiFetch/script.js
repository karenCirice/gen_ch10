console.log("elGera");

function busquedaUsuarios(page=2){ //(page=2) y en fetch cambia la sintáxis
    //console.log("Si funciona el botón"); para checar si funciona el botón

    //Se emplea página para APIs
    //fetch(`https://reqress.in/api/unknown/23`) para que de error y arroje el catch error
fetch(`https://reqres.in/api/users?page=${page}`) //Se emplean comilla gruesa y page por el function (page=2) para ir directo a la página 2
    .then((respuesta) => respuesta.json()) //respuesta es en donde asignamos el valor del fetch, .json lo convierte en formato JSON
    .then((users) => {                     //Aquí se arroja el resultado de respuesta convertido en JSON al valor que le demos en este caso users
        console.log(users);                //Para imprimir valores convertidos a consola

    //Se asigna variable para darle info de tabla en HTML
    let cuerpoTabla = document.getElementById("cuerpoTabla");
    cuerpoTabla.innerHTML = "";           //Para modificar la tabla id=cuerpoTabla
    for (let user of users.data){         //Se asigan un valor user que toma un valor del data (user formato JSON)
        cuerpoTabla.innerHTML += `        
        <tr>
            <th>${user.id}</th>
            <td>${user.email}</td>
            <td>${user.first_name}</td>
            <td>${user.last_name}</td>
            <td><img src="${user.avatar}" class="rounded-circle"alt="avatar" style="width:60px"></td>
          </tr>`;
    }
    });
    //Solicitud Http, puede fallar por servidor por eso se pone .catch para conocer el error
    //.catch ( error => {
    //    console.log("La solicitud causó error: ", error)
    //})
}