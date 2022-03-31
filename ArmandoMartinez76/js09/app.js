console.log('Estoy en JS 09');

axios.get('https://reqres.in/api/users?page=2')
    .then(res => console.log(res))
    
    axios.post("https://reqres.in/api/users", {
    name: "morpheus",
    job: "leader",
});


    .then(response => console.log(response))
    .catch((error) => console.log(error))