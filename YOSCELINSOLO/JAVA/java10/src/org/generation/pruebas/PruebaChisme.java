/**
 * 
 */
package org.generation.pruebas;

//import org.generation.casa.Familia;
//import org.generation.casa.Persona;

import org.generation.casa.*;
import org.generation.vecino.*;

/**
 * @author Yoscelín RS
 *18 abr. 2022
 */
public class PruebaChisme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Persona yoz =new Persona();
		yoz.setChismePublic("Soy Capricornio ")
		Familia rosi = new Familia();
		Amigo miroz = new Amigo();
		Desconocido personaChismosa = new Desconocido();
		
		String platica1 = personaChismosa.getChismeCompleto();
		String platica2 = miroz.getChismeCompleto();
		String platica3 = rosi.getChismeCompleto();
		String pensamiento = yoz.getChismeCompleto();
		
		System.out.println("Desconocido : " +platica1);
		System.out.println();
		System.out.println("Amiga :" +platica2);
		System.out.println();
		System.out.println("Familia :" +platica3);
		System.out.println();
		System.out.println("mis pensamientos :" +pensamiento);

	}

}
