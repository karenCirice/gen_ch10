package org.generation.tests;

import org.generation.uber.*;

public class UberTest {

	public static void main(String[] args) {
		UberX christian = new UberX("Christian");
		UberBlack elisa = new UberBlack("Elisa");
		
		double costoFinal;
		costoFinal = christian.getObtenerCosto(21.0);
		System.out.println("Recorrido UberX (km) Christian :$" + costoFinal);
		costoFinal = christian.getObtenerCosto(21);
		System.out.println("Recorrido UberX :$" + costoFinal);
		
		costoFinal = elisa.getObtenerCosto(21.0);
		elisa.clienteSaludar();
		System.out.println("Recorrido uberBlack (km) Elisa :$" + costoFinal);
		costoFinal = elisa.getObtenerCosto(21);
		System.out.println("Recorrido UberBlack :$" + costoFinal);
		
		costoFinal = elisa.getObtenerCosto(21.0, 21);
		System.out.println("Recorrido UberBlack (km - min) :$" + costoFinal);

	}
	
	

}
