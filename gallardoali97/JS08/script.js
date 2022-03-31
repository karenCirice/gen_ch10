console.log("J08 Estamos en sesión de clases, ese loko");

let nuevoArray = new Array(2,3,4,5,6);//si se decclara un solo dato (n) n es el número de posiciones
let nuevoArray2= [50];
//El nombre de las clases debe comenzar en mayúsculas
class PersonaChola{
    _nombre;  // el guión bajo representa una advertencia para no ser modificado
    _apellido;
    _edad;
    _arma;
    _banda;
    constructor(nombre,apellido,edad){ //nos ayuda a inicializar los atributos de la clase
    this._nombre= nombre;
    this._apellido= apellido;
    this._edad= edad;
    }
    get nombre(){
        return this._nombre;
    }
    set nombre(nuevoNombre){
        this._nombre=nuevoNombre;
    }
    get arma(){
        return this._arma;
    }
    set arma(nuevaArma){
        this._arma=nuevaArma;
        this.#valorDelArma(nuevaArma);
    }
    set banda(nuevaBanda){
        this._banda=nuevaBanda;
    }
    frase(frase ="vato loko"){
        return`La vide c´est un risque ${frase}`
    }
    tieneArma(){
        if(this._arma ==""){
            return false;
        
        }else {
         return true;
        }
        
    }
    tieneArmaStr(){
        if (this._arma !=""){
            return "Este si rifa";
        }else{
            return "Se queda viendo Sponge Bob";
        }
    }
    #valorDelArma(tipoArma){
    if (tipoArma=="cuchillo"){
        this._apellido+=" alias El Cuchillos";
    }
    }
}

let personaDedotes = new PersonaChola("El Dedotes","Gallardo",24);//asignamos valores a nuestro objeto de la clase.
let persona2= new PersonaChola("El Billetes","Yyy");
personaDedotes.arma="manopla";
persona2.arma="Filero";
personaDedotes.banda="Sur 13";
persona2.banda="Vatos Lokos";
console.log("Persona 1:"+personaDedotes.nombre);
console.log("Persona 2:"+persona2.nombre);
persona2.nombre="El jeringas";
console.log("Datos de persona 1: ",personaDedotes);
console.log("Datos de persona 2: ",persona2);
// console.log("Frase 1: ", persona2.frase("homms"));
// if (persona2.tieneArma()){
//     console.log("Le entra al trense");
// }
// else{
//     console.log("Nelson, no va");
// // }
// console.log("Mi cholo", personaDedotes.tieneArmaStr());
persona2.arma="cuchillo";