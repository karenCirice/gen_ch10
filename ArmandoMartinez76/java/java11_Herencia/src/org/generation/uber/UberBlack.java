package org.generation.uber;

public class UberBlack extends UberX{
	
	public UberBlack(String nombre) {
		super(nombre, 100, 9.46, 3.5);
		
	}
	
	public void clienteSaludar() {
		System.out.println("Buenas tardes soy " + super.getNombre());
	}
	
	
}
