function findUsers(list){
    //fetch(`https://reqres.in/api/users?page=${page}`)
    fetch(`https://reqres.in/api/users?page=${list}`)
    .then(response => response.json())
    .then(users => {
        let dataBody = document.getElementById("dataUsers");

        for (const info of users.data) {
            dataBody.innerHTML += `
                <tr>
                    <th scope="row" class="align-middle">${info.id}</th>
                    <td class="align-middle">${info.email}</td>
                    <td class="align-middle">${info.first_name}</td>
                    <td class="align-middle">${info.last_name}</td>
                    <td class="align-middle"><img src="${info.avatar}" class="rounded-circle" width="100px"/></td>
                </tr>
            `;
            document.getElementById(`btn${list}`).disabled = true;
        }
    })
    .catch(eror =>{
        console.log("La solicitud causo un error: ", eror);
    })

}


function getList(){
    fetch("https://reqres.in/api/users")
    .then(data => data.json())
    .then(info => {
        let dataPage = document.getElementById("pag");
        let num = info.total_pages;

        for (let i=1; i<=num; i++) {
            dataPage.innerHTML += `
                <div class="col-md-2">
                    <div class="d-grid gap-2">
                        <button onclick="findUsers(${i})" type="button" class="btn btn-success" id="btn${i}">Pagina ${i}</button>   
                    </div>
                </div>
            `;
        }
    })
    document.getElementById("btnPags").disabled = true;
}

