package principal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int i=0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		*/
		/*int cont=0;
		do {
			System.out.println(cont);
			cont++;
		}while(cont<10);*/
		
		for(int gera=1;gera<=5;gera++) {
			if(gera!=3) {
				System.out.println("gera pirata: "+gera);
				continue;
			}
			System.out.println("gera original: "+gera);
		}
		
	}

}
