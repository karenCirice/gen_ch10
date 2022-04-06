console.log("Estoy cantando");

let persona = {
    nombre: "Alex",
    apellido: "Perez",
    email: "google@hotmail.com",
    edad: "25"
    nombreCompleto: function (){
        return '$(this.nombre) $(this.apellido) ***';
    }
    get nombreYEdad(){
        return '${this.nombre} tiene $(this.edad}';
    }
};

//llamar funciones de dif forma
console.log(persona.nombre);
console.log(persona["nombre"]);
persona.nombre= "Karla";
console.log(persona.nombreCompleto());
console.log(persona.nombreYEdad);

//*****************************************
/*array =[1,2,3,4];
console.log(arra.length);
console.log(array.push(5));
console.log(array);*/
