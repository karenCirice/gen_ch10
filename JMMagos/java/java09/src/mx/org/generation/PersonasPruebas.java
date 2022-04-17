package mx.org.generation;

public class PersonasPruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personas gera=new Personas("Gera", "Rayas", 25, 300.25f);
		Personas melissa = new Personas("Meli", 26, 0.0f);
		System.out.println(gera);
		gera.presentar();
		melissa.presentarCorto();
		aumentarDinero(melissa);
		melissa.presentarCorto();
	}
	
	static void aumentarDinero(Personas humano) {
		humano.efe+=100.0f;	
	}

}
