console.log("estoy en js08");


let persona = {
    nombre : "Cholisa", apellido : "Greñas",
    apellido : "Greñas",
    email : "alesarte", 
    edad : 24,

    //funcion
    nombreCompleto: function (){
        //return this.nombre;
        return `${this.nombre} ${this.apellido} ***`;
    },
    // declarar métodos con get para obtener una propiedad
    get nombreYEdad(){
        return`${this.nombre} tiene ${ this.edad}`;
    },
    // se pasas un parametro y lo cambiamos a una propiedad dentro del objeto
    set cambiarNombre(nombre){
        this.nombre = nombre;
    }



};

// hacen lo mismo, diferente sintaxis, obtienen la propiedad de un objeto
console.log(persona.nombre);
console.log(persona["nombre"] );

//se asigna otro nombre
persona.nombre= "Cholafne";

console.log(persona["nombre"]);

console.log(persona.nombreCompleto());//invoca el método del objeto
//para get
console.log(persona.nombreYEdad);
//cambiando nombre y leyendo nombre atráves de get y set 
persona.cambiarNombre =" carlosm";//set
console.log(persona.nombreYEdad);//get


//******************************************** */
array = [1,2,3,4];
//lenght es una propiedad del arreglo
console.log (array.length);
//push es un método del arreglo
console.log( array.push(5));
console.log(array);
