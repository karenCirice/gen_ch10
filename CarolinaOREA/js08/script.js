console.log("js08")

class Persona{
    nombre; //atributos de la clase
    apellido;
    edad;
    arma;
    banda;

    constructor (nombre, apellido, edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.arma = "picahielo";
    }
    get nombre(){
        return this.nombre;
    }
    
    set nombre(nuevoNombre){
        this.nombre = nuevoNombre;
    }

    tieneArma(){
        if(this.arma != ""){
            return true
        }
        else{
            return false
        }
    }
}

let persona1 = new Persona("Coqui", "Yuis",28);
let persona2 = new Persona("Cayiyo", "Orea", 29);

console.log(persona1)


