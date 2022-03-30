
console.log("J08 Estamos en sesión de clases, ese loko");

let nuevoArray = new Array(50);
let nuevoArray2 = [50];

//El nombre de las clases debe comenzar en mayúsculas
class Persona{
    _nombre; //atributos de las clases
    _apellido;
    _edad;
    _arma;
    _banda;


    cosntructor(nombre, apellido, edad, arma, banda){
        this._nombre = nombre;   //this hará referencia a los atributos de las clases
        this._apellido = apellido;
        this._edad = edad;
        this._arma = arma;
        this._banda = banda;
    }
    
    get nombre(){
        return this._nombre;
    }
    
    set nombre(nuevoNombre){
        this._nombre = nuevoNombre;
    } 
    
    get arma(){
        return this._arma;
    }
    
    set arma(nuevaArma){
        this._arma = nuevaArma;
        this.#valorDelArma(nuevaArma);
    }
    
    set banda(nuevaBanda){
        this._banda = nuevaBanda;
    }
    
    frase(frase = "vato loko"){
    
    }
    
    tieneArma(){
    }
    
    tieneArmaStr(){
        if(this._arma != ""){
            return "Este es de los míos";
        } else {
            return "Se queda viendo Bobo Esponja";
        }
    }
    
    #valorDelArma(tipoArma){
        if(tipoArma == "cuchillo"){
            this.valorDelArma(nuevaArma);
        }
    }
}

let persona1 = new Persona("El Dedotes", "Bardan", 50, "cuchillo", 10);
let persona2 = new Persona("El Billetes", "Rayas", 10, "cuchillo", 10);

//console.log(persona1);
//console.log(persona2);
console.log("Nombre Persona 1:", persona1.nombre);
console.log("Nombre Persona 1:", persona2.nombre);
persona2.nombre = "El centavos";
console.log("Nombre Persona 2:", persona2.nombre);
persona1.arma = "pica hielo";
persona2.arma = "cuchillo";
persona1.banda = 13;
persona2.banda = "Vatos Lokos";
//console.log("Datos Persona 1:", persona1);
//console.log("Datos Persona 2:", persona2);
//console.log("Frase P1: ", persona1.frase("rastacuas"));

/* 
if (persona1.tieneArma()){
    console.log("Puede ir al enfrentamiento");
}
else {
    console.log("Se queda en su casa");
}
*/

persona1.arma = "piedra"
//persona1.valorDelArma("cuchillo");
//persona1.#valorDelArma("cuchillo"); protege valor dentro de la llave
console.log(persona1);
