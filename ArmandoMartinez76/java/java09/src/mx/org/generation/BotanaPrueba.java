package mx.org.generation;

public class BotanaPrueba {

	public static void main(String[] args) {
		// Aqui es donde probamos las botanas
		
		//Genera un numero aleatorio entre 1 y 0
		//Random y PI son meodos y atributos 
		//No es necesario crear objetos para utilizarlos
		//Los llamamos directamente de la clase Math
		//System.out.println(Math.random() * 100);
		//System.out.println(Math.PI);
		
		//Generar los objetos de la clase botana
//		Botana Totis = new Botana("Totis fuego ", 3000, false, 1);
//		Botana caviar = new Botana("Caviar ", 5000, true, 2);
//		Botana papas = new Botana("Papas chip ", 8000, false, 3); 
//		Botana ceviche = new Botana("Ceviche ", 10000, true, 4);
//		Botana payLimon = new Botana("Pay de limon ", 2000, true, 5);
		Botana.contadorBotana = 0;
		Botana Totis = new Botana("Totis fuego ", 3000, false);
		Botana caviar = new Botana("Caviar ", 5000, true);
		Botana papas = new Botana("Papas chip ", 8000, false); 
		Botana ceviche = new Botana("Ceviche ", 10000, true);
		Botana payLimon = new Botana("Pay de limon ", 2000, true);
		
		System.out.println(Totis.datosBotana());
		
		System.out.println(caviar.datosBotana());
		
		System.out.println(papas.datosBotana());
		System.out.println(ceviche.datosBotana());
		System.out.println(payLimon.datosBotana());
		
		Botana.contadorBotana = 99;

	}

}
