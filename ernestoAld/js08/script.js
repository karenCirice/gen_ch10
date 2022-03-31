function post() {
  fetch("https://reqres.in/api/users", {
    /* Especificamos el metodo POST */
    method: "POST",
    body: {
      name: document.getElementById("name").value,
      job: document.getElementById("job").value,
      email: document.getElementById("mail").value,
    },
  })
    /* Definimos las promesas */
    .then((response) => response.json())
    .then((datos) => console.log(datos))
    /* En caso de existir excepcion u error */
    .catch((error) => console.log(`${error}`));
}

/* 
Programacion orientada a objetos con Javascript
*/

//creando un objeto persona

let persona = {
  nombre: "Ernesto",
  apellido: "Aldana",
  email: "ernestoaldanati@gmail.com",
  edad: 24,
  casado: false,
  nombreCompleto: function () {
    console.log(`${this.nombre} ${this.apellido}`);
  },
  get nombre() {
    return this.nombre;
  },
  set nombre(nombre) {
    this.nombre = nombre;
  },
};
