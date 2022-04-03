console.log('Estoy en JS08');

let persona = {
    nombre: 'Eli',
    apeliido: 'Sánchez',
    email: 'eli@gmail.com', 
    edad: 23,
    nombreCompleto: function () {
        // this hace refererencia al objeto persona
        return `${this.nombre} ${this.apellido} ***`;
    },
    // la función reservada get no necesita parametros
    get nombreYEdad(){
        return `${this.nombre} tiene ${this.edad}`
    },

    set cambiarNombre(nombre){
        this.nombre = nombre;
    }
};

console.log(persona.nombre);
console.log(persona['nombre']);

persona.nombre = 'Dafne';

console.log(persona['nombre']);

console.log(persona.nombreCompleto());
console.log(persona.nombreYEdad);
persona.cambiarNombre = 'Nuevo nombre';
console.log(persona.nombreYEdad);