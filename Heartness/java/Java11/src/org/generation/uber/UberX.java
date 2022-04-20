package org.generation.uber;

public class UberX {
	private String nombre;
	private String autoModelo;
	private String placas;
	private int tarifaMinima;
	private double tarifaPorKm;
	private double tarifaPorMin;
	
	public UberX(String nombre) {
		this.nombre = nombre;
		this.tarifaMinima = 35;
		this.tarifaPorKm = 3.57;
		this.tarifaPorMin = 1.8;
	}
	
	/**
	 * @param nombre
	 * @param tarifaMinima
	 * @param tarifaPorKm
	 * @param tarufaPorMin
	 */
	protected UberX(String nombre, int tarifaMinima, double tarifaPorKm, double tarifaPorMin) {
		super();
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
	public double getTarufaPorMin() {
		return tarifaPorMin;
	}
	public void setTarufaPorMin(double tarufaPorMin) {
		this.tarifaPorMin = tarufaPorMin;
	}
	
	public double getObtenerCosto(double km) {
		double costo = Math.max(this.tarifaPorKm*km, this.tarifaMinima);
		return Math.round((costo*100.0)/100.0);
	}
	
	public double getObtenerCosto(int minutos) {
		double costo = Math.max(this.tarifaPorMin*minutos, this.tarifaMinima);
		return Math.round((costo*100.0)/100.0);
	}
	
	
}
