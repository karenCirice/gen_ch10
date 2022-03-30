//we firs declared the function
function traer(page=1){

    fetch(`https://reqres.in/api/users?page=${page}`)//then use the url to impride code 
    .then(res => res.json())//declare the promises
    .then(users => {

        //console.log(users);// do the test with console.log

        let contenido = document.getElementById("contenido"); //declared the variable and become the id of the table 

        //implementamos un for para hacer la iteración de los datos que necesitamos 
        for(let valor of users.data){
            //console.log(valor.nombre);
            //colocamos el contenido en "en blanco para que se pueda mostrar el contenido"
            contenido.innerHTML += `
            <tr>
            <th scope="row">${valor.id}</th>
            <td>${valor.first_name}</td>
            <td>${valor.last_name}</td>
            <td>${valor.email}</td>
            <td><img src="${valor.avatar}" class="rounded-circle"alt="avatar" style="width:60px"></td>
          </tr>
            `
        }
    });
}
