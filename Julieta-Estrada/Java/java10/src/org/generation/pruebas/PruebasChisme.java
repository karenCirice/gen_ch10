package org.generation.pruebas;

//se utiliza * para importar todos los archivos dentro 
//de otra clase
import org.generation.casa.*;
import org.generation.vecino.*;

public class PruebasChisme {

		public static void main (String[] args) {
			Persona Julieta = new Persona();
			Julieta.setChsmPublic("Soy Leo ~~");
			Familia Marisela = new Familia();
			Amigo Sofia = new Amigo();
			Desconocido acosador = new Desconocido();
			
			String platica1 = acosador.getChismeCompleto();//desconocido
			String platica2 = Sofia.getChismeCompleto();//amigo
			String platica3 = Marisela.getChismeCompleto();//familia
			String pensamiento = Julieta.getChismeCompleto();//yo
			
			System.out.println("Desconocido:" + platica1);
			System.out.println();
			System.out.println("Amiga: " +platica2);
			System.out.println();
			System.out.println("Familia: " +platica3);
			System.out.println();
			System.out.println("Yo se que:" +pensamiento);
			
			
		}
}
