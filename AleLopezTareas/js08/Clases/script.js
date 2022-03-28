console.log( "estamos js08. sesión de Clases")

class Persona{

    nombre;
    apellido;
    edad;

    constructor(nombre, apellido, edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = 
    }
}

set nombre(nuevoNombre){

}
get arma(){
    return this._arma;

}
set arma(nuevaArma){
    this._arma = nuevaArma;

}
set banda(nuevaBanda){

}
frase(frase = "vato loko"){
    return `La vida es un riesgo carnal ${frase}`
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
    if(this._arma != ""){
        return "este es de los míos";
    }
    else{

    }
}


let persona1= new Persona("el dedotes", "bardan",50);
let persona2= new Persona("el billetes", "rayas");

console.log("nombre persona 1: ",perosna1.nombre);
console.log("nombre persona 2: ",perosna2.nombre);
persona2.nombre =" el centavos";
console.log("nombre persona 2: ", persona2.nombre);
persona1.arma="pica hielo";
persona2.arma="cuchillo";

console.log("frase p1: ", persona.frase("rastacuas"));

if(persona1.tieneArma()){
    console.log("se qeuda en su casa");
}
console.log("mi cholo", persona1.tieneArmaStr());
