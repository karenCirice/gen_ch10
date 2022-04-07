package java09;

public class personasPruebas {
	
	publlic static avoid main (String[] args) {
		Personas geraMedina = new personas();
		
		
		geraMedina.nombre = "Gerardo";
		geraMedina.apellido = "Medina";
	    geraMedina.edad = 26;
		geraMedina.efectivo = 20f; 
		
		
		System.out.println(geraMedina.nombreCompleto());
		personas.melisa = new personas("melisa")
		
	}

}
Personas melissaB = new Personas("Melissa", "Balbuena", 21);
System.out.println(melissaB.nombreCompleto());	
melissaB.efectivo =100f;

/*float cantidadActual = melissaB.efectivo;
aumentarEfectivo(cantidadActual);
System.out.println(melissaB.nombreCompleto());	*/

///Datos primitivos, pasan los parametros
int edad = 26;
int edadNueva = edad;
edadNueva = 30;
System.out.println("Valor de edad: "+edad);
//los datos tipos String 
String nombreMascota = "Solovino";
String myPet = nombreMascota;
myPet = "Firulais";
System.out.println("Nomnre perrito:"+nombreMascota);


//Objetos pasan la referencia en memoria 
Personas meli = melissaB;
//se pasa la direccion 
meli.efectivo = 5000f;

//aumentaDineroReal(meli);
System.out.println(meli.nombreCompleto());	
}

//metodo para aumentar el cash no me dio 
static void aumentarEfectivo(float dinero){
System.out.println("Tiene $"+dinero);
dinero += 1000f;
System.out.println("Total de dinero $"+dinero);
}
//este si me va a dar dinero de verdad, otro metodo le voy a pasar un dato de tipo persona
static void aumentaDineroReal(Personas humano) {
humano.efectivo += 1000f;
System.out.println("Total de dinero real$"+humano.efectivo);
}
}