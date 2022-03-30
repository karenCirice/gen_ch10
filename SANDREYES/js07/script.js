console.log("Iniciando script...")

function busquedaUsuarios(){

    fetch("https://reqres.in/api/users?page=1")
    .then( response => response.json())
    .then( users => {
        console.log(users.data); 

        let tBody = document.getElementById("tBody");

        for (let user of users.data){
            console.log("User: ", user);
            tBody.innerHTML += `
                <tr>
                    <td>${user.id}</td>
                    <td>${user.first_name}</td>
                    <td>${user.last_name}</td>
                    <td>${user.email}</td>
                    <td><img src="${user.avatar}" class="rounded-circle" alt="avatar" style="width:60px"</td>
                    </tr>
                    `;
                    }
                
                })

            }

            function busquedaUsuarios2(){

                fetch("https://reqres.in/api/users?page=2")
                .then( response => response.json())
                .then( users => {
                    console.log(users.data); 
            
                    let tBody = document.getElementById("tBody");
            
                    for (let user of users.data){
                        console.log("User: ", user);
                        tBody.innerHTML += `
                            <tr>
                                <td>${user.id}</td>
                                <td>${user.first_name}</td>
                                <td>${user.last_name}</td>
                                <td>${user.email}</td>
                                <td><img src="${user.avatar}" class="rounded-circle" alt="avatar" style="width:60px"</td>
                                </tr>
                                `;
                                }
                            
                            })
            
                        }