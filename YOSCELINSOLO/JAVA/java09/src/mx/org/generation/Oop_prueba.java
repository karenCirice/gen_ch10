/**
 * 
 */
package mx.org.generation;

/**
 * @author Yoscel�n RS
 *7 abr. 2022
 */
public class Oop_prueba {

	/**
	 * @param args
	 */
	//int atributoX; //Esto es una variable pero se llama atributo
	//int atributoy; //Esto es una variable, pero le llamamos atributo porque esta dentro de una clase
	//Public static void main (String[] args) es el m�todo principal especial que java ejecuta
	public static void main(String[] args) {
		/**
		 * Definimos 2 variables locales
		 * Cada atributo es una variable, pero una variable
		 * solo se considera atributo si es mienbro de una clase
		 * "var" no se puede utilizar en atributos.
		 */
		
		int numA; //Esto es una variable porque esta dentro del m�todo principal public statis void main (m�todo y funci�n es lo mismo)
		int numB;//Esto es una variable
		
		// Es un avariable cuando esta dentro de un m�todo o funcion que ser�a lo mismo
		// Es atributo cuando esta dentro de una clase
		
		Aritmetica operaciones = new Aritmetica(); //Los ultimos parentesis de arimtm�tica se ponen ya que instancias a mi constructor en este caso es uno vac�o
		//Se le llaman argumentos de entrada a los datos que le pasamos a nuestro m�todo.
		int resultado = operaciones.sumarConArgumentos(4, 6);
		
		System.out.println(resultado);
		System.out.println(operaciones.sumarConReturn());
		
		Aritmetica calculadora = new Aritmetica();
		
		otroMetodo();
		
		
	}
	/**
	 * PARA QUE PUEDA SER USADO ESTE M�TODO EN STATIC MAIN
	 * ESTE M�TODO TAMBI�N DEBE SER DE TIPO STATIC
	 */
	static void otroMetodo() {
		System.out.println("Se ejecuta otro m�todo");

	}
}


