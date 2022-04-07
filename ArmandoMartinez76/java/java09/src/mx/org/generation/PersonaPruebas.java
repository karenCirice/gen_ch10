package mx.org.generation;

public class PersonaPruebas {

	public static void main(String[] args) {
		Personas geraMedina = new Personas();
		geraMedina.nombre = "Gereardo";
		geraMedina.apellido = "Medina";
		geraMedina.edad = 23;
		geraMedina.efectivo = 20F;
		System.out.println(geraMedina.NombreCompleto());
		
		Personas melissaB = new Personas("Melissa", "Balbunea", 35);
		System.out.println(melissaB.NombreCompleto());
		
		
		
		float cantidadActual = melissaB.efectivo;
		aumentarEfectivo(cantidadActual);
		System.out.println(melissaB.NombreCompleto());
		
		int edad = 26;
		int edadNueva = edad;
		edadNueva = 30;
		System.out.println("Valor de edad: " + edad);
		
		
		//Los datos de tipo String, se comportan como valores primitivos
		//no pasan la referencia, pasan los datos
		String nombreMascota = "Solovino";
		String myPet = nombreMascota;
		myPet = "Firulais";
		System.out.println("Nombre d e perrito" + nombreMascota);
		
		
		Personas meli = melissaB;
		meli.efectivo = 5000f;
		
		aumentaDineroReal(meli);
		System.out.println(meli.NombreCompleto());
	}
	
	static void aumentarEfectivo(float dinero){
		System.out.println("Se tiene $" + dinero);
		dinero += 1000f;
		System.out.println("Totalk de dienro $" + dinero);
	}
	
	static void aumentaDineroReal(Personas humano) {
		humano.efectivo += 100f;
		System.out.println("Total de dinero real $ " + humano.efectivo); 
	}

}

