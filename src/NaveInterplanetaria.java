/**
 * Clase hija que extiende de la clase abstracta NaveEspacial e implementa de la interfaz AccesoDatos
 * Esta clase debido a su particularidad contiene un atributo unico no compartido con las demas clases.
 * @author Jorge Gomez
 *
 */
public class NaveInterplanetaria extends NaveEspacial implements AccesoDatos{
	/**
	 * Duracion de viaje que tendra la nave.
	 */
	private double duracionViaje;
	/*
	 * 
	 * Constructor sin argumentos
	 */
	public NaveInterplanetaria() {
		super();
		this.duracionViaje = 0.0;
		this.tipoNave = "Viaje a las estrellas";
	}
	/**
	 * Contructor con argumentos
	 * @param tipoNave describe que tipo de nave es y la hace unica de las demas.
	 * @param tamaño es el tamaño de la nave.
	 * @param velocidad es la velocidad que se le puede asignar a la nave.
	 * @param funcion es la finalidad u objetivo que tiene la nave
	 * @param tipoCombustible es el tipo de combustible que usa la nave.
	 * @param duracionViaje es el tiempo del viaje que tendra la nave.
	 */
	protected NaveInterplanetaria(String tipoNave, String tamaño, String velocidad, String funcion, String tipoCombustible, double duracionViaje) {
		super(tipoNave, tamaño, velocidad, funcion, tipoCombustible);
		this.duracionViaje =  duracionViaje;
	}

	/**
	 * Obtiene el tiempo del viaje que tendra la nave
	 * @return duracion del viaje.
	 */
	public double getDuracionViaje() {
		return duracionViaje;
	}

	/**
	 * Asigna el tiempo de viaje que tendra la nave.
	 * @param  duracionViaje es la duracion del viaje.
	 */
	public void setDuracionViaje(double duracionViaje) {
		this.duracionViaje = duracionViaje;
	}
	
	/**
	 * Implementacion del metodo abstracto despegar de la clase NaveEspacial.
	 */
	@Override
	public void despegar() {
		System.out.println("Esta nave despega con el titulo de nave exploratoria. ");
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
		System.out.println("Esta nave solo puede orbitar " + AccesoDatos.DIAS_ORBITA_NAVE_INTERPLANETARIA + " dias.");
		
	}

}
