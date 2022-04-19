package org.generation.vecino;

import java10.Persona;

public class Desconocido {
		private String chismeContar1;
		private String chismeContar2;
		private String chismeContar3;
		
		public Desconocido() {
			Persona persona = new Persona();
			this.chismeContar1 = persona.getChsmPublic();
		}
		
		public String getChismeCompleto() {
			return this.chismeContar1;
		}
}
