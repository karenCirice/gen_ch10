package principal;

public class MainCiclos {

	public static void main(String[] args) {
		
		int contador = 0;
		/*
		//--------------Uso de while-----
		while (contador <5) {
			System.out.println("Valor del contador en while: " + contador);
			contador++;
		}
		*/
		
		/*
		//--------------Uso do-while------
		//reinicio mi variable
		contador = 10;
		do {
			System.out.println("Contador: " + contador);
			contador++;
		}while(contador <= 5);
		*/
		
		/*
		//--------------Uso de for---------
		for (int i = 0; i<=5; i++) {
			System.out.println("i vale: " + i);
		}
		
		//reinicio mi variable contador
		contador = 1;
		for( ; contador<=5 ; contador++) {
			System.out.println("Contador = " + contador);
		}
		*/
		
		/*
		//----Código de El regreso del Gera guapo--
		int i,j,k,n;
        n=10; //Modifica este parámetro si quieres
        for(i=1; i<n+(n/2); i++){
            for(j=n+(n/2); j>i; j--){System.out.print(" ");}
            for(k=1; k<=2*i-1; k++){System.out.print("*");}
            System.out.println("");
        }
        for(i=1; i<n-(n/2); i++){
            for(j=n+(n/2); j>1; j--){System.out.print(" ");}
            for(k=n/2; k<=(n/2)+1; k++){System.out.print("*");}
            System.out.println("");
        }
        */

        //----Uso de la palabra reservada break en el for----
        /*
		for (int gera = 1 ; gera <= 5 ; gera++) {
        	System.out.println("Gera #: " + gera);
        	if(gera > 1) {
        		System.out.println("Gera clonado");
        		break;
        	}
        }
        */
        
        for (int gera = 1 ; gera <= 5 ; gera++) {
        	if(gera != 3) {
        		System.out.println("Gera #: " + gera + " es gera-pirata");
        		continue;
        	}
        	System.out.println("Gera original");
        }
        
        
        
        
	}

}
