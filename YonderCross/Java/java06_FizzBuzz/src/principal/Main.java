package principal;

public class Main {

	public static void main(String[] args) {
		// FizzBuzz Game
		
		for(int i=1;i<=20;i++) {
			
			if(i%3 == 0 && i%5 == 0) {
				System.out.println("FizzBuzz");
				
			}else if(i%5 == 0){
				System.out.println("Buzz");
			}else if(i%3 == 0 ){
				System.out.println("Fizz");	
				
			}else {
				System.out.println(i);
			}
		}
	}

}
