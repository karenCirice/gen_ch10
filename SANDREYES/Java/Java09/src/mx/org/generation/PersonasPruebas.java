/**
 * 
 */
package mx.org.generation;

public class PersonasPruebas {

	public static void main(String[] args) {
       Personas geraMedina = new Personas();
       geraMedina.nombre="Gerardo";
       geraMedina.apellido= "Medina";
       geraMedina.edad = 26;
       geraMedina.efectivo= 20f;
    
      // System.out.println(geraMedina.nombreCompleto());
    
       Personas melissaB = new Personas("Melissa", "Balbuena",21);
       System.out.println(melissaB.nombreCompleto());
      
       float cantidadActual = melissaB.efectivo;
       aumentarEfectivo(cantidadActual);
       System.out.println(melissaB.nombreCompleto());
	}
	
	static void aumentarEfectivo(Float dinero) {
		System.out.println("Se tiene $"+dinero);
		dinero +=1000f;
		System.out.println("Total de dinero $"+dinero);
	}
	
	//DATOS PRIMITIVOS, PASAN LOS PARAMETROS
	int edad = 26;
	//se pasa el valor
	int edadNueva = edad;
	edadNueva = 30;
	System.out.println("Valor de edad: " + edad); //26
	
	// LOS DATOS TIPO STRING 
	
}