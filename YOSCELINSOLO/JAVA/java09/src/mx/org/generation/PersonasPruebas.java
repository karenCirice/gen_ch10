/**
 * 
 */
package mx.org.generation;

/**
 * @author Yoscelín RS
 *7 abr. 2022
 */

//En esta clase vamos a crear un nuevo objeto de tipo personas 
		//Esta clase va a mandar a llamar a la clase Personas.Java



public class PersonasPruebas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Personas geraMedina = new Personas ();
		geraMedina.nombre = "Gerardo";
		geraMedina.apellido = "Medina";
		geraMedina.edad = 23;
		geraMedina.efectivo = 20f;
		
		System.out.println(geraMedina.nombreCompleto());
		
		Personas melissaB = new Personas("Melissa", "Balbuena",23);
		System.out.println(melissaB.nombreCompleto());
		melissaB.efectivo = 100f;
		
	//	float cantidadActual = melissaB.efectivo;
	//	aumentarEfectivo(cantidadActual);
	//	System.out.println(melissaB.nombreCompleto());
		
		//Datos primitivos, pasan los parámetros
		
		int edad = 26;
		//Se pasa el valor
		int edadNueva = edad;
		edadNueva = 30;
		System.out.println("Valor de edad: " + edad);  //26
		
		//Los datos de tipo String
		String nombreMascota = "Solovino";
		String myPet = nombreMascota;
		myPet = "Firulais";
		System.out.println("Nombre del perrito :" + nombreMascota);
		
		//Los objetos, pasan la referencia en memoria
		Personas meli = melissaB;
		meli.efectivo = 5000f;  //.efectivo es un atributo y este no necesita los () para inicializarse
		System.out.println(melissaB.nombreCompleto());  //.nombreCompleto es un método y este necesita los () para inicializarse
		
		aumentaDineroReal (meli);
		System.out.println(meli.nombreCompleto());
		
	}
	 static void aumentarEfectivo(float dinero) {
		 System.out.println("Se tiene $"+ dinero);
		 dinero +=1000f;
		 System.out.println("Total de dinero en método aumentar $" + dinero);
	 }
	 
	 static void aumentaDineroReal(Personas humano) {
		 humano.efectivo += 1000f;
		 System.out.println("Total de dinero real $" + humano.efectivo);
		
		
		

	}

}
