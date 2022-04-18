package org.generation.vecino;

import java10.Persona;

public class Amigo extends Persona {
	private String chismeContar1;
	private String chismeContar2;
	//private String chismeContar3;
	
	public Amigo() {
		this.chismeContar1 = super.getChsmPublic();
		this.chismeContar2 = super.getChsmProtected();
	}
	
	public String getChismeCompleto() {
		return this.chismeContar1 + "\n" + this.chismeContar2;
	}
}
