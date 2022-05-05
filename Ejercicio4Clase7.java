import java.util.Scanner;

public class Ejercicio4Clase7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el tamaño de los vectores: ");
		int tamanio = scanner.nextInt();
		System.out.println("");
		System.out.println("-----------------------------------------------------------");
		System.out.println("");
		int vectorA[] = new int[tamanio];
		int vectorB[] = new int[tamanio];
		int vectorC[] = new int[tamanio];
		for (int i=0; i < vectorA.length; i++) {
			System.out.print("Ingrese el valor en posición  [" + i + "] del vector A: ");
			vectorA[i] = scanner.nextInt();
		}
		for (int i=0; i < vectorB.length; i++) {
			System.out.print("Ingrese el valor en posición  [" + i + "] del vector B: ");
			vectorB[i] = scanner.nextInt();
		}
		for (int i=0; i < vectorA.length; i++) {
			for (int j=0; j < vectorB.length; j++) {	
				vectorC[i]= vectorA[i]* vectorB[i];	
			}
		}
		System.out.println("");
		System.out.println("-----------------------------------------------------------");
		System.out.println("");
		System.out.println("Valores del vector A ingresados por teclado");
		for (int i=0; i < vectorA.length; i++) {
			System.out.println(vectorA[i]);
			
		}
		System.out.println("");
		System.out.println("-----------------------------------------------------------");
		System.out.println("");
		System.out.println("Valores del vector B ingresados por teclado");
		for (int i=0; i < vectorB.length; i++) {
			System.out.println(vectorB[i]);
		}
		System.out.println("");
		System.out.println("-----------------------------------------------------------");
		System.out.println("");
		System.out.println("Resultado de multiplicar cada valor de cada vector:");
		for (int i=0; i < vectorC.length; i++) {
				System.out.println(vectorC[i]);	
			}
	}	
}



