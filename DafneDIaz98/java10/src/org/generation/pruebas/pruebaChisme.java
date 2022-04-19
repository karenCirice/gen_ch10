package org.generation.pruebas;

public class pruebaChisme {
	
	public static void main(String[] args) {
		
		Persona dafne =new Persona();
		dafne.setChismePublic("Soy todo ")
		Familia  = new Familia();
		Amigo  = new Amigo();
		Desconocido personaChismosa = new Desconocido();
		
		String platica1 = personaChismosa.getChismeCompleto();
		String platica2 = amigo.getChismeCompleto();
		String platica3 = familia.getChismeCompleto();
		String pensamiento = dafne.getChismeCompleto();
		
		System.out.println("Desconocido : " +platica1);
		System.out.println();
		System.out.println("Amiga :" +platica2);
		System.out.println();
		System.out.println("Familia :" +platica3);
		System.out.println();
		System.out.println("mis pensamientos :" +pensamiento);

	}

}

}
