package Principal;

public class Main_FizzBuzz {
	
	public static void main(String[] args) {
		
		
		for (int ciclo =1; ciclo <=20; ciclo ++) { // tipo: int, nombre: ciclo, valor:1
		
			if (ciclo % 3 == 0) { // el % es el modulo // ==0 es el residuo, //el doble ==, el primer
				//igual es el tipo de caracter y el segundo es el valor, es fuertemente tipado
				
				System.out.println("El valor es: Fizz " + ciclo);
				
			} else if (ciclo % 5 == 0) {
				
				System.out.println("El valor es : Buzz " + ciclo);
				
			} else if (ciclo % 3 ==0 && ciclo % 5 ==0) {
				
				System.out.println("El valor es: FizzBuzz" + ciclo);
			}
			
			else {
				
				System.out.println("Valores restantes: " + ciclo);
			}		
			
		}
		
	}

}
