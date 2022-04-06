/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *Java06 Bucles
 * @author ernestoaldanallamas
 */
public class Main {
    public static void main(String[] args) {
        int contador = 0;
        while (contador <= 5) {            
            System.out.println("Valor del contador: "+contador);
            contador++;
        }
        //Uso del ciclo Do while
        contador = 0;
        do{
            System.out.println("Valor del contador en Do while: "+contador);
            contador++;
        }while(contador < 5);
        
        //Uso del For
        for (int i = 0; i < 10; i++) {
            if(i == 3){
                continue;
            }
            System.out.println("Valor de i: "+i);
//            if(i > 1){
//                System.out.println("Gera clonado");
//                break;
//            }
        }
    }
}
