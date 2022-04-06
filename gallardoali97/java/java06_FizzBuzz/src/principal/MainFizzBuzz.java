package principal;

public class MainFizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated 
      int bandera=0;
      for(int i=1; i<=20;i++) {
    	  if(i%3==0 && i%5==0) {
    		  bandera=1;
    		  System.out.println("FizzBuzz");
    	  }else if (i%3==0 && bandera!=1) {
    		  bandera=0;
    		  System.out.println("Fizz");
    	  }else if(i%5==0 && bandera!=1) {
    		  bandera=0;
    		  System.out.println("Buzz");
    	  }
    	   else {
    		   bandera=0;
    		  System.out.println(i);
    	  }

      }
      
	}

}
