package org.generation.pruebas;

import org.generation.persona.PersonaServicio;

public class PruebaPersona {

	public static void main(String[] args) {
		PersonaServicio personas = new PersonaServicio();
		Persona sergio = new Persona("Sergio", 24, "TOSS831208");
		personas.addPersona(sergio);
		personas.addPersona(new Persona ("Julieta", 25, "EACJ99"));
		personas.addPersona(new Persona ("Pedro", 26, "CESP961203"));
		
		//personas.showPersonById();
		
		Persona enceuntraPersona = personas.findPersonaByName("Julieta");
		System.out.println(enceuntraPersona);
		
		encuentraPersona = personas.findPersona

	}

}
