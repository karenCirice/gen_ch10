package principal;

public class Main {

	public static void main(String[] args) {
		
		int num = 20;
		
		for (int i = 1; i<=num ;i++) {
			if (i %3 == 0) {
				System.out.println("Fizz");
			}else if (i %5 ==0) {
				System.out.println("Bizz");
				
			}else if (i % 3 ==0 && i % 5 == 0) {
				System.out.println("BixFuzz");
			}else {
				System.out.println(i);
			}
		}

	}

}
