import java.util.*;
public class Ejercicio2Clase7 {

	public static void main(String[] args) {
		int k=5;
		float arrayZ[] = new float[k];
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i=0; i<arrayZ.length; i++) {
			System.out.print("Ingrese el valor de la posición [" + i + "]: ");
			arrayZ[i] = scanner.nextFloat();
		}
		float acum =0;
		for (int i=0; i<arrayZ.length; i++) {
			acum = acum + arrayZ[i];
		}
		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println();
		System.out.println("Valores del array Z: ");
		System.out.println();
		for (int i=0; i<arrayZ.length; i++) {
			System.out.println(arrayZ[i]);
			
		}
		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println();
		System.out.print("La suma de todos los valores del array Z es: " + acum);


	}

}
