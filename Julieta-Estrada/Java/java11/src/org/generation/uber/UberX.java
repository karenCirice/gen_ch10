package org.generation.uber;

public class UberX {
	
	private String nombre; 
	private String autoModelo;
	private String placas;
	private int tarifaMinima;
	private double tarifaPorKm;
	private double tarifaPorMin;
	
	/**
	 * constructor para el servicio básico de Uber
	 * @param nombre
	 */
	
	public UberX(String nombre) {
		this.nombre = nombre;
		this.tarifaMinima = 35;
		this.tarifaPorKm = 3.57;
		this.tarifaPorMin = 1.8;
	}
	
	/**
	 * Constructor que servirá a mis clases hijas y sólo éstas tendrán acceso
	 * @param nombre del constructor 
	 * @param tarifaMinima del servicio
	 * @param tarifaPorKm 
	 * @param tarifaPorMin
	 */
	
	protected UberX(String nombre, int tarifaMinima, double tarifaPorKm, double tarifaPorMin) {
		this.nombre = nombre;
		this.tarifaMinima = tarifaMinima;
		this.tarifaPorKm = tarifaPorKm;
		this.tarifaPorMin = tarifaPorMin;
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
	public double getTarifaPorMin() {
		return tarifaPorMin;
	}

	public void setTarifaPorMin(double tarifaPorMin) {
		this.tarifaPorMin = tarifaPorMin;
	}
	
	public double getObtenerCosto (double km) {
		double costo = Math.max(this.tarifaPorKm*km, this.tarifaMinima);
		return Math.round(costo*100.0)/100.0;
	}
	
	/**
	 * Metodo sobre cargado, va a obtener el costo por 
	 * minutos recorridos se saco copiando el de arriba y 
	 * y solo cambiamos las variables
	 * Para sobrecargar un metodo se deben de tener argumentos distintos,
	 * diferentes tipos de retornos, mientras sea diferente el tipo se 
	 * puede usar el mismo argumento (int min) (double min)
	 * puede estar definido en nuestra calse o clase superior 
	 * @param minutos
	 * @return
	 */
	public double getObtenerCosto (int minutos) {
		double costo = Math.max(this.tarifaPorMin*minutos, this.tarifaMinima);
		return Math.round(costo*100.0)/100.0;
	}
	/**
	 * Metodo que nos realiza la comparacion de km o min
	 *  retorna le valor mayor
	 * @param km
	 * @param minutos
	 * @return
	 */
	public double getObtenerCosto (double km,int minutos) {
		double costo = Math.max(this.getObtenerCosto(km), this.getObtenerCosto(minutos));
		return Math.round(costo*100.0)/100.0;
	}
	
	public double getObtenerRecorrido(double km) {
		return Math.min(this.tarifaMinima*km, this.tarifaPorMin);
	}
}
