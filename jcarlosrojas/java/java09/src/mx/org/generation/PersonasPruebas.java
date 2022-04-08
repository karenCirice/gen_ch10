package mx.org.generation;

public class PersonasPruebas {

	public static void main(String[] args) {
		Personas geraMedina = new Personas();
		
		geraMedina.nombre = "Gerardo";
		geraMedina.apellido = "Meedina";
		geraMedina.edad = 23;
		geraMedina.efectivo = 20f;
		
		System.out.println(geraMedina.imprimeNombreCompleto());
		
		
		Personas melissaB = new Personas("Melissa", "Balbuena", 17);
		System.out.println(melissaB.imprimeNombreCompleto());
		melissaB.efectivo = 100f;
		
//		float cantidadActual = melissaB.efectivo;
//		aumentarEfectivo(cantidadActual);
		
		Personas meli = melissaB;
		meli.efectivo = 5000f;
		
		aumentaDineroReal(meli);
		System.out.println(melissaB.imprimeNombreCompleto());

	}
	
	static void aumentarEfectivo(float dinero) {
		System.out.println("Se tiene $"+dinero);
		dinero += 1000f;
		System.out.println("Total de dinero en metodo aumentar $"+dinero);
	}
	
	static void aumentaDineroReal(Personas humano) {
		humano.efectivo += 1000f;
		System.out.println("Total de dinero real $"+humano.efectivo);
	}

}
