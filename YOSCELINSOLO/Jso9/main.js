//const { default: axios } = require("axios"); esto no se utiliza a menos que esemos usando Nodejs

console.log("Estoy en Jso9 en NPM");


/*fetch("https://reqres.in/api/users?page=2")
    .then((data) => data.json())
    .then((dataJson) => console.log(dataJson))*/
    axios.get("https://reqres.in/api/users?page=2")
    .then(res => console.log(res)); 

    /* Con axios el código esta muy limpieo y ya no tenemos que 
    convertir a .json que sería: .then((data) => data.json()) en el fetch*/

    //Método post con fetch//

    fetch("https://reqres.in/api/users", {
  method: "POST",
  body: {
    name: "Manuel",
    job: "Torres",
  },
})
  .then((response) => response.json())
  .then((data) => {
    console.log("Success: ", data);
  })
  .catch((error) => {
    console.error("Error: ", error);
  });

  //Método post con axois//
    axios
    .post("https://reqres.in/api/users", {
      name: "Manuel",
      job: "Torres",
    })
    .then((response) => console.log(response))
    .catch((error) => console.log(error));
  