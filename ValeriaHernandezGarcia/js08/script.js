console.log("Estoy en j08, yea, yea la muñeca fea");

let persona = {
    nombre: "Cholisa",
    apellido: "Greñas",
    email: "LaMars@ElCholoEd.com",
    edad: 24,
    nombreCompleto: function(){
        return `${this.nombre} ${this.apellido} ***`;
    }, 

    get nombreYEdad(){
        return `${this.nombre} tiene ${this.edad}`
    }, 

    set cambiarNombre(nombre){
        this.nombre = nombre;
    }


};

console.log (persona.nombre); //Obtener una propiedad del objeto
console.log (persona["nombre"]); //Otra forma de obtener la propiedad
persona.nombre = "Cholafne";
console.log (persona[`nombre`]);
console.log ( persona.nombreCompleto()); //Invocar un método del objeto
console.log (persona.nombreYEdad); // Como se invoca un método que se realiza con get
persona.cambiarNombre = "Carlos"; //Se cambia l nombre usando set
console.log (persona.nombreYEdad); //Se lee el nombre usando get


/* Las palabras reservadas con la palabra get no necesita los corchetes*/

/** ******************** */
//Ejemplo de propiedades y métodos de un objeto Array
/*array = [1, 2, 3, 4];
console.log (array.length);
console. log (array.push(5) );
console.log (array) ;*/
 