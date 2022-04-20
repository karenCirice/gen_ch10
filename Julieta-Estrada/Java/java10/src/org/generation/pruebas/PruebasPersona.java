package org.generation.pruebas;

import org.generation.persona.Persona;
import org.generation.persona.PersonaServicio;

public class PruebasPersona {

	public static void main(String[] args) {
		PersonaServicio personas = new PersonaServicio();
		
		Persona eddie = new Persona("Eddie", 25, "REF12345");
		
		personas.addPersona(eddie);
		personas.addPersona(new Persona ("Julieta", 22, "EACJ990805"));
		personas.addPersona(new Persona ("Pedro", 26, "CESP961203"));
		personas.showPersonById();
		System.out.println("\n");
		
		Persona encuentraPersona = personas.findPersonaByName("Pedro");
		System.out.println(encuentraPersona);
		System.out.println("\n");
		
		Persona encuentraPeersona = personas.findPersonaById("EACJ990805");
		System.out.println(encuentraPeersona);
		System.out.println("\n");
		
		personas.consultaPorId("EACJ990805");
	}
}
