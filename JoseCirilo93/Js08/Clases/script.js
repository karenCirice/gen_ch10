console.log("J08 Estamos en sesion de clases");

//let nuevoArray = new Array();
//El Nombre de las clases deben comenzar en mayúsculas
class  Persona{
    _nombre;
    _apellido;       //atributos de las clases 
    _edad;
    _arma;
    _banda;
  
    constructor(nombre, apellido, edad){ //se encarga de inicializar un objeto, es una una función especial que crea ese objeto.
        this._nombre = nombre; //this hace referencia a los atributos de la clase 
        this._apellido = apellido;
        this._edad = edad;
        this._arma = "Piedra";
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
        this.valorDelArma(nuevaArma);
    }

    set banda(nuevaBanda){
        this._banda = nuevaBanda;
    }

    frase(frase = "vato loko"){
        return  `La vida es un riesgo carnal ${frase} `
    }

    tieneArma(){
        if (this._arma ==""){
            return false;
        }
        else{
            return true;
        }
        

    }

    tieneArmaStr(){
        if (this._arma !=""){
            return "Este es de los míos";
        }
        else{
            return "Se queda viendo Bob Esponja"
        }
    }

    valorDelArma(tipoArma){
        if (tipoArma== "cuchillo"){
            this._apellido = this._apellido + " El Cuchillos"
        }

    }



}

let persona1 = new Persona("Jose", "Cortes", 25);
let persona2 = new Persona("Gera", "Perez", 26);
//console.log(personaDatos);
//console.log(personaDatos1);
console.log("Nombre Persona 1:",persona1.nombre);
console.log("Nombre Persona 2:",persona2.nombre);
persona2.nombre = "Cirilo";
console.log("Nombre Persona 2:",persona2.nombre);
persona1.arma = "pica hielo";
persona2.arma = "cuchillo";
persona1.banda = 13;
persona2.banda = "Vatos Lokos";
//console.log("Nombre Persona 1:",persona1);
//console.log("Nombre Persona 2:",persona2);
console.log("Frase P1: ",persona1.frase("rastacuas"));

if (persona1.tieneArma()){
    console.log("Puede ir al enfrentamiento");
}
else {
    console.log("Se queda en su casa");
}

console.log("Mi cholo ",persona1.tieneArmaStr());

persona1.arma = "cuchillo"
//persona1.#"cuchillo");
console.log(persona1);





