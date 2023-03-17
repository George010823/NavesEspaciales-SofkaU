/**
 * 
 * @author Jorge Gomez
 *
 */
public interface AccesoDatos {

	//LOS MODIFICADORES DE ACCESO public y static SE ASIGNAN POR DEFAULT A LA VARIABLE
	//YA QUE ESTA SE CONVIERTE EN UNA CONSTANTE(final), NO ES NECESARIO ESCRIBIRLAS.
	//int DIAS_ORBITA = 365;
	/**
	 * Se declaran variables tipo final para el uso de cada una de las clases que implementan la interfaz.
	 */
	public static final int DIAS_ORBITA_NAVE_TRIPULADA = 365;
	int DIAS_ORBITA_NAVE_NOTRIPULADA = 100;
	int DIAS_ORBITA_NAVE_INTERPLANETARIA = 1500;
	int DIAS_ORBITA_NAVE_LANZADERA = 10;
	
	//PARA LOS METODOS COLOCAR LOS MODIFICADORES public y abstaract SON OPCIONALES YA QUE ESTABLECEN POR DEFECTO
	//ESTOS METODOS NO TIENEN CUERPO, NO SE IMPLEMENTAN, SOLO SON LA FIRMA DEL METODO.
	/**
	 * Se crea el metodo comun a las clases que desean utilizar e implementar la función orbitar.
	 */
	public abstract void orbitar();
}
