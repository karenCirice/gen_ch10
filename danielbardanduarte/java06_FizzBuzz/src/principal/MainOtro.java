package principal;

public class MainOtro {

	public static void main(String[] args) {
	
	
		
		int Inicial = 1;
		int Final = 20;
				
		for(int i= Inicial; i<=Final; i++) { 
			if  ((i%3 == 0) && (i%5 == 0)) {
				System.out.println("Fizz");
			}
			
			else if (i%5 == 0) {
				System.out.println("Buzz");
			}
			
			else if (i%3 == 0){
				System.out.println("FizzBuzz");
	}
			else 
					System.out.println(i);
					
	
		}
	}
	
}


