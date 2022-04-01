console.log("Estoy en JS09 con NPM");

// fetch("https://reqres.in/api/users?page=2")
//   .then((response) => response.json())
//   .then((dataJson) => console.log(dataJson));

// Axios ya no necesita del .json() para convertir la respuesta
axios
  .get("https://reqres.in/api/users?page=2")
  .then((response) => console.log(response));

// fetch("https://reqres.in/api/users", {
//   method: "POST",
//   body: {
//     name: "Manuel",
//     job: "Torres",
//   },
// })
//   .then((response) => response.json())
//   .then((data) => {
//     console.log("Success: ", data);
//   })
//   .catch((error) => {
//     console.error("Error: ", error);
//   });

axios
  .post("https://reqres.in/api/users", {
    name: "Manuel",
    job: "Torres",
  })
  .then((response) => console.log(response))
  .catch((error) => console.log(error));
