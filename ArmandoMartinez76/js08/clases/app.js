console.log("Estamos en sesion de Clases")

let nuevoArray = new Array(2, 3, 5, 6);
let nuevoArray2 = [2, 3, 4, 5]; // otro formato de declarar un array
nuevoArray.push


// Clases no pueden usados sin antes de declararse

//El nombre de las clases debe comenzar en mayusculas
class Persona{
    _nombre;
    _apellido;
    _edad;
    _pais;
    _comida
    _altura

    constructor(nombre, apellido, edad, pais, comida, ){
        this._nombre = nombre;
        this._apellido = apellido;  // con this distingue entre los atributos de la clase y los parametros
        this._edad = edad;
        this._pais = pais;
        this._comida = comida;
        
        
    }
    get nombre(){
        return this._nombre;
    }

    set nombre(nuevoNombre){
        this._nombre = nuevoNombre;
    }

    get edad(){
        return this._edad;
    }

    set edad(nuevoEdad){
        this._edad = nuevoEdad;
    }

    get altura(){
        return this._altura;
    }

    set altura(nuevoAltura){
        this._altura = nuevoAltura;
    }

    frase(frase){
        return `La vida se me a pasado volando ${frase}`;
    }

    tieneEdad(){
        if (this._edad >= 18){
            return true;
        }
        else{
            return false;
        }
    }

    valorEdad(nuevoEdad){
        if(nuevoEdad => 18){
        this._apellido = this._apellido + "El anciano" ;
        }
    }

    }



let personaNueva = new Persona("Armando", "Martinez", "26", "Mexico", "Tacos");
let personaNueva2 = new Persona("Yoscelin", "Ramirez", "27", "Mexico", "No tengo idea que te guste");
console.log(personaNueva)
console.log(personaNueva2)

personaNueva2.nombre = "Niña"
personaNueva2.edad = "27"

personaNueva.altura = "1.75"
personaNueva2.altura = "1.59"

console.log(personaNueva.nombre)
console.log(personaNueva2.nombre)
console.log(personaNueva2.edad)

console.log("Datos Persona 1:" , personaNueva);
console.log("Datos Persona 2:" , personaNueva2);

console.log("Frase de la persona Nueva ", personaNueva.frase("y nunca mas volvera"));

if (personaNueva.tieneEdad()){
    console.log("La persona tiene edad para entrar a la fiesta")
}else{
    console.log("La persona no tiene edad para entrar a la fiesta")
}
if (personaNueva2.tieneEdad()){
    console.log("La persona tiene edad para entrar a la fiesta")
}else{
    console.log("La persona no tiene edad para entrar a la fiesta")
}

if (personaNueva.tieneEdad()){
    console.log("Armando Ya estas viejo")
}else{
    console.log("Todavia eres chavo")
}
if (personaNueva2.tieneEdad()){
    console.log("Yoscelin Ya estas viejita")
}else{
    console.log("No estas viejita")
}

console.log("Armando tiene ", personaNueva.edad, " años")
console.log("Yoscelin tiene ", personaNueva2.edad, " años")
console.log(personaNueva)