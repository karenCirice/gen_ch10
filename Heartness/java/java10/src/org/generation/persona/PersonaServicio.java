package org.generation.persona;

import java.util.ArrayList;
import java.util.HashMap;

public class PersonaServicio {
	private ArrayList<Persona> personaList = new ArrayList<>();
	private HashMap<String, Persona> personBiId = new HashMap<>();
	
	public void addPersona(Persona persona) {
		this.personaList.add(persona);
		this.personBiId.put(persona.getId(), persona);
	}
	
	public void showPersonById() {
		for (String id : this.personBiId.keySet()) {
			System.out.println(this.personBiId.get(id));
		}
	}
	
	public Persona findPersonaByName (String nombre) {
		for(Persona persona : personaList) {
			if(persona.getNombre().equals(nombre)) {
				return persona;
			}
				
			/*if(persona.getNombre() == nombre) {
				return persona;
			}*/
		}
		return null;
	}
	
	public Persona findPersonaById(String Id) {
		return this.personBiId.get(Id);
	}
	
	public void consultaPorId(String id) {
		System.out.println(this.personBiId.get(id));
	}
}
