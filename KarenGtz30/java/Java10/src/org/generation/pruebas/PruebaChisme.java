package org.generation.pruebas;

//import org.generation.casa.Familia;
//import org.generation.casa.Persona;
// Si deseo importar varias clases
// de un mismo paquete, puedo utilizar *
import org.generation.casa.*;
import org.generation.vecino.*;

public class PruebaChisme {

	public static void main(String[] args) {
		Persona karen = new Persona();	
		karen.setChsmPublic("Soy Virgo ~~");
		Familia jorge = new Familia();
		Amigo lupita = new Amigo();
		Desconocido vecina = new Desconocido();
		
		String platica1 = vecina.getChismeCompleto();
		String platica2 = lupita.getChismeCompleto();
		String platica3 = jorge.getChismeCompleto();
		String pensamiento = karen.getChismeCompleto();
		
		System.out.println("Vecina: " + platica1);
		System.out.println();
		System.out.println("Amiga: " + platica2);
		System.out.println();
		System.out.println("Familia: " + platica3);
		System.out.println("Yo: "+ pensamiento);
		

	}

}