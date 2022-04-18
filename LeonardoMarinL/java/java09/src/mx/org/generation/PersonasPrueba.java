package mx.org.generation;

public class PersonasPrueba {

	public static void main(String[] args) {
		Personas geraMedina = new Personas();
		geraMedina.nombre="Gerardo";
		geraMedina.apellido="Medina";
		geraMedina.edad=26;
		geraMedina.efectivo=20f;
		
		//System.out.println(geraMedina.nombreCompleto());
		
		Personas melissaB = new Personas("Melisa", "Balbuena", 21);
		System.out.println(melissaB.nombreCompleto());
		melissaB.efectivo=100f;
		
//		float cantidadActual = melissaB.efectivo;
//		aumentarEfectivo(cantidadActual);
//		System.out.println(melissaB.nombreCompleto());
		
		//Datos primitivos, pasan los parámetros
		int edad = 26;
		int edadNueva = edad;
		edadNueva = 30;
		System.out.println("Valor de edad: "+edad);
		
		//Los datos tipo String se comportan como valores primitivos
		//no pasan la referencia, pasan los datos
		String nombreMascota = "Solovino";
		String myPet = nombreMascota;
		myPet = "Firulais";
		System.out.println("Nombre perrito: "+nombreMascota); //Solovino
		
		//Los objetyos pasan la referencia de memoria
		Personas meli = melissaB;
		//meli.efectivo = 5000f;
		
		//aumentaDineroReal(meli);
		System.out.println(meli.nombreCompleto());

	}
	
	static void aumentarEfectivo(float dinero){
		System.out.println("Se tiene $"+dinero);
		dinero+=1000f;
		System.out.println("Total de dinero en método aumentar $"+dinero);
	}
	
	static void aumentaDineroReal(Personas humano) {
		humano.efectivo += 1000f;
		System.out.println("Total de dinero real $"+humano.efectivo);
	}

}
