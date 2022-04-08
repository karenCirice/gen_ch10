package principal;

public class mainFizzBuzz {

	public static void main(String[] args) {
	  int i=1;
	  for(i=1; i<=20; i++) {
		  if(((i % 3)==0) && ((i % 5)==0)) {
			  System.out.println("FizzBuzz");
			    continue;
		  }
		  else if((i % 5)==0) {
			  System.out.println("Buzz");  
		   continue;
		  }
		  else if((i % 3)==0) {
			  System.out.println("Fizz");  
			   continue;	  
		  }
		  
		  else {
			  System.out.println(i);
			continue;
		  }
	  }
	}

}
