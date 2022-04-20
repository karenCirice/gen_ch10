package org.generation.uber;

public class UberX {
	private String nombre;
	private String autoModelo;
	private String placas;
	private int tarifaMinima;
	private double tarifaPorKm;
	private double tarifaPorMin;
	/**
	 * Constructor que servira para mis clases hijas.
	 * Para qeu solko tengan acceso clases hijas
	 * @param nombre
	 * @param tarifaMinima
	 * @param tarifaPorKm
	 * @param tarifaPorMin
	 */
	
	
	
	protected UberX(String nombre, int tarifaMinima, double tarifaPorKm, double tarifaPorMin) {
		super();
		this.nombre = nombre;
		this.tarifaMinima = tarifaMinima;
		this.tarifaPorKm = tarifaPorKm;
		this.tarifaPorMin = tarifaPorMin;
	}
	
	public UberX(String nombre) {
		this.nombre = nombre;
		this.tarifaMinima = 35;
		this.tarifaPorKm = 3.57;
		this.tarifaPorMin = 1.8;
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the autoModelo
	 */
	public String getAutoModelo() {
		return autoModelo;
	}
	/**
	 * @param autoModelo the autoModelo to set
	 */
	public void setAutoModelo(String autoModelo) {
		this.autoModelo = autoModelo;
	}
	/**
	 * @return the placas
	 */
	public String getPlacas() {
		return placas;
	}
	/**
	 * @param placas the placas to set
	 */
	public void setPlacas(String placas) {
		this.placas = placas;
	}

	/**
	 * @return the tarifaMinima
	 */
	public int getTarifaMinima() {
		return tarifaMinima;
	}

	/**
	 * @param tarifaMinima the tarifaMinima to set
	 */
	public void setTarifaMinima(int tarifaMinima) {
		this.tarifaMinima = tarifaMinima;
	}

	/**
	 * @return the tarifaPorKm
	 */
	public double getTarifaPorKm() {
		return tarifaPorKm;
	}

	/**
	 * @param tarifaPorKm the tarifaPorKm to set
	 */
	public void setTarifaPorKm(double tarifaPorKm) {
		this.tarifaPorKm = tarifaPorKm;
	}

	/**
	 * @return the tarifaPorMin
	 */
	public double getTarifaPorMin() {
		return tarifaPorMin;
	}

	/**
	 * @param tarifaPorMin the tarifaPorMin to set
	 */
	public void setTarifaPorMin(double tarifaPorMin) {
		this.tarifaPorMin = tarifaPorMin;
	}
	
	public double getObtenerCosto(double km){
		double costo = Math.max(this.tarifaPorKm*km, this.tarifaPorMin);
		//71.3465 -> 7134.56 -> 7134 -> 71.34
		return Math.round(costo * 100.0)/100.0;
	}
	
	
	/**
	 * Método sobrecargado. Este método obtendrá el costo
	 * a partir de los minutos reccoridos.
	 * Características de un método sobrecargado, debe:
	 *  - Los argumentos deben ser ditintos.
	 *  - No se revisa los nombres de los argunmentos usados
	 *  - Se puede usar diferentes tipos de retornos
	 *  - El método sobrecargado, puede estar definido en
	 *  nuestra clase o clase superior.
	 * @param minutos
	 * @return
	 */
	public double getObtenerCosto(int minutos) {
		double costo = Math.max(this.tarifaPorMin*minutos, this.tarifaMinima);
		return Math.round(costo*100.0)/100.0;
	}
	

	/**
	 * Metodo que nos realiza la comparasion 
	 * @param km
	 * @param minutos
	 * @return
	 */
	public double getObtenerCosto(double km, int minutos){
		double costo = Math.max(this.getObtenerCosto(km), this.getObtenerCosto(minutos));
		return Math.round(costo*100.0)/100.0;
	}

	
	
}
