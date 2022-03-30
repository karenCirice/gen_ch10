console.log("JS08 estamos en la sesion de clases");

/* Las clases no tienen hosting, es decir que no pueden ser usados sin ser declarados antes */
/* let nuevoArray = new Array(1,2,3,4);
Solo con los arreglos se puede hacer 
let nuevoArray2 = [1,2,3,4]; 
DIFERENCIA
let nuevoArray = new Array(50); Esto te da 50 espacios.
let nuevoArray2 = [50]; Esto te da el número 50
nuevoArreglo.push(20);-se añade 20 al final
nuevoArreglo.pop();-saca el ultimo elemento
*/
/* -Para iniciar una clase se usa la palabra reservada class y se recomienda que sus nombres comienzen con letra mayuscula al inicio.
-lleva llaves{}
-Necesita un constructor o inicializador
-Se le pueden poner datos al constructor*/
/* la clase es la sustancia quimica y el constructor es el catalizador que inicia la reacción.
 */

class Persona {
  /* Se recomienda que a los tributos a los que no se deba tener acceso se le ponga un _ antes de la palabra ej. _nombre, _apellido, _edad. */
  _nombre;
  _apellido;
  _edad;
  _arma;
  _banda;

  constructor(nombre, apellido, edad) {
    /* Para saber a que nombre nos estamos refieiriendo usamos this. que hace referencia al objeto que es lo que declaramos debajo de la clase. los parameetros osn los datos declarados dentr del constructor.
this.objeto (que son los atributos) = parametros */
    this._nombre = nombre;
    this._apellido = apellido;
    this._edad = edad;
    this._arma = "piedra";
  }
  /* Para obtener el dato nombre */
     get nombre() {
         return this._nombre;
    }
  /* Para camiar el nombre */
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

    /* Para poner un metodo se utiliza una funcion pero no es necesario poner la palabra function */
    frase(frase = ""){
        return `La vida es un riesgo carnal ${frase}`
    }

    /**
     * Verifica si la persona tiene un arma
     * @returns true si tiene arma
     */
    tieneArma(){
        if (this._arma ==""){
            return false
        }
        else{
        return true;
        }
    }

    tieneBandaStr(){
        if (this._banda !=""){
            return "Su barrio lo respalda";
        }
        else{
        return "Esta solo solin solito";
        }
    }

    #valorDelArma(tipoArma){
        if (tipoArma=="cuchillo"){
        /* Esto es lo mismo que lo de abajo this._apellido = this._apellido + " el Cuchillos"; */
            this._apellido += " el Cuchillos";
        }
    }
}

let persona1 = new Persona ("El Dedotes", "Bardan", 50);
let persona2 = new Persona ("El Billetes", "Rayas");

//console.log(persona1);
//console.log(persona2);

console.log("Nombre Persona 1: ",persona1.nombre);
console.log("Nombre Persona 2: ",persona2.nombre);
/* Se asigna el nuevo nombre */
persona2.nombre = "El Centavoos";
console.log("Nombre Persona 2: ",persona2.nombre);
persona1.arma = "";
persona2.arma = "cuchillo";
persona1.banda = "Vatos lokos";
persona2.banda = "";
console.log("Datos Persona 1: ",persona1);
console.log("Datos Persona 2: ",persona2);

/* console.log("Frase P1 ", persona1.frase());
En caso de que no se mande llamar nada no sale undefinded por que ya inicialize la funcion antes con ell ="" */
console.log("Frase P1 ", persona1.frase("hommie"));

if (persona1.tieneArma()){
    console.log("Puede ir al enfrentamiento ");
}
else{
    console.log("Se queda en su casa");
}

console.log ("Este cholo ", persona1.tieneBandaStr());

if (persona2.tieneArma()){
    console.log("Puede ir al enfrentamiento ");
}
else{
    console.log("Se queda en su casa");
}



console.log ("Este cholo ", persona2.tieneBandaStr());

persona1.arma = "piedra"
//persona1.#valorDelArma("cuchillo");-Esto esta mal por que ya pusimos un # antes de una funcion (this.#valorDelArma(tipoArma)) y el # protege a la funcion y no se podrá hacer ningun cambio ni utiizar fuera  de la clase. 
console.log(persona1);