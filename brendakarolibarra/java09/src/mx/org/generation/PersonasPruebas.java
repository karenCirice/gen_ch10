package mx.org.generation;

public class PersonasPruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Personas geraMedina = new Personas ();
		geraMedina.nombre="Gerardo";
		geraMedina.apellido="Medina";
		geraMedina.edad = 23;
		geraMedina.efectivo= 20f;
		System.out.println(geraMedina.nombreCompleto());
		
		Personas melissaB = new Personas("Melissa", "Balbuena", 17);
		System.out.println(melissaB.nombreCompleto());
		melissaB.efectivo =100f;
		
		
		//float cantidadActual = melissaB.efectivo;
		//aumentarEfectivo(cantidad actual);
		
		//aumentaDineroReal(melissaB);
		//System.out.println(melissaB.nombreCompleto());
		
		int edad=26;
		int edadNueva = edad;
		edadNueva = 30;
		System.out.println("Valor de edad:" + edad); //26 
		
		//Los datos tipo string, se comportan como valores primitivos
		//no pasan la referencia, pasan los datos.
		String nombreMascota ="Solovino";
		String myPet = nombreMascota;
		myPet ="Firulais";
		System.out.println("Nombre Perrito:" + nombreMascota);
		
		
		
		
		//Los objetos, pasan la referencia en memoria
		Personas meli = melissaB;
		meli.efectivo = 5000f;
		melissaB=null;
		
		aumentaDineroReal (meli);
		System.out.println(meli.nombreCompleto());
		
	}
	static void aumentarEfectivo(float dinero){
		System.out.println("Se tiene $"+ dinero);
		dinero += 1000f;
		System.out.println("Total de dinero $"+ dinero);
	}
	
	static void aumentaDineroReal(Personas humano) {
		humano.efectivo + = 1000f;
		sysSystem.out.println("Total de dinero real $" + humano.efectivo);
	}
	
	
	
	
	

}
