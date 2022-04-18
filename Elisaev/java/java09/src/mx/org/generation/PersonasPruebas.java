package mx.org.generation;

public class PersonasPruebas {

	public static void main(String[] args) {
		Personas geraMedina = new Personas();
		geraMedina.nombre = "Gerardo";
		geraMedina.apellido = "Medina";
		geraMedina.edad = 26;
		geraMedina.efectivo = 20f;
//		System.out.println(geraMedina.nombreCompleto());

		Personas melissaB = new Personas("Melissa", "Balbuena", 10);
		System.out.println(melissaB.nombreCompleto());
		
		//los valores primitivos mandan los parametros
		float cantidadActual = melissaB.efectivo;
		aumentarEfectivo(cantidadActual);
		System.out.println(melissaB.nombreCompleto());
		
		aumentarDineroReal(melissaB);
		System.out.println(melissaB.nombreCompleto());
		
		
		//DAtos primiticos, pasan los parametros
		int edad =26;
		int edadNueva = edad;
		edadNueva = 30;
		System.out.println("Valor de edad: "+ edad);
		
		//los objetos,pasan la referencia en memoria
		Personas meli = MelissaB;
		meli.efectivo = 5000f; // hace referencia a los atributos de la clase Personas.
		System.out.println(melissaB.nombreCompleto());
		
		
		
	}
	static void aumentarEfectivo (float dinero) {
		System.out.println("Se tiene $ " +dinero);
		dinero += 1000f;
		System.out.println("Total de dinero en método aumentar $" + dinero);
		
	}
	
	static void aumentarDineroReal(Personas humano) {
		humano.efectivo += 1000f;
		System.out.println("Total de dinero en método aumentar $" + humano.efectivo);
	}
	
	
}