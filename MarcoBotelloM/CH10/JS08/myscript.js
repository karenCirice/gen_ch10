let persona = {  //Los objetos de declaran mediante una Clase.
    nombre: "Marco",  //Atributo
    apellido: "Botello", //Atributo
    email:"marco.botmar@hotmail.com", //Atributo
    edad:24, //Atributo
    nombreCompleto:function() { //Se declara la function dirigida a Objetos
        return `${this.nombre} tiene ${this.edad}`;
    },
    get nombreyedad(){
        return `${this.nombre} tiene ${this.edad}`;
    },
    set cambiarNombre(Nombre){
        this.nombre = Nombre;
    }
};

console.log(persona.nombre); //Obtener una propiedad del objeto
console.log(persona["nombre"] ); //Otra forma de obtener la propiedad.
/////////////////////////////////////////////////////////////////////////////
persona.nombre = `Marco`;
console.log(persona["nombre"] );
console.log(persona.nombreCompleto); //Invocar un metodo del objeto. 
console.log(personan.nombreyedad); //Como se invoca un metodo que se realizo con get
/////////////////////////////////////////////////////////////////////////////////7777
persona.cambiarNombre = "Antonio"; //Se cambia el nombre 
console.log(persona.nombreyedad);
