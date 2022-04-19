package mx.org.generation;

public class BotanaPrueba {

	public static void main(String[] args) {
		//aqui es donde probamos las botanas
		
		//generamos un numero aleatorio del 0 al 1
		//random y pi son metodos y atributos estaticos, por lo que no es necesari crear ibjetos para utilizarlos
		//System.out.println(Math.random());
		//System.out.println(Math.PI);
		
		/*Esto se hizo de manera manual y puede generar errores
		 * //generar los objetos de la clase botana Botana totis = new
		 * Botana("Totis fuego", 3000, false, 1); Botana caviar = new Botana("Caviar",
		 * 5000, true, 2); Botana papas = new Botana("Papas chips", 8000, false, 3);
		 * Botana ceviche = new Botana("Ceviche", 10000, true, 4); Botana payLimon = new
		 * Botana("Pay de limon", 2000, true, 5);
		 */
		
		Botana.contadorBotana = 0;
		Botana totis = new Botana("Totis fuego", 3000, false);
		Botana caviar = new Botana("Caviar", 5000, true);
		Botana papas = new Botana("Papas chips", 8000, false);
		Botana ceviche = new Botana("Ceviche", 10000, true);
		Botana payLimon = new Botana("Pay de limon", 2000, true);
		
		System.out.println(totis.datosBotana());
		System.out.println(caviar.datosBotana());
		System.out.println(papas.datosBotana());
		System.out.println(ceviche.datosBotana());
		System.out.println(payLimon.datosBotana());
		
		Botana.contadorBotana = 99;
		
	}

}
