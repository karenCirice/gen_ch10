package org.generation.tests;

import org.generation.uber.*;

public class UberTest {

	public static void main(String[] args) {
		UberX christian = new UberX("Christian");
		UberBlack elisa = new UberBlack("Elisa");
		
		double costoFinal;
		costoFinal= christian.getObtenerCosto(21.0);
		System.out.println("Recorrido UberX (km) :$" + costoFinal);		
		costoFinal = christian.getObtenerCosto(21);
		System.out.println("Recorrdio UberX (min) :$" + costoFinal);
		costoFinal = christian.getObtenerCosto(21.0, 21);
		System.out.println("Recorrdio UberX (km-min) :$" + costoFinal);
		
		costoFinal = elisa.getObtenerCosto(21);
		elisa.saludarCliente();
		System.out.println("Recorrdio Uber Black :$" + costoFinal);
		
	}

}
