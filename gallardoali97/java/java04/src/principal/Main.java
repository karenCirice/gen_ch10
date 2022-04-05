package principal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int emoFeliz=5;
        System.out.println(++emoFeliz);
        System.out.println(emoFeliz--);
        System.out.println(emoFeliz);
        
        int nivelCorte = 1;
        
        nivelCorte = emoFeliz++;
        System.out.println("Nivel de corte"+ nivelCorte);//5
        System.out.println("Nivel de corte"+ emoFeliz);//6
        
        int clanEmo = emoFeliz * 5;
      /*  System.out.println("Clan emo: "+clanEmo);//30
        System.out.println("Clan emo: "+(clanEmo/2));//15  */
       
        System.out.println("Es mayor "+(clanEmo>20));//true
        System.out.println("Es mayor "+(7 & 3));//3
        System.out.println("Es mayor "+(7 | 3));//7
        System.out.println("Es mayor "+(8>5 & 4<5));//true
       
	}

}
