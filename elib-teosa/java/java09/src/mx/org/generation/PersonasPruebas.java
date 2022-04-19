package mx.org.generation;

public class PersonasPruebas {

	public static void main(String[] args) {
//		Personas geraMedina = new Personas();
//		geraMedina.nombre = "Gerardo";
//		geraMedina.apellido = "Medina";
//		geraMedina.edad = 26;
//		geraMedina.efectivo = 20f;
//		
//		System.out.println(geraMedina.imprimeNombreCompleto());
		
		Personas melissaB = new Personas("Melissa", "Balbuena", 21);
		System.out.println(melissaB.imprimeNombreCompleto());
		//float cantidadActual = melissaB.efectivo;
		//melissaB.efectivo = aumentarEfectivo(cantidadActual);
		
		// los objetos pasan la referencia en memoria cuando son asignados a 
		// otro objeto del mismo tipo, por lo tanto ambos objetos apuntan a la
		// misma dirección y los cambios en uno afectarán el otro
		// el String, a pesar de ser un objeto es uno diferente que se comporta 
		// como un dato primitivo, es decir, no se pasa la referencia sino el valor
		// de la variable
		Personas meli = melissaB;
		
		//aumentarEfectivo(melissaB);
		meli.efectivo = 5000f;
		System.out.println(melissaB.imprimeNombreCompleto());
	}
	
	static void aumentarEfectivo(Personas persona){
//		System.out.println("Se tiene $" + dinero);
//		dinero += 1000f;
//		System.out.println("Total de dinero $"+dinero);
		persona.efectivo += 1000f;
		System.out.println("Total de dinero real $"+ persona.efectivo);
	}

}
