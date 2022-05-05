import java.util.Scanner;

public class Ejercicio3Clase7 {

	public static void main(String[] args) {
		int g=8;
		char vectorA[] = new char[g];
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i=0; i < vectorA.length; i++) {
			System.out.print("Ingrese el caracter de la posición [" + (i+1) + "]: ");
			vectorA[i] = scanner.next().charAt(0);
		}
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println();
		System.out.println("Los caracteres introducidos son: ");
		
		for (int i=0; i < vectorA.length; i++) {
			System.out.println(vectorA[i]);
			
		}
		

	}

}
