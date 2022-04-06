package principal;

/**
 *
 * @author ernestoaldanallamas
 */
public class Main {
    public static void main(String[] args) {
        int emoFeliz = 5;
        
        System.out.println(emoFeliz++);//5
        System.out.println(emoFeliz);//6
        
        System.out.println(emoFeliz--);//6
        System.out.println(emoFeliz);//5
        
        int nivelCorte = 1;
        emoFeliz = 5;
        nivelCorte = emoFeliz++;
        
        System.out.println("nivel Corte "+nivelCorte);
        System.out.println("emoFeliz "+emoFeliz);
        
        int clanEmo = emoFeliz * 5;
        System.out.println("clan emo "+clanEmo);//30
        System.out.println("Divido el clan"+(clanEmo/2));//15
        System.out.println("Modulo 2 "+(clanEmo%2));//0
        int mayor = clanEmo > emoFeliz ? clanEmo:emoFeliz;
        System.out.println("El mayor es: "+mayor);
        System.out.println(7 & 3);
        

        
    
    }
}
