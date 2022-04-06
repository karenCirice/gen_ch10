package java07;

public class AritmeticaPrueba {
	
	public static void main (String[] args) {
		
		Aritmetica operacion = new Aritmetica ();
		operacion.a = 5;
		operacion.b = 6;
		operacion.sumar();
		
		int resultado = operacion.sumarConReturn();
		Systme.out.println("Resultado return :"+resultado);
		 
		int resultado = operacion.sumaConResultado();
		Systme.out.println("resultado return :"+resultado);
		
		int resultadoParametro = operacion.sumaConArgumentos(9,6);
		System.out.println("resultado con parametros :"+resultado);
	}
	
	


}
