console.log("js08 sesión de clases")

let nuevoArray = new Array(1,2,3,4);
let nuevoArray2=[50];

class Persona{
    _nombre; //el guión bajo es como decir que es private
    _apellido;
    _edad;
    _banda;
    _arma;

    constructor(nombre, apellido, edad, banda, arma){
        this._nombre =nombre;
        this._apellido=apellido;
        this._edad=edad;
        this._banda=banda;
        this._arma=arma;
    }

    get nombre(){
        return this._nombre;
    }

    set nombreNuevo(nuevoN){
        this._nombre=nuevoN;
    }

    set modBanda(nuevaBanda){
        this._banda=nuevaBanda;
    }

    set arma(nuevaArma){
        this._arma=nuevaArma;
        this.valorDelArma(nuevaArma);
    }
    //método de la clase persona
    tieneArma(){
        if(this._arma != ""){
            return true;
        }else{
            return false;
        }
    }

    valorDelArma(tipoArma){
        if(this._arma=="Cuchillo"){
            this._apellido+=" "+tipoArma;
        }
    }

    /*El asterisco sirve como private de atributos y métodos*/
    #valorDelBarrio(nuevoBanda){
        this._banda=nuevoBanda;
    }
}

//se instancia un objeto de la clase persona
let cholo1 =new Persona("crico", "del 8", 23, "Vatos Locos", "filero");
//se muestra
console.log(cholo1);
console.log(cholo1._nombre);

cholo1.nombreNuevo="El dedotes";
cholo1.modBanda="PGA"
console.log(cholo1);

if(cholo1.tieneArma()){
    console.log("Ve a la guerra");
}else{
    console.log("No le entre man");
}

cholo1.arma="Cuchillo";
console.log(cholo1);