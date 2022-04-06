package java06_FizzBuzz;

public class Main_FizzBuzz {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=20;

		for(int i=1;i<=num;i++) {

			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			}
			else if(i%3==0) {
				System.out.println("Fizz");
			}
			else if(i%5==0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}


		}

	}
}
