package principal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i=5;
		//System.out.println("Factorial de "+i +" es: "+factorial(i));
		for(int i=0; i<=10; i++) {
			System.out.println("Factorial de "+i +" es: "+factorial(i));
		}
	}
	
    static int factorial(int n){
        int x=1;
        int rep=1;
        if(n>=1){
        	/*Para recursividad y monitorieo de variable*/
        	//System.out.printf("%d *", n);
            //x=n*factorial(n-1);
        	/*sin recursividad, usando iteración*/
        	while(rep<n) {
        		x=x*(rep+1);
        		rep++;
        	}
        }
        return x;
    }

}
