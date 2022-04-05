package principal;

public class MainFactorial {

	public static void main(String[] args) {
//		int factorial =1 ,num =5;
//		
//		for(int i = 1 ; i<=num;i++) {
//			
//			factorial *= i ;
//	
//		}
//		System.out.println("El factorial de " + num + " es: " + factorial);
//
//	}
//}
		
		
		int factorial = 1, num = 10;
	 	
		for (int i = 1; i<=num ; i++) {
			factorial *= i ;
			
			System.out.println("El factorial de " + i + " es: " + factorial);
		}
	
	}
}
