let nuevoArray = new Array(50);
let nuevoArray2 = [50];

//El nombre d ela clase debe comenzar en mayúsculas
class Persona {
    _nombre;
    _apellido;
    _edad;

    constructor(nombre, apellido, edad){
        this.nombre = nombre;
        this._apellido = apellido;
        this._edad = edad;
        this._arma = arma;
        this._banda = banda;
    }

    set nombre(nuevoNombre){
        //....
    }
    get arma(){
        return this._arma;
    }
    set arma(nuevaArma){
        this._arma = nuevaArma;
    }

    //Metodos
    frase(frase = "vato loko"){
        return `La vida es un riesgo carnal ${frase}`
    }
    tieneArma(){

    }
    tieneArmaStr(){
        if(this._arma != ""){
            return "Este es de los mios";
        }else{
            
        }
    }

}
let personaDedotes = new Persona("El dedotes", "Bardan", 50);
let personaBig = new Persona("Big Gaby", "Navajas", 18);

console.log(personaDedotes);
console.log(personaBig);

console.log("nombre Persona 1: ",persona1.nombre);
console.log("nombre Persona 2: ",persona2.nombre);
persona2.nombre = "El centavos";
console.log("nombre Persona 2: ",persona2.nombre);
persona1.arma = "pica hielos";
persona2.arma = "cuchullos";




