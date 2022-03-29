console.log("Estoy en js08");

let persona = {
    nombre : "Danitza",
    apellido : "Kewley",
    email : "correo@correo.com",
    edad : 25,
    nombreSimple : function(){
    /* El this hace referencia al objeto que esta invocando */
        return this.nombre;
    },
    nombreCompleto : function(){
        return `${this.nombre} ${this.apellido} ***`;
    }
    /* otra forma para declarar objetos */
    get nombreYEdad(){
        return `${this.nombre} tiene ${this.edad}`;
    },
    set cambiarNombre(nombre){
        this.name = nombre;
    }

};

console.log(persona);

/* Imprinir solo 1 objeto */

console.log(persona.nombre);
console.log(persona["nombre"]);
console.log(persona['nombre']);

/* Para asignar un nuevo valor a la variable nombre */
persona.nombre = "Aurora";

console.log(persona.nombreSimple());
console.log(persona.nombreCompleto());

/* Llamar una funcion declarada con get */
console.log(persona.nombreYEdad);

/* Cambiar la propiedad dentro del objeto nombre */
persona.cambiarNombre = "Nuevo nombre";
console.log (persona.cambiarNombre);

/* ********************************** */
/* array = [1,2,3,4];
/* Para saber la longitud del arreglo */
//console.log (array.length);
/* Para agregar un nuevo elemento al final */
//console.log (array.push(5));
//console.log(array);