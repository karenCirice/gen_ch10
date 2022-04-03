class Persona{
    _nombre;    //atributos de la clase
    _apellido;
    _edad;
    _arma;
    _banda;

    constructor(nombre, apellido, edad){
        this._nombre=nombre;    //this hara referencia los nombres de la clase
        this._apellido=apellido;
        this._edad=edad;
        this._arma="piedra";
    }

    get nombrePersona(){
        this._nombre;
    }

    /**
     * Ingresa el nuevo nombre
     * @param {string} nuevoN
     */
    set nombreNuevo(nuevoN){
        this._nombre=nuevoN;
    }

    get armaUser(){
        return this._arma;    
    }

    /**
     * Ingresa el nombre nuevo de la arma
     * @param {string} nuevaAr
     */
    set armaNueva(nuevaAr){
        this._arma=nuevaAr;
    }

    /**
     * Ingresa la nueva banda
     * @param {string} nuevaB
     */
    set bandaNueva(nuevaB){
        this._banda=nuevaB;
    }

    frase(fraseNueva){
        return `La frase es: ${fraseNueva}`;
    }

    tieneArma(){
        if(this._arma != ""){
            return true;
        }
        else{
            return false;
        }
    }
}

let persona1 = new Persona("Eduardo", "Campos", 24);
let persona2 = new Persona("Paola", "Camarillo");

console.log("El nombre es: "+persona1._nombre);
console.log("El nombre es: "+persona2._nombre);

persona1.armaNueva = "Rifle";
console.log(persona1.armaUser);

console.log(persona1.frase("La vida es un riesgo"));

if (persona1.tieneArma()) {
    console.log("Puede pelear");
}
else{
    console.log("No puede pelear")
}

