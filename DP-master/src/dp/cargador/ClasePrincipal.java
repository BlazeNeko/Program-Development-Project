package dp.cargador;

/**
 * Clase creada para ser usada en la utilidad cargador
 * contiene el main del cargador. Se crea una instancia de la clase Cargador
 * y se procesa el fichero de inicio, es decir, se leen todas las líneas y se van creando todas las instancias de la simulación
 * 
 * @version 4.0 -  15/10/2014 
 * @author Profesores DP
 */
import java.io.FileNotFoundException;
import java.io.IOException;

public class ClasePrincipal {
	public static void main(String[] args) {
		/**
		 * instancia asociada al fichero de entrada inicio.txt
		 */
		Cargador cargador = new Cargador();
		try {
			/**
			 * Método que procesa línea a línea el fichero de entrada
			 * inicio.txt
			 */
			String nombreFichero = "init10x6_h4.txt";
			FicheroCarga.procesarFichero(nombreFichero, cargador);

			FicheroCarga.writeFile(nombreFichero);
		} catch (FileNotFoundException valor) {
			System.err.println("FILE NOT FOUND: " + valor.getMessage());
		} catch (IOException valor) {
			System.err.println("Error processing the file: " + valor.getMessage());
		}
	}
}
