package principal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int emoFeliz = 5;
		
		// va a dar 5 porque primero se lee y luego se incrementa
		System.out.println(emoFeliz++);
		System.out.println(emoFeliz);
		
		System.out.println(emoFeliz--);
		System.out.println(emoFeliz);
		
		int nivelCorte= 1;
		
		nivelCorte = emoFeliz++;
		
		System.out.println("nivel corte " + nivelCorte);
		System.out.println("emofeliz "+ emoFeliz);
		
		int emoClan = emoFeliz * 5;
		/*
		System.out.println("clan emo "+ emoClan);
		System.out.println("clan emo "+ (emoClan/2));
		System.out.println("Modulo "+ (emoClan%2));
		*/
		System.out.println("Es mayor "+ (emoClan > 20));
		System.out.println("es igual "+ (emoClan<=30));
		System.out.println("operador and "+ ( 8 & 4));
		
	}

}
