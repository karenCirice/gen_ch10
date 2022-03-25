console.log("Api Fetch");
function searchUsers(page=1){
    console.log("Users search button was activated");

    fetch(`https://reqres.in/api/users?page=${page}`)
    //fetch(`https://reqres.in/api/users/2`)
    //fetch(`https://reqresMalito.in/api/users/23`)
    .then(response => response.json())
    .then(users =>{
        console.log(users);
    })
    .catch(error =>{
        console.log("There was a mistake",error);
    })
}