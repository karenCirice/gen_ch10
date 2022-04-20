package org.generation.tests;

import org.generation.uber.*;

public class UberTest {

	public static void main(String[] args) {
		UberX eddie = new UberX("Eddie");
		UberBlack ernesto =  new UberBlack("Ernesto");
		
		double costoFinal = eddie.getObtenerCosto(21);
		System.out.println("Costo UberX: $" + costoFinal);
		
		costoFinal = ernesto.getObtenerCosto(21);
		ernesto.saludarCliente();
		System.out.println("Recorrido Uber Black: $" + costoFinal);
	}

}
