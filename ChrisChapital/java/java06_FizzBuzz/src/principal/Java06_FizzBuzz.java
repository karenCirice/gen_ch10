package principal;

public class Java06_FizzBuzz {

	public static void main(String[] args) {
	 int a;
	 int b;
	  for (a = 0, b = 0; b > a; a++, b++) {
		  System.out.println(a + " " + b);
	  }
	 System.out.println(a + " " + b);

	a = 1;
	b =10;
	
	do {
		if (a++ > --b) continue;
	} while (a < 5);
	System.out.println(a + " " + b);
	
	byte z = 10;
	do {
		z--;
		System.out.println(z);
	} while (z <10);
	}
	
	
}

