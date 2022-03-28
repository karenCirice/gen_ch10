function searchUsers(page=1){
    console.log("Users search button was activated");

    fetch(`https://reqres.in/api/users?page=${page}`)//$es para llamar la var, Fetch da respuesta
    .then((response) => response.json())//y then la acata
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
            <td><img src="${user.avatar}" class="rounded-circle" style="width=40px" alt="Eniun"></td>
          </tr> `;
    }
     
});
}