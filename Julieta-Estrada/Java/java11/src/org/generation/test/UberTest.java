package org.generation.test;

import org.generation.uber.UberBlack;
import org.generation.uber.UberX;

public class UberTest {

	public static void main(String[] args) {
		UberX christian = new UberX("Christian");
		UberBlack elisa = new UberBlack("Elisa");
		
		//para km
		double costoFinal = christian.getObtenerCosto(21.0);
		System.out.println("Recorrido UberX (km):$"+costoFinal);
		//para min
		costoFinal = christian.getObtenerCosto(21);
		System.out.println("Recorrido UberX (min):$"+costoFinal);
		//elegir uno u otro
		costoFinal = christian.getObtenerCosto(21.0, 21);
		System.out.println("Recorrido UberX costo final:$"+costoFinal);
		
		elisa.saludarCliente();
		//para km
		costoFinal = elisa.getObtenerCosto(21.0);
		System.out.println("Recorrido Uber Black (km) :$"+costoFinal);
		//para min
		costoFinal = elisa.getObtenerCosto(21);
		System.out.println("Recorrido Uber Black (min):$"+costoFinal);
		//elegir uno u otro
		costoFinal = elisa.getObtenerCosto(21.0, 21);
		System.out.println("Recorrido Uber Black costo final:$"+costoFinal);
	}
}
