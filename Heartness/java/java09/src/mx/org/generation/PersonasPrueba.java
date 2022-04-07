package mx.org.generation;

public class PersonasPrueba {

	public static void main(String[] args) {
		Personas geraMedina = new Personas();
		geraMedina.nombre = "Gerardo";
		geraMedina.apellido = "Medina";
		geraMedina.edad = 23;
		geraMedina.efectivo = 20f;
		
		System.out.println(geraMedina.nombreCompleto());
		
		Personas melissaB = new Personas("Melissa", "Balcuena", 20, 50f);
		System.out.println(melissaB.nombreCompleto());
	}

}
