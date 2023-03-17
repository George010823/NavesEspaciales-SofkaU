/**
 * Clase hija que extiende de la clase abstracta NaveEspacial e implementa de la interfaz AccesoDatos
 * Esta clase debido a su particularidad contiene dos atributos unicos no compartido con las demas clases.
 * @author Jorge Gomez
 *
 */
public class NaveLanzadera extends NaveEspacial implements AccesoDatos{
	/**
	 * El tipo de propulsion que tendra la nave.
	 * La capacidad de carga de la nave.
	 */
	private String tipoPropulsion;
	private double capacidadCarga;
	/*
	 * 
	 * Constructor sin argumentos
	 */
	public NaveLanzadera() {
		super();
		this.tipoPropulsion = "";
		this.capacidadCarga = 0.0;
		this.tipoNave = "Soporte y mantenimiento.";
	}
	/**
	 * Contructor con argumentos
	 * @param tipoNave describe que tipo de nave es y la hace unica de las demas.
	 * @param tamaño es el tamaño de la nave.
	 * @param velocidad es la velocidad que se le puede asignar a la nave.
	 * @param funcion es la finalidad u objetivo que tiene la nave
	 * @param tipoPropulsion es el tipo de propulsion que tendra la nave.
	 * @param capacidadCarga es la capacidad de carga de la nave.
	 */
	protected NaveLanzadera(String tipoNave, String tamaño, String velocidad, String funcion, String tipoCombustible, String tipoPropulsion, 
			double capacidadCarga) {
		super(tipoNave, tamaño, velocidad, funcion, tipoCombustible);
		this.tipoPropulsion = tipoPropulsion;
		this.capacidadCarga = capacidadCarga;
	}

	/**
	 * Obtiene el tipo de propulsion de la nave
	 * @return tipo de propulsion.
	 */
	public String getTipoPropulsion() {
		return tipoPropulsion;
	}

	/**
	 * Asigna el tipo de propulsion de la nave.
	 * @param  tipoPropulsion es la propulsion de la viaje.
	 */
	public void setTipoPropulsion(String tipoPropulsion) {
		this.tipoPropulsion = tipoPropulsion;
	}

	/**
	 * Obtiene la capacidad de carga de la nave
	 * @return capacidad de carga.
	 */
	public double getCapacidadCarga() {
		return capacidadCarga;
	}

	/**
	 * Asigna la capacidad de carga de la nave.
	 * @param  capacidadCarga es la capacidad de carga de la viaje.
	 */
	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	/**
	 * Implementacion del metodo abstracto despegar de la clase NaveEspacial.
	 */
	@Override
	public void despegar() {
		System.out.println("Esta nave despega con el titulo de nave de abastecimiento y soporte. ");
	}

	/**
	 * Implementacion del metodo abstracto destino de la clase NaveEspacial.
	 */
	@Override
	public void destino() {
		System.out.print("El destino de esta nave es ");
	}

	/**
	 * Implementacion del metodo orbitar implementado de la interfaz AcceDatos.
	 */
	@Override
	public void orbitar() {
		System.out.println("Esta nave solo puede orbitar " + AccesoDatos.DIAS_ORBITA_NAVE_LANZADERA + " dias.");
		
	}

}
