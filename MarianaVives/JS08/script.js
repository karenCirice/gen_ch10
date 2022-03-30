console.log("Estoy en J08");

let nuevoArray = new Array(50);
let nuevoArray2 = [50] ;
nuevoArray.push(20);
nuevoArray.pop();
// El nombre de las clases debe comenzar en mayúsculas
class Persona{ //Es el objeto
    _nombre; // estos son los atributos del objeto
    _apellido;
    _edad;
    _accesorio;
    _bolsa;

    constructor(nombre, apellido, edad){ //necesitas el constructor para definir al objeto
        this._nombre = nombre; //this.nombre hace referencia al objeto de la class y "nombre" hace referencia al nombre dentro del constructor
        this._apellido=apellido;
        this._edad=edad;
        this._accesorio="";
        this._bolsa="ted baker";

    }
    //get y set son metodos de la clase persona y son para cambiar propiedades
    get nombre(){
        return this._nombre;
    }

    set nombre(nuevoNombre){ // se tiene que establecer un parametro de entrada con el set
        this._nombre = nuevoNombre;
    }

    get accesorio(){
        return this._accesorio;
    }
    set accesorio(nuevoAccesorio){
        this._accesorio= nuevoAccesorio;
        this.#valorDelAccesorio(nuevoAccesorio);
    }

    set bolsa(nuevaBolsa){
        this._bolsa = nuevaBolsa;
    }

frase(frase = "hermosa") {
    return `la vida es un carnaval ${frase}`
}

/**
 * Verifica si la persona tiene un arma
 * @returns true si tiene un accesorio
 */
tieneAccesorio(){
    if(this._accesorio == ""){
        return false;
    }
    else{
        return true;
    }
}
/**
 * Devuelve un
 */
tieneAccesorioStr(){
    if (this.accesorio != ""){
        return "es de las mias";
    }
        else{
            return "se queda viendo bob esponja"
        }
    }   
//con el # la funcion no se puede utulizar fuera de la clase de la linea 8-78 en este caso
#valorDelAccesorio(tipoAccesorio){
    if (tipoAccesorio=="collar"){
        this._apellido+= " la collares ";
        }   
    }

}

let persona1 = new Persona("Mari", "Vives", 50);
let persona2= new Persona("Big", "Clifford", 8);

console.log("Nombre de Persona1: ", persona1.nombre);
console.log("Nombre de Persona2: ", persona2.nombre);
persona2.nombre = "Mia";
console.log("Nombre nuevo de Persona 2:", persona2.nombre);

persona1.accesorio = "";
persona2.accesorio = "collar ";
console.log("Datos persona1:" , persona1);
console.log("datos persona2: ", persona2);

persona1.bolsa = "LV";
persona2.bolsa= "Chanel";
// console.log("Datos persona1:" , persona1);
// console.log("datos persona2: ", persona2);

// console.log("FRASE PI: ", persona1.frase("bebe"));

// if (persona1.tieneAccesorio()){
//     console.log("puede salir a la fiesta");
// }
// else{
//     console.log ("se queda en casa");
// }
// console.log("mi princesa", persona1.tieneAccesorioStr());

persona1.accesorio = "collar";
//persona1.valorDelAccesorio("perla");
console.log(persona1);

// console.log(persona1);
// console.log(persona2);

// APUNTES 24/03/22
// let persona = {
//     nombre : "Cholisa",
//     apellido: "Greñas",
//     email: "La Mars@ElCholoEd.com",
//     edad: 24,
//     nombreCompleto: function (){
//     //estamos usando string templates ${} y no es necesario concatenar
//         return `${this.nombre} ${this.apellido} ***`;

//     },
// // otra forma de reservar datos:
//     get nombreYEdad(){ //funciones reservadas con get no necesitan parentesis
//     return `${this.nombre} tiene ${this.edad}`; //Get es para obtener una propiedad
//     },
//     set cambiarNombre(nombre){ //Set es para cambiar una propiedad edntro del objeto
//     this.nombre=nombre;
//     }
// };

// console.log (persona.nombre);
// console.log (persona["nombre"] );
// persona.nombre ="Cholafne";
// console.log (persona['nombre']);
// console.log (persona.nombreCompleto());
// console.log (persona.nombreYEdad); //funciones reservadas con get no necesitan parentesis
// persona.cambiarNombre = "nuevo nombre";
// console.log(persona.nombreYEdad);

// /************************************************/
// array=[1,2,3,4];
// console.log(array.lenght); //Para obtener el # de datos del arreglo
// console.log (array.push(5)); // Para agregar un neuvo dato al arreglo
// console.log (array); //imprime el arreglo con el nuevo dato