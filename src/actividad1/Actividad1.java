package actividad1;

import java.io.IOException;

public class Actividad1 {

	public static void main(String[] args) {
		
		try {
			Runtime.getRuntime().exec(args);
			
		} catch (IOException e) {
			System.err.println("ERROR: de Entrada/Salida al ejecutar el comando.");
			e.printStackTrace();
		}
	}
}
