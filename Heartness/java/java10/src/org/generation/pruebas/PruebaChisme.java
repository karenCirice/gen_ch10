package org.generation.pruebas;

import org.generation.vecino.Amigo;
import org.generation.vecino.Desconocido;

import java10.Familia;
import java10.Persona;

public class PruebaChisme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona eddie = new Persona();
		
		eddie.setChsmPublic("Los quiero mucho a todos");
		
		Familia ernesto = new Familia(eddie);
		Amigo dany = new Amigo();
		Desconocido personaRuidosa = new Desconocido();
		
		String platica1 = personaRuidosa.getChismeCompleto();
		String platica2 = dany.getChismeCompleto();
		String platica3 = ernesto.getChismeCompleto();
		
		System.out.println(platica1);
		System.out.println(platica2);
		System.out.println(platica3);
		
		String platica4 = eddie.getChsmPublic();
		System.out.println(platica4);
	}
}
