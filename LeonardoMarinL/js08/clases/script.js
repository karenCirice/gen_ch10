console.log("JS08 estamos en sesión de clases");
//las clases no tienen hoisting: no pueden usarse antes de ser declaradas

//El nombre de las clases comienza por mayúsculas
class PersonaChola{
    _nombre; //atributo 1 (por convención se comienzan con guión bajo pero puede que no se use)
    _apellido;
    _edad; //En JS no es necesario declarar los atributos aquí, pues el this. en el constructor sirve como declaración
    _arma;
    _banda;

    constructor(nombre, apellido, edad){ //permite que la clase sea inicializada y se pueden especificar qué atributos inicializar
        this._nombre = nombre;  //"this.nombre" hace referencia al atributo 1 de la clase y "nombre" al parámetro del constructor
        this._apellido = apellido; //mientras un parámetro no sea declarado, no será utilizado
        this._edad = edad; 
        this._arma = "piedra";
    }
    get nombre(){ //sirve para recuperar un atributo de la clase
        return this._nombre;
    }
    set nombre (nuevoNombre){ //sirve para cambiar el valor del atributo 
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
    frase(frase =" vato loko"){
        return `La vida es un riesgo carnal${frase}`
    }
    /**
     * verifica si la persona tiene un arma
     * @returns true si tiene arma
     */
    tieneArma(){
        if (this._arma ==""){
            return false;
        }
        else {
            return true;
        }
    }
    /**
     * 
     * @returns {string} frase 
     */
    tieneArmaStr(){
        if (this._arma ==""){
            return "Se queda viendo tele";
        }
        else {
            return "Este es de los míos";
        }
    }
/**
 * Si el parámetro es "cuchillo" al apellido de la persona se le concatenará "El Cuchillos"
 * Al usar el # se hace que la función sea privada y no pueda ser usada fuera de la clase. En este caso, solo un cambio en el set arma le dará un valor  
 * @param {string} tipoArma este parámetro es heredado del set arma(nuevaArma)
 */
    #valorDelArma(tipoArma){
        if (tipoArma=="cuchillo"){
            this._apellido +=" `El Cuchillos`";
        }
    }
}

let persona1 = new PersonaChola("El Dedotes", "Bardan", 50);
let persona2 = new PersonaChola("El Billetes", "Rayas");

//console.log(persona1);
//console.log(persona2);

console.log("Nombre Persona 1: ",persona1.nombre);
console.log("Nombre Persona 2: ",persona2.nombre);
persona2.nombre ="El Centavos";
console.log("Nombre Persona 2: ",persona2.nombre);
persona1.arma="manopla";
persona2.arma="cuchillo";
console.log("Datos Persona 1: ",persona1);
console.log("Datos Persona 2: ",persona2);
persona1.banda = "MS 13 (base10)";
persona2.banda = "Vatos Lokos";

console.log("Datos Persona 1: ",persona1);
console.log("Datos Persona 2: ",persona2);

console.log("Frase P1: ", persona1.frase());

if (persona1.tieneArma()){
    console.log("puede ir al enfrentamiento");
}
else{
    console.log("se queda en su casa");
}

console.log("Mi cholo ", persona1.tieneArmaStr());

persona1.arma = "cuchillo";
console.log(persona1);

/**
 * En JS no existe el concepto de constructor sobrecargado; el constructor puede tener el número de atributos deseados. 
 * Así mismo, si un atributo no ha sido declarado, al ser llamado (ej. persona1.armA), el atributo se crea y asigna a la clase
 */