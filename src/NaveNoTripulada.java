/**
 * Clase hija que extiende de la clase abstracta NaveEspacial e implementa de la interfaz AccesoDatos
 * Esta clase debido a su particularidad contiene un atributo unico no compartido con las demas clases.
 * @author Jorge Gomez
 *
 */
public class NaveNoTripulada extends NaveEspacial implements AccesoDatos {
	/**
	 * Tipo de carga que soporta la nave.
	 */
	private String tipoCarga;
	/*
	 * 
	 * Constructor sin argumentos
	 */
	public NaveNoTripulada() {
		super();
		this.tipoCarga = "";
		this.tipoNave = "Nave no Tripulada o Robotica";
	}
	/**
	 * Contructor con argumentos
	 * @param tipoNave describe que tipo de nave es y la hace unica de las demas.
	 * @param tamaño es el tamaño de la nave.
	 * @param velocidad es la velocidad que se le puede asignar a la nave.
	 * @param funcion es la finalidad u objetivo que tiene la nave
	 * @param tipoCombustible es el tipo de combustible que usa la nave.
	 * @param tipoCarga es el tipo de carga que lleva la nave
	 */
	protected NaveNoTripulada(String tipoNave, String tamaño, String velocidad, String funcion, String tipoCombustible, String tipoCarga) {
		super(tipoNave, tamaño, velocidad, funcion, tipoCombustible);
		this.tipoCarga = tipoCarga;
	}
	/**
	 * Obtiene el tipo de carga que transporta la nave.
	 * @return tipo de carga
	 */
	public String getTipoCarga() {
		return tipoCarga;
	}

	/**
	 * Asigna el tipo de carga que transportara la nave.
	 * @param  tipoCarga es el tipo de carga.
	 */
	public void setTipoCarga(String tipoCarga) {
		this.tipoCarga = tipoCarga;
	}

	/**
	 * Implementacion del metodo abstracto despegar de la clase NaveEspacial.
	 */
	@Override
	public void despegar() {
		System.out.println("Esta nave despega con el titulo de nave robotica. ");
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
		System.out.println("Esta nave solo puede orbitar " + AccesoDatos.DIAS_ORBITA_NAVE_NOTRIPULADA + " dias.");
		
	}

}
