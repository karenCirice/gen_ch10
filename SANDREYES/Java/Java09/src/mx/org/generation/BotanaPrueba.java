/**
 * 
 */
package mx.org.generation;

/**
 * @author DELL
 *
 * 8 abr. 2022
 */
public class BotanaPrueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        // AQUI ES DONDE PROBAMOS LAS BOTANAS
		
		
		//GENERAMOS UN NUMERO ALEATORIO DEL O AL 1
		//random() y PI son metodos y atributos estatico
		//no es necesario crear objetos para utilizarlos
		//System.out.println( Math.random());
		//System.out.println (Math.PI);
		
		
		//GENERAR LOS OBJETOS DE LA CLASE BOTANA
		// se comentaron 
		//Botana totis= new Botana("Totis fuego",3000,false);
		//Botana caviar=new Botana("caviar",5000,true);
		//Botana papas= new Botana("papas chips",8000,false);
		//Botana ceviche= new Botana("Ceviche",10000,true);
		//Botana payLimon= new Botana("Pay de limon",2000,true);
		
		Botana.contadorBotana=8;
		Botana totis= new Botana("Totis fuego",3000,false);
		Botana caviar=new Botana("caviar",5000,true);
		Botana papas= new Botana("papas chips",8000,false);
		Botana ceviche= new Botana("Ceviche",10000,true);
		Botana payLimon= new Botana("Pay de limon",2000,true);
		
		System.out.println(totis.datosBotana());
		System.out.println(caviar.datosBotana());
		System.out.println(papas.datosBotana());
		System.out.println(ceviche.datosBotana());
		System.out.println(payLimon.datosBotana());
	}

}
