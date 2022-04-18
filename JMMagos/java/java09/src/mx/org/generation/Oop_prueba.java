package mx.org.generation;

public class Oop_prueba {
	
	/*variables en una clase se llaman así*/
	//int a, b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*definimmos 2 variables locales 
		 * cada atributo es una variable, pero una variable
		 * solo se considera atributo si es miembro de una clase
		 * "var" no se puede utilizar en atributos*/
		
		/*las mismas variables dentro de un método se llaman atributos*/
		//int a, b; //variables
		aritmetica calculadora=new aritmetica();
		aritmetica casio=new aritmetica();
		System.out.println();
		
		int resultado =calculadora.sumaRetorno(4, 6);
		System.out.println(resultado);
		calculadora.sumar();
	}

}
