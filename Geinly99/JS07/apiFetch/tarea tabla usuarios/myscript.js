
function searchUsers(page=1){
    console.log("Users search button was activated");

    fetch(`https://reqres.in/api/users?page=${page}`)
    .then((response) => response.json())
    .then((users) =>{
        console.log(users);
        let table=document.getElementById("tBody");
         table.innerHTML= "";
        for (let user of users.data){
           // console.log(data.users);
            table.innerHTML +=`  
            <tr>
            <td> ${user.id}</td>
            <td>${user.first_name}</td>
            <td>${user.last_name}</td>
            <td>${user.email}</td>
            <td><img src="${user.avatar}" class="rounded-circle" style="width=60px" alt="Eniun"></td>
          </tr> `;

    }
    
    
});
}

