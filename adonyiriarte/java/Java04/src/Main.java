public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int emoFeliz = 5;
	System.out.println(emoFeliz++);
	System.out.println(emoFeliz);
	
	System.out.println(emoFeliz--);
	System.out.println(emoFeliz);
	
	int nivelCorte = 1;
	emoFeliz = 5;
	
	nivelCorte = emoFeliz++;
	System.out.println("nivelCorte" + nivelCorte);
	System.out.println("emoFeliz" + emoFeliz);
	
	int clanEmo = emoFeliz * 5;
	//System.out.println("clan emo" + clanEmo);
	//System.out.println("Divido el clan " + clanEmo);
	//System.out.println("Módulo2 "+(clanEmo%2) );
	
	System.out.println("Es mayor "+(clanEmo >20) );
	System.out.println("Es mayor "+(clanEmo <= 30) );
	
	System.out.println("Oprerador and "+(7 & 3) );
	System.out.println("Oprerador and "+(7 | 3) );
	System.out.println("Oprerador and lógico "+(7>3 && 3<5) );
	
	
	
	
	}

}
