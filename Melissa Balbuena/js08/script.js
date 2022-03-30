console.log("JS08 Holi buenas tardes");

let persona = {
    nombre : "Melissa", 
    apellido: "Balbuena",
    email: "melbal@email.com",
    edad: 24,

    //funciones, este tipo de funcion tiene que llamarse con ()
    nombreCompleto: function(){

        //this hace referencia al objeto donde se esta invocando
        // se hqace la concatenacion

        return `${this.nombre} ${this.apellido} ***` ;
    },

    // declarar metodos con get, las funciones definidas con get no necesita parentesis

    get nombreYEdad(){
        return `${this.nombre} tiene ${this.edad}`;
    }
};

//console.log(persona);
// metodo de objeto persona

console.log(persona.nombre);
console.log(persona["nombre"] );
persona.nombre="Itzel";
console.log (persona['nombre'] );
console.log (persona.nombreCompleto());
console.log (persona.nombreYEdad);

/*******************************************/

// Esto tiene metodos y propiedades
// push metodo de mi arreglo, nuevo dato que es el 5
// length es una propiedad de mi arreglo

array = [1,2,3,4];
console.log (array.length);
console.log (array.push(5));
console.log (array);