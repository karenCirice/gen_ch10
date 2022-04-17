package mx.org.generation;

public class BotanaPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Botana.contadorBotana=0;
		Botana totis =new Botana("Totis fuego", 300, false);
		Botana caviar =new Botana("Caviar", 500, true);
		Botana papas =new Botana("Papas chips", 800, false);
		Botana ceviche =new Botana("Ceviche de chile", 700, true);
		Botana payLimon=new Botana("Pay de limon", 500, true);
		
		System.out.println(totis.datosBotana());
		System.out.println(caviar.datosBotana());
		System.out.println(papas.datosBotana());
		System.out.println(ceviche.datosBotana());
		System.out.println(payLimon.datosBotana());
	}

}
