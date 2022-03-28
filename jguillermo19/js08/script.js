console.log("JS08 Estamos en sesión de clases");

// El nombre de las clases debe comenzar en mayusculas
class Persona{
    _nombre; //atributos de la clases
    _apellido;
    _edad;
    _arma;
    _banda;

    constructor(nombre,apellido,edad){
        this._nombre = nombre; //this hará referencia a los atributos de la clase
        this._apellido = apellido;
        this._edad = edad;
        this._arma = "piedra";
    }

    get nombre(){
        return this._nombre;
    }

    set nombre(nuevo_nombre){
        this._nombre = nuevo_nombre;
    }

    set arma(nueva_arma){
        this._arma = nueva_arma;
    }
    set banda(nueva_banda){
        this._banda = nueva_banda;
    }

    frase(frase = "vato loko"){
        return `La vida es un riesgo ${frase}`;
    }
}

let persona1 = new Persona("El Dedotes","Bardan",50);
let persona2 = new Persona("La Kimberly","Yosstlin",18);

console.log("Nombre Persona1: ",persona1.nombre);
console.log("Nombre Persona2: ",persona2.nombre);

persona2.nombre = "Tiffany";
console.log("Nombre Persona2: ",persona2.nombre);

persona1.arma = "manopla";
persona2.arma = "cuchillo";

persona1.banda = "MS 13";
persona2.banda = "Batos lokos";

console.log("Datos Persona1: ",persona1);
console.log("Datos Persona2: ",persona2);

console.log("Frase P1", persona1.frase("hommy"));