package mx.org.generation;

public class BotanaPrueba {

	public static void main(String[] args) {
		// Aqu� es donde probamos las botanas ^^
        
        //Generamos un n�mero aleatorio del 0 al 1
        // random() y PI son m�todos y atributos est�tico
        // No es necesario crear objetos para utilizarlos
        // los llamamos directamente de la clase Math.
        //System.out.println( Math.random() );
        //System.out.println( Math.PI );
        
        //Generar los objetos de la clase Botana.
        //Se comentaron porque se hizo manual la generaci�n
        // del idBotana, y esto gener� duplicidad.
//        Botana totis = new Botana("Totis fuego", 3000, false,1);
//        Botana caviar = new Botana("Caviar", 5000, true,2);
//        Botana papas = new Botana ("Papas chips", 8000, false,3);
//        Botana ceviche = new Botana ("Ceviche", 10000, true,3);
//        Botana payLimon = new Botana ("Pay de Lim�n", 2000, true,4);
//        
        Botana.contadorBotana = 8;
        Botana totis = new Botana("Totis fuego", 3000, false);
        Botana caviar = new Botana("Caviar", 5000, true);
        Botana papas = new Botana ("Papas chips", 8000, false);
        Botana ceviche = new Botana ("Ceviche", 10000, true);
        Botana payLimon = new Botana ("Pay de Lim�n", 2000, true);
               
        System.out.println(totis.datosBotana());
        System.out.println(caviar.datosBotana());
        System.out.println(papas.datosBotana());
        System.out.println(ceviche.datosBotana());
        System.out.println(payLimon.datosBotana());
	}
}
 
