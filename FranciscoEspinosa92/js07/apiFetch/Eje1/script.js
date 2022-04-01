
function BusquedaUsuarios( ){
    
fetch("https://reqres.in/api/users?page=2")
    .then(response => response.json())
    .then(users =>{
        console.log(users);
        console.log(Array.isArray(users.data));
        console.log(users.data);
        
        let tbody = document.getElementById("tBody");
        tbody.innerHTML = "";

        for(let data of users.data){
            console.log(users.data)
            tBody.innerHTML += `
            
            <tr>
            <td>${data.id}</td>
            <td>${data.email}</td>
            <td>${data.first_name}</td>
            <td>${data.last_name}</td>
            <td><img src="${data.avatar}"class="rounded-circle"></td>
            </tr>
            `;
        }


    })
        .catch(error => {
            console.log("La solicitud causa error", error);
        })

}