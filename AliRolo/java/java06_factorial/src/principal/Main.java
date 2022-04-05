package principal;

public class Main {
	public static void main(String[] args) {
	/*int num = 120;
	int i = 5;
	
	for (i=5; num<=150; i++) {
		System.out.println("El factorial de " + i + " es:" + num);
		break;
	}*/
		
		int num = 1;
		int fact = 1;
		
		for (fact=1; num<= 10; num++) {
			fact *= num;
			System.out.println("El factorial de " + num + " es " +fact );
	
		}
		
		
		/*for (int num = 1; num <=20; num++) {
			if ((num%3==0) && (num%5==0)) {
				System.out.println("FizzBuzz");
					}else if (num%3==0) {
						System.out.println("Fizz");
					}else if (num%5==0) {
						System.out.println("Buzz");
					}else {
						System.out.println(num);
					}
		}*/
	}}