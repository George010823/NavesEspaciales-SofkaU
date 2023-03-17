/**
 * Clase abstracta que contiene los atributos caracteristicos a todas las demas clases hijas.
 * @author Jorge Gomez
 *
 */
public abstract class NaveEspacial {
	
	protected String tipoNave;
	protected String tamaño;
	protected String velocidad;
	protected String funcion;
	protected String tipoCombustible;
	/**
	 * Constructor sin argumentos.	
	 */
	protected NaveEspacial() {
		
		this.tipoNave = "";
		this.tamaño = "";
		this.velocidad = "";
		this.funcion = "";
		this.tipoCombustible = "";
	}

	/**
	 * Contructor con argumentos
	 * @param tipoNave describe que tipo de nave es y que la hace unica de las demas.
	 * @param tamaño es el tamaño de la nave.
	 * @param velocidad es la velocidad que se le puede asignar a la nave.
	 * @param funcion es la finalidad u objetivo que tiene la nave
	 * @param tipoCombustible es el tipo de combustible que usa la nave.
	 */
	protected NaveEspacial(String tipoNave, String tamaño, String velocidad, String funcion, String tipoCombustible) {
		
		this.tipoNave = tipoNave;
		this.tamaño = tamaño;
		this.velocidad = velocidad;
		this.funcion = funcion;
		this.tipoCombustible = tipoCombustible;
	}
	/**
	 * Declaracion de metodos abstractos
	 */
	public abstract void despegar();
	public abstract void destino();
	
	/**
	 * Obtiene el tipo de nave.
	 * @return el tipo de nave
	 */
	public String getTipoNave() {
		return tipoNave;
	}

	/**
	 * Asigna un nombre a la nave.
	 * @param tipoNave es el nombre de la nave.
	 */
	public void setTipoNave(String tipoNave) {
		this.tipoNave = tipoNave;
	}

	/**
	 * Obtiene el tamaño de la nave.
	 * @return el tamaño de la nave.
	 */
	public String getTamaño() {
		return tamaño;
	}

	/**
	 * Asigna el tamaño de la nave.
	 * @param tamaño es el tamaño de la nave
	 */
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	/**
	 * Obtiene la velocidad de la nave.
	 * @return la velocidad de la nave.
	 */
	public String getVelocidad() {
		return velocidad;
	}

	/**
	 * Asigna un valor de velocidad a la nave.
	 * @param velocidad es el valor de velocidad de la nave.
	 */
	public void setVelocidad(String velocidad) {
		this.velocidad = velocidad;
	}

	/**
	 * Obtiene la función u objetivo a la nave.
	 * @return el objetivo de la nave.
	 */
	public String getFuncion() {
		return funcion;
	}

	/**
	 * Asigna una función u objetivo a la nave.
	 * @param funcion es el valor de asignacion de objetivo a la nave.
	 */
	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}

	/**
	 * Obtiene el tipo de combustible de la nave.
	 * @return el tipo de combustible.
	 */
	public String getTipoCombustible() {
		return tipoCombustible;
	}

	/**
	 * Asigna el tipo de combustible a la nave.
	 * @param tipoCombustible es el tipo de combustible
	 */
	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	@Override
	public String toString() {
		return "NaveEspacial [tipoNave=" + tipoNave + ", tamaño=" + tamaño + ", velocidad=" + velocidad + ", funcion="
				+ funcion + ", tipoCombustible=" + tipoCombustible + "]";
	}
	
}
