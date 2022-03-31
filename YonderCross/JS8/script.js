console.log("JS8 Objetos ");

let nuevoArray = new Array(50);
let nuevoArray2 = [50];

//El nombre de las clases debe comenzar en mayusculas
class Persona{
    nombre; //atributos de la clase
    _apellido;
    _edad;

    constructor(nombre, apellido, edad, arma){
        this.nombre = nombre; //this hará referencia a lps atributos de la 
        this._apellido = apellido;
        this._edad = edad;
    }
    get nombre(){
        return this.nombre;
    }
    set nombre(nuevoNombre){
        this.nombre = nuevoNombre;
    }
    get arma(){
        return this._arma;
    }
    set arma(nuevaArma){
        this._arma = nuevaArma;
        this.valorDelArma(nuevaArma);
    }
    get banda(){
        return this._banda;
    }
    set banda(nuevaBanda){
        this._banda = nuevaBanda;
    }

    frase(frase = "vato loko"){
        return `La vida es un riesdo ${frase}`;
    }
    tieneArma(){
        if (this._arma == ""){
            return false;
        }
        else{
            return true;
        }
    }
    valorDelArma(tipoArma){
        if(tipoArma=="cuchillo"){
            this._apellido += " El Cuchillos";
        }
    }
}

let persona1 = new Persona("El Dedotes","Bardan", 50);
let persona2 = new Persona("Big gaby", "Nadvajas", 18);


persona1.arma = "navaja";
persona2.arma = "piedra";
console.log(persona1);
console.log(persona1.nombre);
console.log(persona2);
persona1.nombre = "Nike";
console.log(persona1.nombre);
console.log(persona1.frase("Hommie"));

if (persona1.tieneArma()){
    console.log("Puede ir");
}
else {
        console.log("Se queda");
    }


    persona1.arma = "cuchillo"
    console.log(persona1)