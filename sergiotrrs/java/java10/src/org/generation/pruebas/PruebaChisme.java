package org.generation.pruebas;

//import org.generation.casa.Familia;
//import org.generation.casa.Persona;
// Si deseo importar varias clases
// de un mismo paquete, puedo utilizar *
import org.generation.casa.*;
import org.generation.vecino.*;

public class PruebaChisme {

	public static void main(String[] args) {
		Persona sergio = new Persona();	
		sergio.setChsmPublic("Soy Sagitario ~~");
		Familia karla = new Familia();
		Amigo keny = new Amigo();
		Desconocido personaRuidosa = new Desconocido();
		
		String platica1 = personaRuidosa.getChismeCompleto();
		String platica2 = keny.getChismeCompleto();
		String platica3 = karla.getChismeCompleto();
		String pensamiento = sergio.getChismeCompleto();
		
		System.out.println("Desconocido : " +platica1);
		System.out.println();
		System.out.println("Amiga :" +platica2);
		System.out.println();
		System.out.println("Familia :" +platica3);
		System.out.println();
		System.out.println("mis pensamientos :"+ pensamiento);
		

	}

}
