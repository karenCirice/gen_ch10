package org.generation.pruebas;

import org.generation.persona.*;

public class PruebaPersona {

	public static void main(String[] args) {
		PersonaServicio personas = new PersonaServicio();
		
		Persona sergio = new Persona("Sergio", 24, "TOSS831208");
				
		personas.addPersona(sergio);
		personas.addPersona(new Persona ("Julieta", 22, "EACJ990805"));
		personas.addPersona(new Persona ("Pedro", 26, "CESP961203"));
		
		//personas.showPersonById();
		
		Persona encuentraPersona = personas.findPersonaByName("Julieta");
		System.out.println(encuentraPersona);
		
		encuentraPersona = personas.findPersonaById("EACJ990805");
		System.out.println(encuentraPersona);
		

	}

}
