package mx.org.generation.pruebas;

import mx.org.generation.*;
import mx.org.generation.vecino.*;

//si deseo importar varias clases de un mismo paquete puedo utilizar *

public class PruebaChisme {

	public static void main(String[] args) {
		Persona leonardo = new Persona();
		
		Persona leo = new Persona();
		Familia camila = new Familia();
		Amigo mario = new Amigo();
		Desconocido personaRuidosa = new Desconocido();
		
		String platica1 = personaRuidosa.getChismeCompleto();
		String platica2 = mario.getChismeCompleto();
		String platica3 = camila.getChismeCompleto();
		String pensamiento = leonardo.getChismeCompleto();
		leo.setChsmPublic("Vende postres veganos");
		String pensamientoCopia = leo.getChismeCompleto();
		
		System.out.println("Desconocido: "+"\n"+platica1);
		System.out.println();
		System.out.println("Amigo: "+"\n"+platica2);
		System.out.println();
		System.out.println("Familia: "+"\n"+platica3);
		System.out.println();
		System.out.println("Mis pensamientos: "+"\n"+pensamiento);
		System.out.println();
		System.out.println("Mis pensamientos clonados: "+"\n"+pensamientoCopia);

	}

}
