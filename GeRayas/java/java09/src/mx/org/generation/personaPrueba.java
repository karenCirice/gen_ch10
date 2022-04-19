package mx.org.generation;

public class personaPrueba {
	public static void main(String[] args) {
		Personas geraMedina = new Personas();
		geraMedina.nombre = "Gerardo";
		geraMedina.apellido = "Medina";
		geraMedina.edad = 23;
		geraMedina.efectivo= 20f;
		System.out.println(geraMedina.NombreCompleto());
		
		
		Personas melissaB = new Personas("Melissa", "Balbuena", 17);
		System.out.println(melissaB.NombreCompleto());
}
	
}
