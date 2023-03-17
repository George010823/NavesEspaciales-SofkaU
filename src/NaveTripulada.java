/**
 * Clase hija que extiende de la clase abstracta NaveEspacial e implementa de la interfaz AccesoDatos
 * Esta clase debido a su particularidad contiene un atributo unico no compartido con las demas clases.
 * @author Jorge Gomez
 *
 */
public class NaveTripulada extends NaveEspacial implements AccesoDatos {
	/**
	 * Número de tripulantes que soporta la nave.
	 */
	private int capacidadTripulacion;
	/*
	 * 
	 * Constructor sin argumentos
	 */
	public NaveTripulada() {
		super();
		this.capacidadTripulacion = 0;
		this.tipoNave = "Tripulada";
	}
	/**
	 * Contructor con argumentos
	 * @param tipoNave describe que tipo de nave es y que la hace unica de las demas.
	 * @param tamaño es el tamaño de la nave.
	 * @param velocidad es la velocidad que se le puede asignar a la nave.
	 * @param funcion es la finalidad u objetivo que tiene la nave
	 * @param tipoCombustible es el tipo de combustible que usa la nave.
	 */
	public NaveTripulada(String tipoNave, String tamaño, String velocidad, String funcion, String tipoCombustible) {
		super(tipoNave, tamaño, velocidad, funcion, tipoCombustible);
		this.capacidadTripulacion = 0;
	}
	/**
	 * Obtiene la cantidad de tripulantes de la nave.
	 * @return cantidad de tripulantes
	 */
	public int getCapacidadTripulacion() {
		return capacidadTripulacion;
	}
	
	/**
	 * Asigna un número de tripulantes a la nave.
	 * @param capacidadTripulacion es el número de tripulantes de la nave.
	 */
	public void setCapacidadTripulacion(int capacidadTripulacion) {
		this.capacidadTripulacion = capacidadTripulacion;
	}
	
	/**
	 * Implementacion del metodo abstracto despegar de la clase NaveEspacial.
	 */
	@Override
	public void despegar() {
		System.out.println("Esta nave despega con el titulo de nave tripulada. ");
	}

	/**
	 * Implementacion del metodo abstracto destino de la clase NaveEspacial.
	 */
	@Override
	public void destino() {
		System.out.print("El destino o la finalidad de esta nave es ");
	}
	
	/**
	 * Implementacion del metodo orbitar implementado de la interfaz AcceDatos.
	 */
	@Override
	public void orbitar() {
		System.out.println("Esta nave estará en orbita " + AccesoDatos.DIAS_ORBITA_NAVE_TRIPULADA + " dias. ");
	}

}
