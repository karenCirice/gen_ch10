package org.generation.pruebas;

//import org.generation.casa.Familia;
//import org.generation.casa.Persona;
//import org.generation.vecino.Amigo;
//import org.generation.vecino.Desconocido;
/**
 * Para traer todas las clasaes usamos * asterisco
 */
import org.generation.casa.*;
import org.generation.vecino.*;

public class PruebaChisme {

	public static void main(String[] args) {
		Persona armando= new Persona();
		armando.setChsmPublic("Soy Libra~~");
		Familia dulce = new Familia();
		Amigo raquel = new Amigo();
		Desconocido personaRuidosa = new Desconocido();
		
		String platica1 = personaRuidosa.getChismeCompelto();
		String platica2 = dulce.getChismeCompelto();
		String platica3 = raquel.getChismeCompleto();
		String pensamiento = armando.getChismeCompleto();
		
		System.out.println("Desconocido sabe que: " + "\n" + platica1 + "\n");
		System.out.println();
		System.out.println("Dulce sabe que: " + "\n" + platica2 + "\n");
		System.out.println();
		System.out.println("Raquel sabe que: " + "\n" + platica3 + "\n");
		System.out.println();
		System.out.println("Yo mismo se que: " + "\n" + pensamiento + "\n");
		
		

	}
	

}
