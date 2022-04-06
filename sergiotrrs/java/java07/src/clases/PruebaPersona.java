package clases;

public class PruebaPersona {

	public static void main(String[] args) {
		Persona persona1 = new Persona();
		persona1.nombre = "Manuel";
		persona1.apellido = "Torres";
		persona1.desplegarInformacion();
		// @ referencia del objeto en memoria
		System.out.println("Dato persona1 : " + persona1);

		Persona persona2 = new Persona();
//		persona2.nombre = "Alejandra";
//		persona2.apellido = "Molina";
		persona2.desplegarInformacion();
		

	}

}
