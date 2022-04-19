package java09;

public class Botanaa {
	public static void main(String[] args) {
		
		    
		    Botana(String nombre, int gramage, boolean enfriado){
				this.nombre = nombre;
				this.gramage = gramage;
				this.enfriado = enfriado;
				contadorBotana++;
				idBotana = contadorBotana;		
			}
			
		    String datosBotana() {
				return ("Botana: " + this.nombre + " " +
						this.gramage + " requiere regrigeración ? " + 
						this.enfriado);
			}
