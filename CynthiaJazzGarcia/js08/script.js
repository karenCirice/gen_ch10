console.log("Estoy en J08")


let persona = {
    nombre : "Cholisa", 
    apellido: "Grenas",
    email: "LaMars@ElCholoEd.com",
    edad: 24,
    nombreCompleto: function (){
        return `${this.nombre} ${this.apellido}`;
    },
    get nombreYEdad(){
        return `${this.nombre} tiene ${this.edad}`;
    },
    set cambiarNombre(nombre){
        this.nombre + nombre;
    }

    
};
/*get es para obtener una propiedad, y set es para cambiar una propiedad dentro del objeto*/
console.log (persona.nombre );
console.log (persona["nombre"]);
persona.nombre = "Cholafne";
console.log (persona['nombre']);
console.log (persona.nombreCompleto()); //Invocar un metodo del objeto
console.log (persona.nombreYEdad); // Como se invoca un metodo que se
persona.cambiarNombre ="Carlos"; //Se cambia el nombre
console.log (persona.nombreYEdad);