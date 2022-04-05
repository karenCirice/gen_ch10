package java04;

public class logicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int emofeliz = 5;
		
		
		
		//System.out.println(emofeliz++);
		//System.out.println(emofeliz);
		
		//System.out.println(emofeliz--);
		//System.out.println(emofeliz);
		
		int nivelCorte = 1;
		emofeliz=5;
		nivelCorte = emofeliz++;
		
		System.out.println("nivel corte " + nivelCorte);
		System.out.println("emo feliz " + emofeliz);
		
		int clanEmo = emofeliz * 5;
		
		//System.out.println("Clan emo " + clanEmo);
		//System.out.println("Dividido el clan " + (clanEmo/2));
		//System.out.println("Dividido el clan " + (clanEmo%2));
		System.out.println("Es mayor "+(clanEmo>20));
		System.out.println("Es mayor "+(clanEmo<=30));
		System.out.println("Es mayor "+(7&3));
		System.out.println("Es mayor " + (7|3));
		System.out.println("Es mayor " + (7>3 && 3<5));
		int a = 8;
		int b = 3;
		int c = -5;
	    System.out.println(a - b - c * 2);
		
	}

}
