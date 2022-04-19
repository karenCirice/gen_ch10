package mx.org.generation;

public class Personas {
	String nombre;
	String apellido;
	int edad;
	float efe;
	
	public Personas(String nom, String ap,int anos, float billano){
		this.nombre=nom;
		this.apellido=ap;
		this.edad=anos;
		this.efe=billano;
	}
	
	public Personas(String nom, int Edad, float dinero) {
		this.nombre=nom;
		this.edad=Edad;
		this.efe=dinero;
	}
	
	void presentar() {
		System.out.println(nombre+" "+apellido+" tiene "+edad+" con "+efe+" de dinero");
	}
	
	void presentarCorto() {
		System.out.println(nombre+" tiene "+edad+" con dinero "+efe);
	}
}

