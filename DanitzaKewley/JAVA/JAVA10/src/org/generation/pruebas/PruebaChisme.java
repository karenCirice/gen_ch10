package org.generation.pruebas;

import org.generation.casa.Familia;
import org.generation.vecino.Amigo;

//import org.generation.casa.Familia;
//import org.generation.casa.Persona;
//Si deseo importar varias clases
//de un mismo paquete, puedo utilizar*
import org.generation.casa.*;
import org.generation.vecino.*;


public class PruebaChisme {

	public static void main(String[] args) {
		Persona danitza = new Persona();
		danitza.setChsmPublic("Soy Sagitario~~");
		Familia junior = new Familia();
		Amigo yael = new Amigo();
		Desconocido personaRuidosa = new Desconocido();
		
		String platica1 = personaRuidosa.getChismeCompleto();
		String platica2 = yael.getChismeCompleto();
		String platica3 = junior.getChismeCompleto();
		String pensamiento = danitza.getChismeCompleto();
		
		System.out.println("Desconocido: " + platica1);
		System.out.println();
		System.out.println("Amigo: " + platica2);
		System.out.println();
		System.out.println("Familia: " + platica3);
		System.out.println();
		System.out.println("Mis pensamientos: " + pensamiento);
		
	}

}
