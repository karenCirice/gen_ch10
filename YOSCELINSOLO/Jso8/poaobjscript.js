console.log("Estamos viendo clases en J08");
//las clases no tienen hoisting: no pueden ser usados antes de ser declarados 
//El nombre de la  class debe iniciar con mayúsculas
//Para dar de alta la class necesitamos el constructor-inicializador  y ya mi class puede hacer algo
class Persona{
    _nombre; //atributos de la class
    _apellido;//el guion bajo es para que nadie más tenga acceso a nuestros atributos
    _edad;
    _poder;
    _banda;
    _arma;
    constructor(nombre,apellido,edad,poder,banda){
        this._nombre = nombre; //usando this.nombre sabemos que la variable hace referencia al atributo nombre del objeto y asi ya no hay confusión 
        this._apellido = apellido;
        this._edad = edad; 
        this._poder = poder;
        this._banda = banda;
        this._arma = "cuchillo"; //este no esta definido en los parametros, pero como lo tenemos anotado y pusimos entre comillas el valor que queremos, este atributo se aplicará a todas las personas que cree
    }
    get edadPersona(){
        return this._edad;
    }
    get nombre(){
        return this._nombre;
    }
    set nombre(nuevoNombre){
        this._nombre = nuevoNombre; //con se le cambiamos el valor a lo que queremos

    }
    get arma(){
        return this._arma //en los get no puedes poner parametros entre los parentesis
    }
    set banda(nuevaBanda){
        this._banda = nuevaBanda; //si no pones parámetros de entrada entre los parentesis no puedes hacer un set
    }
    frase(frase){
        return `La vida es un riesgo carnal ${frase}` //este es un metodo, o sea una acción y debe de llevar parametros entre los parentesis y se usa con un return. Lo escribimos con acento grave porque usamos el $ y las {}

    }
    /** verifica si la persona tiene arma, retorna un valor buleano, no necesita parametros y retorna un string frase de guerra */
    tieneArma(){
        if (this._arma == ""){
            return false;
        } else {
            return true;
        }
    }

    tieneArmaStr(){
        if (this._arma != ""){
            return "Este es de los míos";
        }else {
            return "Se queda viendo Bob Esponjaa";
        }
    }

    valorDelArma(tipoArma) {
        if(tipoArma =="cuchillo"){
            this._apellido += "El Cuchillos";
        }
    }

    set arma(nuevaArma){
        this._arma= nuevaArma;
        this.valorDelArma(nuevaArma);
    }
}
let personaDedotes = new Persona("El Dedotes", "Bardan",50);
let personaBig = new Persona ("Big Gaby", "Navajas",18);
let personaChola = new Persona ("El mijis","Sanchez",24,"navajasos","los altos");
let persona2 = new Persona ("El Billetes","Rayas");
console.log(personaDedotes);
console.log(personaBig);
console.log(personaChola);
console.log(personaBig.edadPersona);
console.log(personaBig.nombre);
console.log(persona2.nombre);
persona2.nombre = "EL CENTAVOS" //así se hace un set
console.log("Nombre persona 2 ", persona2.nombre);
personaChola._arma = ""; //si le quito el arma, nos retorna false por lo que no puede ir al enfrentamiento
persona2._arma = "cuchillo";
console.log("Datos persona Chola ",personaChola);
console.log("Datos persona 2 ", persona2);
persona2._banda = "MS 13(BASE10";
personaChola._banda = "VATOS LOKOS";
console.log("Frase personaChola", personaChola.frase("hoomie"));
if (personaChola.tieneArma()){
    console.log("Puede ir al enfrentamiento");
} else {
    console.log("Se queda en su casa")
}
console.log("Mi cholo ",persona2.tieneArmaStr());

persona1.arma ="piedra"
persona1.valorDelArma("cuchillo");
console.log (persona1);

//La función # protege la función de que no sea cambiada solo dentro de la clase, hay un atajo para que este se ponga en 
// todas las funciones dentro de la clase, con click derecho y change all osccurances y la reescribo como quiero que quede
//hicimos un ejemplo poniendo en la función ValorDelArma un #