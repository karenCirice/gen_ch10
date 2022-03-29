console.log("Estoy en J8 auxilio");
//objetos 
let persona ={
    nombre:"cholisa",
    apellido:"Greñas",
    email:"elcholo.com",
    edad:24,
    nombreCompleto: function(){
        return `${this.nombre} ${this.apellido} ***`;
    },
    get nombreYEdad(){
        return `${this.nombre} tiene ${this.edad}`;
    },
    set cambiarNombre(nombre){
        this.nombre = nombre;

    }


};
/*hay que hacer un get y un set para cada una de las propiedades 
set es para cambiar una propiedad dentro de tu objeto 
get es para obtener una propiedad dentro del objeto 
las funciones definidas con la palabra get no necesitan parentesis
this hace referencia al objeto en donde este*/
console.log(persona);
console.log(persona.nombre);
//para asignar un nuevo nombre a persona.nombre
persona.nombre= "cholafne"

console.log(persona["nombre"]);
console.log(persona.nombreCompleto());//invocar un método del objeto

array=[1,2,3,4];
console.log(array.length);

console.log(array.push(5));
console.log(array);
console.log(persona.nombreYEdad);//como se invoca un método que se realizó con get
persona.cambiarNombre = "Carlos"; //se cambia el nombre usando el get
console.log(persona.nombreYEdad);//se lee el nombre usando get