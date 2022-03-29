console.log('JS08. Estamos en sesión de clases');

nuevoArray = new Array();

// Clase persona
class Persona{
    // En JS no es necesario declarar los atributos al principio de la clase ya que mediante this en el constructor o funciones dentro de la clase hace alusión a los parametros de la clase
    // El '_' es una convencion que le indica a los otros programadores tener cuidado en no acceder directamente a estos atributos
    _nombre;
    _apellido;
    _edad;
    _arma;
    _banda;

    // En JS solo se usa un constructor y en él se pueden o no especificar los atributos, para aquellos no especificados en la inicialización se accede con las funciones get y set
    constructor(nombre, apellido, edad){
        this._nombre = nombre;
        this._apellido = apellido;
        this._edad = edad;
        this._arma = 'piedra';
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
        this._arma =nuevaArma;
        this.#valorDelArma(nuevaArma);
    }

    // No sé necesita un get para usar un set
    set banda(nuevaBanda){
        this._banda =  nuevaBanda;
    }

    /**
     * @function frase Tiene como parametro una cadena que se concatenara con una frase ya dada, en caso de no recibir ningún parametro por el usuario este ya se encuentra con un valor por default 'vato loko'
     * @param {string} frase 
     * @returns Retorna una concatenación entre una frase dada y el parametro
     */
    frase(frase = 'vato loko'){
        return `La vida es un riesgo ${frase}`;
    }

    tieneArma(){
        if (this._arma != '') {
            return true;
        } else {
            return false;
        }
    }

    tieneArmaStr(){
        if (this._arma != '') {
            return 'Este es de los míos';
        } else {
            return 'Se queda viendo Bob Esponja'
        }
    }

    // el simbolo # hace a la función privada, de esta forma la función solo se puede usar dentro de la clase, fuera no es posible
    #valorDelArma(tipoArma){
        if (tipoArma == 'cuchillo') {
            this._apellido += 'El Cuchillos';
        } 
    }
}

let persona1 =  new Persona('El dedotes', 'Bardan', 50);
let persona2 = new Persona('El Billetes', 'Rayas');

console.log('Nombre Persona 1: ', persona1.nombre);
console.log('Nombre Persona 2: ', persona2.nombre);
// Para usar el set NO es persona.nombre('nombre') se hace como la línea siguiente
persona2.nombre = 'El Centavos';
console.log('Nombre Persona 2: ', persona2.nombre);
persona1.arma = 'pica hielo';
persona2.arma = 'cuchillo';
persona1.banda = 13;
persona2.banda = 'Vatos Lokos';
// console.log('Datos de persona 1: ', persona1);
// console.log('Datos de persona 2: ', persona2);
// console.log('Frase P1: ', persona1.frase('hommie'));

// if (persona1.tieneArma) {
//     console.log('Puede ir al enfrentamiento');
// } else {
//     console.log('Se queda en su casa');
// }
// console.log(persona1.tieneArma());
// console.log(persona2.tieneArma());

// console.log('Mi cholo', persona1.tieneArmaStr());
// console.log(persona2.tieneArmaStr());

persona1.arma = 'cuchillo';
console.log(persona1);