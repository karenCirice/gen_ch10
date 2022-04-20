package org.generation.persona;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Armando Martinez
 *19 abr. 2022
 */
public class PersonaServicio {
	private ArrayList<Persona>personaList = new ArrayList<>();
	private HashMap<String, Persona> personaById = new HashMap <>(); //Se define el hashMap con <String, Persona> que es la clave-valor
	
	// EN ESTE CASO NO TENDREMOS UN CONSTRUCTOR
	/**
	 * M�todo que recibe un objeto de tipo persona y lo agrega a nuestra colecci�n ArrayList y HashMap.
	 * Para el HasMap se requiere (clave, valor)
	 * @param persona
	 */
	public void addPersona (Persona individuo) {
		this.personaList.add(individuo);
		this.personaById.put(individuo.getId(), individuo); //persona.getId() es el m�todo en persona que devuelve el id de la persona//
	
}
	/**
	 * M�todo que muestra el listado de los Ids de las personas registradas en la colecci�n HashMap
	 */
	
	public void showPersonById() {
		for (String id : this.personaById.keySet()) {
			System.out.println(this.personaById.get(id));
			
		}
	}
		/**
		 * Busca una persona por su nombre
		 * @param nombre de la persona a buscar
		 * @return el objeto Persona
		 */
		public Persona findPersonaByName(String nombre) {
			for (Persona individuo : this.personaList) { 
				//if (individuo.getNombre() == nombre) { //if (individuo.getNombre() == nombre) no es recomendable usar == para datos tipo string por eso har�mos lo de la siguiente l�nea:
					if (individuo.getNombre().equals(nombre)) { //utilizando equals compara sobre el dato, el HasCode y el HashEquals para que no de un falso  negativo o falso positivo, lo que compara es si es o no es
					return individuo;
				}
					/*if (individuo.getNombre() == nombre) {
					 * return individuo;
					 */
			}
			return null;
		}
		
		/**
		 * Busca una persona por su HashMap personaById
		 * @param Id de la persona 
		 * @return el objeto Persona encontrado, null si no se encuentra
		 */
		public Persona findPersonaById(String clave) {
			return this.personaById.get(clave);
		}
	}