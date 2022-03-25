console.log("Funciona !!!")

class Persona{
    _nombre;
    _apellido;
    _edad;
    _ocpuacion

    constructor(nombre, apellido, edad){
        this._nombre = nombre;
        this._apellido = apellido;
        this._edad = edad;
    }

    set ocpuacion(nuevaOcupacion){
        return this._ocpuacion = nuevaOcupacion;
    }

    tieneEmpleo(){
        if(this._ocpuacion == ""){
            return false;
        }else{
            return true;
        }
    }
}

let eddie = new Persona("Eddie", "Tena", 25)
eddie.ocpuacion = "Ingeniero";
console.log(eddie);
console.log("La ocupación del Eddie es: " + eddie._ocpuacion);

console.log("----------------------------------------------------")
console.log(`Le nombre de este man es ${eddie._nombre}, su apellido es ${eddie._apellido}, su edad ronda por ahí de los ${eddie._edad}, y su ocupación es ${eddie._ocpuacion}`);

if(eddie.tieneEmpleo){
    console.log("Puede mantenserse");
}else{
    console.log("Es mantenido");
}