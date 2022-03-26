        
function busquedaUsuarios()
{
console.log("Button function");
fetch("https://reqres.in/api/users?page=2")
.then(response => response.json())
.then(users => {
    console.log(users);
    console.log(Array.isArray(users.data));

    let tBody = document.getElementById("tBody");
    tBody.innerHTML="";
    for (let data of users.data){
        console.log(users.data);
        tBody.innerHTML += `
        <tr>
        <td>${data.id}</td>
        <td>${data.email}</td>
        <td>${data.first_name}</td>
        <td>${data.last_name}</td>
        <td><img src="${data.avatar}" width=50px class="rounded-circle border border-success border border-5" alt="20x20"  ></td>
        </tr> `
    }
  }) 
    
   .catch(error => {
       console.log("La msolicitud causa error", error);
   })

}