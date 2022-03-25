console.log("J08 Estamos en la sesión de clases");

let nuevoArray = new Array();
let nuevoArray2 = [];

//El nombre de las clases debe comenzar con mayúsculas
class Persona{
    //Atributos de clase
    nombre;
    apellido;
    edad;
    arma;
    banda;

    //El constructor inicializa las propiedades del objeto
    constructor(nombre, apellido, edad, banda){
        this.nombre = nombre;  //This hace referencia al atributo de la clase
        this.apellido = apellido;
        this.edad = edad;
        this.arma = "piedra";
        this.banda = banda;
    }

    //Obtener
    get nombrePersona(){
        return this.nombre;
    }

    //Cambiar
    set nombrePersona(nuevoNombre){
        this.nombre = nuevoNombre;
    }

    get arma1(){
        return this.arma;
    }

    set arma1(nuevaArma){
        this.arma = nuevaArma;
        this.#valorDelArma(nuevaArma);
    }

    get banda1(){
        return this.banda;
    }

    set banda1(nuevaBanda){
        this.banda = nuevaBanda;
    }

    //Metodo
    frase(frase){
        return `La vida es un riesgo ${frase}`
    }

    //Nos indica si la persona tiene un arma
    tieneArma(){
        if (this.arma == ""){
            return false;
        }
        else{
            return true;
        }
    }

    tieneArmaStr(){
        if(this.arma != ""){
            return "Este es de los mios";
        }
        else{
            return "Se queda viendo Bob Esponja";
        }
    }

    #valorDelArma(tipoArma){ //El # protege la función para que no se puedan hacer cambios fuera de la clase
        if (tipoArma == "cuchillo"){
            this.apellido += "El Cuchillos";
        }
    }
}

let persona1 = new Persona("El Dedotes", "Bardan", 50);
let persona2 = new Persona("Big Gaby", "Navajas", 18);

//console.log(persona1);
//console.log(persona2);
console.log("Persona 1", persona1.nombrePersona);
console.log("Persona 2", persona2.nombrePersona);
persona2.nombrePersona = "El Centavos";
console.log("Persona 2", persona2.nombrePersona);
persona1.arma1 = "";
persona2.arma1 = "Cuchillo";
persona1.banda1 = "MS 13";
persona2.banda1 = "Vatos Lokos";
console.log("Persona 2 datos", persona2);
console.log("Persona 1 datos", persona1);

console.log("Frase P1: ", persona1.frase("homie"));

if(persona1.tieneArma()){
    console.log("Puede ir al enfrentamiento");
}
else{
    console.log("Se queda en su casa");
}

console.log("Mi cholo", persona1.tieneArmaStr());

persona1.arma1 = "cuchillo"
console.log(persona1);