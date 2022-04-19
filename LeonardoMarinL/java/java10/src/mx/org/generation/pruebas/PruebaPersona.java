package mx.org.generation.pruebas;

import mx.org.generation.persona.*;

public class PruebaPersona {

	public static void main(String[] args) {
		PersonaServicio personas = new PersonaServicio();
		
		Persona leonardo = new Persona("Leonardo", 24, "MALL980326");
		
		personas.addPersona(leonardo);
		personas.addPersona(new Persona ("Julieta", 22, "EACJ990805"));
		personas.addPersona(new Persona ("Pedro", 26, "CES961203"));
		
		personas.showPersonByID();
		
		Persona encuentraPersona = personas.findPersonaByName("Julieta");
		System.out.println(encuentraPersona+" encontrada con nombre (ArrayList)");
		
		encuentraPersona = personas.findPersonaById("MALL980326");
		System.out.println(encuentraPersona+" encontrada con ID (HashMap)");

	}

}
