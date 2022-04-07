package mx.org.generation;

public class PersonasPruebas {
	public static void main(String[] args) {
		Personas geraMedina = new Personas ();
		geraMedina.nombre = "Gerardo";
		geraMedina.apellido = "Medina";
		geraMedina.edad = 26;
		geraMedina.efectivo = 20f;
		
		//System.out.println(geraMedina.nombreCompleto());
		
		Personas melissaB = new Personas("Melissa", "Balbuena", 21);
		System.out.println(melissaB.nombreCompleto());
		melissaB.efectivo=100f;
		
//		float cantidadActual = melissaB.efectivo;
//		aumentarEfectivo(cantidadActual);
//		System.out.println(melissaB.nombreCompleto());
	
//		Datos primitivos, pasan los par�metros
		int edad = 26;
		//Se pasa el valor
		int edadNueva = edad;
		edadNueva = 30;
		System.out.println("Valor de edad; "+ edad); //26
		
		//Los datos tipo String
		String nombreMascota= "solovino";
		String myPet = nombreMascota;
		myPet ="Luna";
		System.out.println("Nombre perro :" + nombreMascota);
		
		//Los objetos, pasan la referencia en memoria
		Personas meli = melissaB;
		//Se pasa la direcci�n
		meli.efectivo = 5000f;
		
		//aumentarDineroReal(meli);
		System.out.println(melissaB.nombreCompleto());
	
	}
	
	static void aumentarEfectivo(float dinero){
		System.out.println("Se tiene $"+dinero);
		dinero +=1000f;
		System.out.println("Total de dinero $ "+dinero);
	}
	
	static void aumentarDineroReal(Personas humano) {
		humano.efectivo +=1000f;
		System.out.println("Total de dinero en m�todo aumentar $:" + humano.efectivo);
		
	}
	

}
