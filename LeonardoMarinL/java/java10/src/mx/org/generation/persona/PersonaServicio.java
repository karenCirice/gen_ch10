package mx.org.generation.persona;

import java.util.ArrayList;
import java.util.HashMap;

public class PersonaServicio {
	private ArrayList<Persona> personaList = new ArrayList<Persona>();
	private HashMap<String, Persona> personaById = new HashMap<>();
	
	/**
	 * M�todo que recibe un objeto de tipo Persona y lo agrega
	 * a nuestra colecci�n ArrayList y HashMap.
	 * Para el HashMap se requiere (clave, valor).
	 * @param persona
	 */
	public void addPersona(Persona individuo) {
		this.personaList.add(individuo);
		//persona.getId es el m�todo en persona
		//que devuelve el ID de la persona, lo que es la clave
		this.personaById.put(individuo.getId(), individuo);
	}
	
	/**
	 * M�todo que muestra el listado de los ID's de las
	 * personas registradas en la colecci�n HashMap
	 */
	public void showPersonByID() {
		for (String id: this.personaById.keySet()) {
			System.out.println(this.personaById.get(id));
		}
	}
	
	/**
	 * Busca a una persona por su nombre, en una colecci�n ArrayList
	 * @param nombre de la persona a buscar
	 * @return el objeto Persona 
	 */
	public Persona findPersonaByName(String nombre) {
		for (Persona individuo : personaList) {
			if (individuo.getNombre().equals(nombre)) {
				return individuo; //es recomendado usar el m�todo equals porque verifica sobre el dato y no tener falsos positivos
			}
			/*if (individuo.getNombre() == nombre) {   //en String (valor no primitivo)no es recomendable usar el ==
				return individuo;
			}*/
		}
		return null;
	}
	
	/**
	 * Busca una persona por el ID en el HashMap personaById
	 * @param Id de la persona
	 * @return el objeto Persona encontrado, null si no lo encuentra
	 */
	public Persona findPersonaById (String clave) {
		return this.personaById.get(clave);
	}
	
}
