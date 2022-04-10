package mx.org.generation;

public class PersonasPruebas {

	public static void main(String[] args) {
		/*Personas geraMedina = new Personas ();
		geraMedina.nombre =  "Gerado";
		geraMedina.apellido = "Medina";
		geraMedina.edad = 26;
		geraMedina.efectivo = 20f;
		*/
		//System.out.println(geraMedina.nombreCompleto());
		
		Personas melissaB = new Personas("Melissa", "Balbuena", 21);
		System.out.println(melissaB.nombreCompleto());
		
		/*
		float cantidadActual = melissaB.efectivo;
		
		aumentarEfectivo(cantidadActual);
		System.out.println(melissaB.nombreCompleto());
		*/
		
		Personas meli = melissaB;//son atributo y por eso no llevan parentesis 
		meli.efectivo = 5000f;
		System.out.println(melissaB.nombreCompleto());//estos son métodos por eso llevan parentesis
		
	}
	
	static void aumentarEfectivo(float dinero){
		//System.out.println("Se tiene $ " + dinero);
		dinero += 1000f;
		//System.out.println("Total de dinero $ " + dinero);
	}
	
	static void aumentaDineroReal(Personas humano) {
	humano.efectivo += 1000f;
	//System.out.println("total del dinero real " + humano.efectivo);
	}
	
}
