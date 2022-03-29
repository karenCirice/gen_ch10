console.log("estoy en J08,yea yea,la muñeca fea");

let persona = {
    nombre: "cholisa", 
    apellido: "greñas",
    email: "LaMars@ElCholoEd.com",
    edad: 24,
    nombreCompleto: function(){
        return `${this.nombre}${this.apellido} ***`;
    },
     get nombreYEdad(){
         return `${this.nombre}tiene ${this.edad}`;
     }

};

    console.log(persona.nombre );
    console.log (persona["nombre"]);
    persona.nombre="cholafne";
    console.log (persona["nombre"]);
    console.log (persona.nombreCompleto());
    console.log (persona.nombreYEdad);
//propiedades de arreglos//
    /*array=[1,2,3,4];
    console.log (array.length);
    console.log (array.push(5) );
    console.log ( array);*/

