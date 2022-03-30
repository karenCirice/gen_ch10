console.log("JS08 Clases");

let nuevoArray = new Array(); //Esto es nuestro contructor//Inicialización, inicializar un objeto de una clase. En el constructor se asignan los valores iniciales del nuevo objeto.
let nuevoArray2 = [];
nuevoArray.push(20);
nuevoArray.pop();
////////////////////////////////////////////////////////////////////////////

//El nombre de las clases de deben de declarar en mayusculas.

class Heroes{ //Para declarar las clases se coloca CLASS.
    nombre; 
    villano; //Este es nuestros Atributos dentro de la class.
    ciudad;
    poderes;
    ocupacion;
    ayudante;

    //En nuestro contructor colocamos nuestros valores iniciales del objeto.
    constructor(nombre,villano,ciudad,poderes,ocupacion,ayudante){//Sirve inicializar un objeto con estas funsion.
        this.nombre = nombre; // (this) nos hace referencia a los Atributos de la clase.
        this.villano = villano;
        this.ciudad = ciudad;
        this.poderes = poderes;
        this.ocupacion = ocupacion;
        this.ayudante = ayudante;
    }

    //Sirve para darles accesos a las propiedades de los objetos para computar/ cambiar otras propiedades.

    get nombre(){ //Se coloca el valor del constructor.
        return this.nombre; //Se escribe el atributo.
    }

    set nombre(nuevonombre){ //se registra el valor del cosntructor con el valor/variable nuevo que se incorpora.
        this.nombre = nuevonombre; //Atributo con el nuevo valor/variable.
    }

    set poderes(nuevopoder){
        this.poderes = nuevopoder;
        this.ValorPoderes(nuevopoder);
    }
    //Acción que se llama FRASE.
    frase(frase = ""){ 
        return `Mueres siendo un Heroe o vives demaciado parar ser un villano${frase}`
    }

    tieneAyudantes(){ //Para saber si tiene o no un ayudante.
        if (this.ayudante == ""){ //Se coloca el atributto es igual al valor que se le asigno "ayudante".
            return false;
        }
        else{
            true;
        }
    }

    
    tieneAyudantesStr(){ //Para saber si tiene se regresa un string.
        if (this.ayudante == ""){ 
            return "Tiene super amigos";
        }
        else{
            "Trabaja soló solin solito";
        }
    }

    ValorPoderes(tipoPoderes){
        if(tipoPoderes == "Fuerza de la velocidad"){
            this.nombre = this.nombre + "Wally Wets";
        }
    }

}

let Batman = new Heroes("Bruce Wayne","Joker","Gotham","Ninguno", "Millonario","Robin");

let Spiderman = new Heroes("Peter Parket","Duende Verde","New york","Poderes de Araña", "Fotografo");

let Flash = new Heroes("Barry Allen", "ReversFlash","City Central","Fuerza de la velocidad","Forence","Kid Flash")

////////////////////////////////////////////////////////7
console.log("Nombre Batman:" , Batman.nombre);
Batman.nombre = "Drick Jason"

console.log("Nombre Spiderman:" , Spiderman.nombre);
//Se cambia el nombre por otro por medio de GET y SET.
Spiderman.nombre = "Miles Morales";

console.log("Poderes Batman:" , Batman.poderes);
Batman.poderes = "Tecnologia"

Batman.ayudante = "Robin";
Spiderman.ayudante = "No tiene";

//imprimir la frase que se coloco arriba.
console.log("Frase Bat:", Batman.frase()); //Se tiene que agregar () en frase para agregar el return.

/////////////////////////////////////////////////////

if(Batman.tieneAyudantes()){
    console.log("Tiene ayuda de más heroes");
}
else{
    console.log("Trabaja Soló");
}
//////////////////////////////////////////////////////////

Flash.poderes = "Fuerza de la velocidad"
// Flash.ValorPoderes("fuerza de la velocidad");
console.log(Flash);

/////////////////////////////////////////////
console.log(Batman);
console.log(Spiderman);
