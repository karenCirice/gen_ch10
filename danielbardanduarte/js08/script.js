console.log("Estoy en J08");

let persona = {
  nombre: "Daniel",
  apellido: "Bardan",
  email: "daaniel_l@hotmail.com",
  edad: 24,
  nombreCompleto: function () {
    return `${this.nombre} ${this.apellido}***`; //This hace referencia al lo que le pongas (objeto)
  },
  get nombreYEdad() {
    return `${this.nombre} tiene ${this.edad}`;
  },
  set cambiarNombre(nombre) {
    this.nombre = nombre;
  },
};
//Formas de nombrar un dato
console.log(persona.nombre);
console.log(persona["nombre"]);

//Cambiar nombre
persona.nombre = "Chocoflan";

console.log(persona.nombreCompleto());

persona.cambiarNombre = "El dedotes"; // Se cambia el nombre usando get
console.log(persona.nombreYEdad); //Se lee el nombre usando get
