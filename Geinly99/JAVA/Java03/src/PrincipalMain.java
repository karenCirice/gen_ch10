

/**
 *
 * @author giselsepulveda
 */
public class PrincipalMain {
    public static void main(String[] args){
    int emoFeliz = 5;
    
        System.out.println(emoFeliz++);//primero se lee y luego se incrementa
        System.out.println(emoFeliz--);//sigue siendo 6, primero se lee y luego se decrementa
        
        int nivelCorte = 1;
        
        nivelCorte= emoFeliz++;
        System.out.println("Nivel corte " + nivelCorte);
        System.out.println("emofeliz " + emoFeliz);
        
        int clanEmo = emoFeliz * 5;// da 30
        System.out.println(clanEmo);
        System.out.println("Dividido el clan " + (clanEmo/2));
        System.out.println("Módulo2 " + (clanEmo%2));
        
        emoFeliz=5;
        System.out.println("Es mayor " + (clanEmo > 20));//true
        System.out.println("Es igual " +(clanEmo <= 30));//true
        System.out.println("Operador and " + (8 & 4));//0
        System.out.println("Operador and " + (7 & 3));//false, 3 -> 0b0011
                                                            // 7 -> 0b0111
                                                            // 

        System.out.println("Operador and " + (7|3)); //
        System.out.println("Operador and lógico " + (7>3 && 3<5));//true y true = true
       
        

       
    }
}
