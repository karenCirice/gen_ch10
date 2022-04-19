
package org.generation.peliculas;

/**
 * @author Yoscelín RS
 *18 abr. 2022
 */



	public class Pelicula {
		private String nombre;
		private String clasifica;
		private String region;
		/**
		 * Constructor de la clase pelicula 
		 * @param nombre de la pelicula 
		 * @param clasifica de la pelicula 
		 * @param region donde fue filmada 
		 */
		public Pelicula(String nombre, String clasifica, String region) {
			super();
			this.nombre = nombre;
			this.clasifica = clasifica;
			this.region = region;
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
		 * @return the clasifica
		 */
		public String getClasifica() {
			return clasifica;
		}
		/**
		 * @param clasifica the clasifica to set
		 */
		public void setClasifica(String clasifica) {
			this.clasifica = clasifica;
		}
		/**
		 * @return the region
		 */
		public String getRegion() {
			return region;
		}
		/**
		 * @param region the region to set
		 */
		public void setRegion(String region) {
			this.region =region;
		}
		@Override
		public String toString() {
			return "Pelicula [nombre=" + nombre + ", clasifica=" + clasifica + ", region=" + region + "]";
		}

}
