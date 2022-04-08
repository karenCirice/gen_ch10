package mx.org.generation;

public class PersonasPruebas {

	public static void main(String[] args) {
		//nuevo objeto
//		Personas karenGonzalez = new Personas();
//		karenGonzalez.nombre = "Karen";
//		karenGonzalez.apellido = "Gonzalez";
//		karenGonzalez.edad = 23;
//		karenGonzalez.efectivo = 200f;
		
		//System.out.println(karenGonzalez.NombreCompleto());

		Personas melissaB = new Personas("Melissa", "Balbuena", 22);
		System.out.println(melissaB.NombreCompleto());
		melissaB.efectivo = 100f;
		
//		float cantidadActual = melissaB.efectivo;
//		aumentarEfectivo(cantidadActual);
//		System.out.println(melissaB.NombreCompleto());

		//datos primitivos, pasan los parametros
		int edad = 26;
		//se pasa el valor
		int edadNueva = edad;
		edadNueva = 30;
		System.out.println("Valor de edad: " + edad);//26
		
		//los datos tipo string se comportan como valores primitivos
		//no pasan la referencia, pasan los datos
		String nombreMascota = "Solovino";
		String myPet = nombreMascota;
		myPet = "Firulais";
		System.out.println("Nombre del perrito: " + nombreMascota);
		System.out.println("Mi perrito es: " + myPet);
		
		//los objetos, pasan la referencia en memoria 
		Personas meli = melissaB; 
		//se pasa la direccion 
		meli.efectivo = 5000f;
		System.out.println(melissaB.NombreCompleto());
		 
		}
		
		static void aumentarEfectivo(float dinero) {
			System.out.println("Se tiene $" + dinero);
			dinero += 1000f;
			System.out.println("Total de dinero en metodo aumentar $" + dinero);
			
		}
		
		static void aumentarDineroReal(Personas humano) {
			humano.efectivo += 1000f;
			System.out.println("Total de dinero real $" + humano.efectivo);
		}
	}

