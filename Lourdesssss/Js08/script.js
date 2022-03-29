console.log("Estamos en sesión de clases, ese loko");

//declaramos el array
let nuevoArray = new Array(50);
let nuevoArray2 = [50];

//el nombre de las clases debe comenzar en mayúsculas
class Persona {
    //atributos de las clases
    _nombre;
    _apellido;
    _edad;
    _arma;
    _banda;

    //colocamos el constructor
    constructor(nombre,apellido,edad){
        //this hace referencia a los atributos de la clase
        this._nombre = nombre; 
        this._apellido = apellido;
        this._edad = edad;
        this._arma = "piedra";
    }

    get edadPersona(){
        return this._edad;
    }
    get nombre(){
        return this._nombre;
    }
    set nombre(nuevoNombre){
        this._nombre = nuevoNombre; //con set se le cambia el valor a lo que queremos y se colocan parámetros

    }
    get arma(){
        return this._arma //en los get no puedes poner parametros entre los parentesis

    }
    set banda(nuevaBanda){
        this._banda = nuevaBanda;
    }
    frase(frase){
        return `La vida es un riesgo carnal ${frase}`

    }
}

let personaDedotes = new Persona("El Dedotes", "Bardan",50);
let personaBig = new Persona ("Big Gaby", "Navajas",18);
let personaChola = new Persona ("El mijis","Sanchez",24,"navajasos","los altos");
let persona2 = new Persona ("El Billetes","Rayas");
personaChola._arma = "";
persona2._arma = "cuchillo";
console.log(personaDedotes);
console.log(personaBig);
console.log(personaChola);
console.log(personaBig.edadPersona);
console.log(personaBig.nombre);
console.log(persona2.nombre);

if (personaChola.tieneArma()){
    console.log("Puede ir al enfrentamiento");
} else {
    console.log("Se queda en su casa")
}
console.log("Mi cholo ",persona2.tieneArmaStr());
personaBig.arma = "piedra";
personaBig.valorDelArma("cuchillo");
console.log(personaBig);
