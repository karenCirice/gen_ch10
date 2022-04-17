package mx.org.generation;

public class ArreglosConcepto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crear arreglo*/
		int edades[]=new int[5];
		
		/*Arreglo de strings*/
		String[] nombre=new String[5];
		
		/*imprimimos su dirección de memoria*/
		System.out.println(edades);
		System.out.println(nombre);
		
		edades[1]=20;

		nombre[0]="Carlos";
		nombre[1]="memo";
		nombre[2]="maría";
		nombre[3]="juan";
		nombre[4]="gerita";
		
		for (int i = 0; i < nombre.length; i++) {
			System.out.println(nombre[i]);
		}
		
		String frutitas[]= {"manzana", "pera", "platano", "guayaba", "melon"};
		for (int i = 0; i < frutitas.length; i++) {
			System.out.println(frutitas[i]);
		}
		
		int animales[][]=new int[3][4];
	}

}
