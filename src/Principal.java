import java.util.Scanner;

/**
 * 
 * @author Jorge Gomez
 *
 */
public class Principal {

	private static int opcion;
	
	public static void main(String[] args) {
		/**
		 * Se crea el ciclo do - while para que permita interactuar al usuario hasta que desee con la aplicación.
		 */
		do {
			System.out.println("Bienvenidos a su sistema de creación de naves espaciales:");
			System.out.println("Desea crear una nave nueva?");
			System.out.println("1. Si.");
			System.out.println("2. No.");
			System.out.println("0. Salir.");
			
			/**
			 * Se crean los objetos de cada tipo de nave para instanciar las funcionalidaddes de la interfaz implementada.
			 */
			AccesoDatos datosTripulada = new NaveTripulada();
			AccesoDatos datosNoTripulada = new NaveNoTripulada();
			AccesoDatos datosInterplanetaria = new NaveInterplanetaria();
			AccesoDatos datosLanzadera = new NaveLanzadera();
			
			/**
			 * Se crean instancias de tipo Scanner para las variables unicas de cada clase.
			 */
			Scanner inpCapacidadTripulacion = new Scanner(System.in);
			Scanner inpTamaño = new Scanner(System.in);
			Scanner inpVelocidad = new Scanner(System.in);
			Scanner inpFuncion = new Scanner(System.in);
			Scanner inpTipoCombustible = new Scanner(System.in);
			Scanner inpTipoCarga = new Scanner(System.in);
			Scanner inpDuracionViaje = new Scanner(System.in);
			Scanner inpTipoPrpopulsion = new Scanner(System.in);
			Scanner inpCapacidadCarga = new Scanner(System.in);
			Scanner inpOpcion = new Scanner(System.in);
			
			System.out.println("Escriba su opción:");
			opcion = inpOpcion.nextInt();
			
			/**
			 * Se crea condicional if para validar las entradas de selección del usuario.
			 */
			if(opcion == 1) {
				System.out.println("Escoja el tipo de nave a crear.");
				System.out.println("1. Tripulada.");
				System.out.println("2. No Tripulada.");
				System.out.println("3. Lanzadera.");
				System.out.println("4. Interplanetaria.");
				System.out.println("Escriba su opción:");
				opcion = inpOpcion.nextInt();
				
				/**
				 * Se crea condicional switch para validar que tipo de nave se desea crear.
				 */
				switch (opcion) {
				/**
				 * Case 1 para creación de naves tipo tripuladas.
				 * Se instancia la clase abstracta madre para implementar sus metodos.
				 * Se instancia la clase hija para acceder a sus variables unicas.
				 */
				case 1: 			
					NaveEspacial naveTripulada = new NaveTripulada();
					NaveTripulada naveTripuladaClase = new NaveTripulada();
					
					System.out.println("Escriba la cantidad de tripulantes que desea tener en la nave.");
					naveTripuladaClase.setCapacidadTripulacion(inpCapacidadTripulacion.nextInt());
					System.out.println("Escriba el tamaño de la nave: GRANDE/MEDIANO/PEQUEÑO.");
					naveTripulada.setTamaño(inpTamaño.nextLine());
					System.out.println("Escriba la velocidad en Km/h de la nave.");
					naveTripulada.setVelocidad(inpVelocidad.nextLine());
					System.out.println("Escriba el destino o funcionalidad de la nave.");
					naveTripulada.setFuncion(inpFuncion.nextLine());
					System.out.println("Escriba el tipo de combustible que consume la nave.");
					naveTripulada.setTipoCombustible(inpTipoCombustible.nextLine());
					
					System.out.println("A continuación se mostrará el detalle de la nave creada por usted.");
					System.out.println("El tipo de nave es: " + naveTripuladaClase.getTipoNave());
					System.out.println("El tamaño es: " + naveTripulada.getTamaño());
					System.out.println("La velocidad es: " + naveTripulada.getVelocidad());
					System.out.println("La capacidad de la tripulación es: " + naveTripuladaClase.getCapacidadTripulacion());
					naveTripuladaClase.destino();
					System.out.println(naveTripulada.getFuncion());
					System.out.println("El tipo de combustible es: " + naveTripulada.getTipoCombustible());
					naveTripulada.despegar();
					
					datosTripulada.orbitar();
					break;
				/**
				 * Case 2 para creación de naves tipo no tripuladas.
				 * Se instancia la clase abstracta madre para implementar sus metodos.
				 * Se instancia la clase hija para acceder a sus variables unicas.
				 */
				case 2:
					NaveEspacial naveNoTripulada = new NaveNoTripulada();
					NaveNoTripulada naveNoTripuladaClase = new NaveNoTripulada();
					
					System.out.println("Escriba el tipo de carga que llevara la nave.");
					naveNoTripuladaClase.setTipoCarga(inpTipoCarga.nextLine());
					System.out.println("Escriba el tamaño de la nave: GRANDE/MEDIANO/PEQUEÑO.");
					naveNoTripulada.setTamaño(inpTamaño.nextLine());
					System.out.println("Escriba la velocidad en Km/h de la nave.");
					naveNoTripulada.setVelocidad(inpVelocidad.nextLine());
					System.out.println("Escriba el destino o funcionalidad de la nave.");
					naveNoTripulada.setFuncion(inpFuncion.nextLine());
					System.out.println("Escriba el tipo de combustible que consume la nave.");
					naveNoTripulada.setTipoCombustible(inpTipoCombustible.nextLine());
					
					System.out.println("A continuación se mostrará el detalle de la nave creada por usted.");
					System.out.println("El tipo de nave es: " + naveNoTripuladaClase.getTipoNave());
					System.out.println("El tamaño es: " + naveNoTripulada.getTamaño());
					System.out.println("La velocidad es: " + naveNoTripulada.getVelocidad());
					naveNoTripuladaClase.destino();
					System.out.println(naveNoTripulada.getFuncion());
					System.out.println("El tipo de combustible es: " + naveNoTripulada.getTipoCombustible());
					naveNoTripulada.despegar();
					
					datosNoTripulada.orbitar();
					break;
				/**
				 * Case 3 para creación de naves lanzadera.
				 * Se instancia la clase abstracta madre para implementar sus metodos.
				 * Se instancia la clase hija para acceder a sus variables unicas.
				 */
				case 3:
					NaveEspacial naveLanzadera = new NaveLanzadera();
					NaveLanzadera naveLanzaderaClase = new NaveLanzadera();
					
					System.out.println("Escriba el tipo de propulsion que tendra la nave.");
					naveLanzaderaClase.setTipoPropulsion(inpTipoPrpopulsion.nextLine());
					System.out.println("Escriba la capacidad de carga que tendra la nave.");
					naveLanzaderaClase.setCapacidadCarga(inpCapacidadCarga.nextDouble());
					System.out.println("Escriba el tamaño de la nave: GRANDE/MEDIANO/PEQUEÑO.");
					naveLanzadera.setTamaño(inpTamaño.nextLine());
					System.out.println("Escriba la velocidad en Km/h de la nave.");
					naveLanzadera.setVelocidad(inpVelocidad.nextLine());
					System.out.println("Escriba el destino o funcionalidad de la nave.");
					naveLanzadera.setFuncion(inpFuncion.nextLine());
					System.out.println("Escriba el tipo de combustible que consume la nave.");
					naveLanzadera.setTipoCombustible(inpTipoCombustible.nextLine());
					
					System.out.println("A continuación se mostrará el detalle de la nave creada por usted.");
					System.out.println("El tipo de nave es: " + naveLanzaderaClase.getTipoNave());
					System.out.println("El tamaño es: " + naveLanzadera.getTamaño());
					System.out.println("La velocidad es: " + naveLanzadera.getVelocidad());
					naveLanzaderaClase.destino();
					System.out.println(naveLanzadera.getFuncion());					
					System.out.println("El tipo de propulsion es: " + naveLanzaderaClase.getTipoPropulsion());
					System.out.println("La capacidad de carga es de: " + naveLanzaderaClase.getCapacidadCarga() + " toneladas");
					System.out.println("El tipo de combustible es: " + naveLanzadera.getTipoCombustible());
					naveLanzadera.despegar();
					
					datosLanzadera.orbitar();
					break;
				/**
				 * Case 4 para creación de naves tipo interplanetarias.
				 * Se instancia la clase abstracta madre para implementar sus metodos.
				 * Se instancia la clase hija para acceder a sus varibles unicas.
				 */
				case 4:
					NaveEspacial naveInterplanetaria = new NaveInterplanetaria();
					NaveInterplanetaria naveInterplanetariaClase = new NaveInterplanetaria();
					
					System.out.println("Escriba la duración que tendra el viaje.");
					naveInterplanetariaClase.setDuracionViaje(inpDuracionViaje.nextDouble());
					System.out.println("Escriba el tamaño de la nave: GRANDE/MEDIANO/PEQUEÑO.");
					naveInterplanetaria.setTamaño(inpTamaño.nextLine());
					System.out.println("Escriba la velocidad en Km/h de la nave.");
					naveInterplanetaria.setVelocidad(inpVelocidad.nextLine());
					System.out.println("Escriba el destino o funcionalidad de la nave.");
					naveInterplanetaria.setFuncion(inpFuncion.nextLine());
					System.out.println("Escriba el tipo de combustible que consume la nave.");
					naveInterplanetaria.setTipoCombustible(inpTipoCombustible.nextLine());
					
					System.out.println("A continuación se mostrará el detalle de la nave creada por usted.");
					System.out.println("El tipo de nave es: " + naveInterplanetariaClase.getTipoNave());
					System.out.println("El tamaño es: " + naveInterplanetaria.getTamaño());
					System.out.println("La velocidad es: " + naveInterplanetaria.getVelocidad());
					naveInterplanetariaClase.destino();
					System.out.println(naveInterplanetaria.getFuncion());
					System.out.println("La duración del viaje sera de " + naveInterplanetariaClase.getDuracionViaje());
					System.out.println("El tipo de combustible es: " + naveInterplanetaria.getTipoCombustible());
					naveInterplanetaria.despegar();
					
					datosInterplanetaria.orbitar();
					break;
				/**
				 *Si, no se selecciona ninguna de las opciones anteriores imprime un mensaje default 
				 */
				default:
					System.out.println("El valor ingresado no es un valor válido");
			        break;
				}
			}else if(opcion == 0 || opcion == 2) {
				System.out.println("Gracias por utilizar nuestro sistema de creación de naves espaciales.");
			}
			System.out.println();
			/**
			 * Si la opción es 0 se cierra el ciclo por completo.
			 */
		}while(opcion != 0);
			
	}
}
