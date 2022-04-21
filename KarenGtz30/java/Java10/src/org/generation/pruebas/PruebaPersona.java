package org.generation.pruebas;

import org.generation.persona.*;

public class PruebaPersona {
	
	public static void main(String[] args) {
		PersonaServicio personas = new PersonaServicio();
		
		Persona Karen = new Persona("Karen", 23, "GOGK");
		
		personas.addPersona(Karen);
		personas.addPersona(new Persona ("Julieta", 22, "EACJ"));
		personas.addPersona(new Persona ("Pedro", 26, "CESP"));
		
		//personas.showPersonById();
		
		Persona encuentraPersona = personas.findPersonaByName("Julieta");
		System.out.println(encuentraPersona);
		
		encuentraPersona = personas.findPersonaById("CESP");
		System.out.println(encuentraPersona);
		
	}
}
