console.log("js08");

let persona={
    nombre: "Cholisa",
    apellido: "Greñas",
    email:"somoslocos@edu.com",
    edad:24, 
    nombreCompleto: function(){
        return `${this.nombre} ${this.apellido} es amix de Titania`;
    },
    get nombreYEdad(){
        return `${this.nombre} tiene ${this.edad} locote`;
    },
    set cambiarNombre(nombreNuevo){
        this.nombre=nombreNuevo;
    }
};

console.log(persona.nombreCompleto());
/**Get no requiere paréntesis*/
console.log(persona.nombreYEdad);
//
persona.cambiarNombre="Magic"
//
console.log(persona.nombreYEdad);