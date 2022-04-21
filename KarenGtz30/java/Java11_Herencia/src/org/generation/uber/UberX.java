package org.generation.uber;

public class UberX {
	private String nombre;
	private String autoModelo;
	private String placas;
	private int tarifaMinima;
	private double tarifaPorKm;
	private double tarifaporMin;
	
	/**
	 * Contructor para el servicio básico de Uber.
	 * @param nombre
	 */
	public UberX(String nombre) {
		this.nombre = nombre;
		this.tarifaMinima = 35;
		this.tarifaPorKm = 3.57;
		this.tarifaporMin = 1.8;
	}
	
	/**
	 * Contructor que servirá a mis clases hijas.
	 * Para que solo tengan acceso clas clases hijas
	 * establezco el modificador con protected.
	 * @param nombre del conductor
	 * @param tarifaMinima del servicio
	 * @param tarifaPorKm del servicio
	 * @param tarifaporMin del servicio
	 */
	protected UberX(String nombre, int tarifaMinima, double tarifaPorKm, double tarifaporMin) {
		this.nombre = nombre;
		this.tarifaMinima = tarifaMinima;
		this.tarifaPorKm = tarifaPorKm;
		this.tarifaporMin = tarifaporMin;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutoModelo() {
		return autoModelo;
	}

	public void setAutoModelo(String autoModelo) {
		this.autoModelo = autoModelo;
	}

	public String getPlacas() {
		return placas;
	}

	public void setPlacas(String placas) {
		this.placas = placas;
	}

	public int getTarifaMinima() {
		return tarifaMinima;
	}

	public void setTarifaMinima(int tarifaMinima) {
		this.tarifaMinima = tarifaMinima;
	}

	public double getTarifaPorKm() {
		return tarifaPorKm;
	}

	public void setTarifaPorKm(double tarifaPorKm) {
		this.tarifaPorKm = tarifaPorKm;
	}

	public double getTarifaporMin() {
		return tarifaporMin;
	}

	public void setTarifaporMin(double tarifaporMin) {
		this.tarifaporMin = tarifaporMin;
	}
	
	public double getObtenerCosto(double km) {
		double costo = Math.max(this.tarifaPorKm*km, this.tarifaMinima);
		// 71.345625568 -> 7134.56 -> 7134 -> 71.34
		return Math.round(costo*100.0)/100.0;
	}
	
	/**
	 * Método que nos realiza la comparación de costos
	 * @param km recorrido
	 * @param minutos recorridos
	 * @return el costo mayor entre km o minutos
	 */
	public double getObtenerCosto(double km, int minutos) {
		double costo = Math.max(this.getObtenerCosto(km), this.getObtenerCosto(minutos));
		return Math.round(costo*100.0)/100.0;		
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
		double costo = Math.max(this.tarifaporMin*minutos, this.tarifaMinima);
		return Math.round(costo*100.0)/100.0;
	}
	
	
	/*
	public int getNuevoMetodo(int argumento) {	
		return argumento; 
	}
	
	public double getNuevoMetodo(double argumento) {		
		return argumento; 
	}*/
}