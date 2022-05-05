import java.util.Scanner;
public class Ejercicio6Clase7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = 3;
		int b = 4;
		int matrizX[][] = new int[a][b];
		int matrizJ[][] = new int[a][b];
		int matrizSuma[][] = new int [a][b];	
		for (int i=0; i < matrizX.length; i++) {
			for (int j=0; j < matrizX.length; j++) {
				System.out.print("Ingrese el valor en posición  [" + i + "][" + j + "] de la matriz X: ");
				matrizX[i][j] = scanner.nextInt();
			}
		}
		System.out.println();
		System.out.println("-------------------------------------------------");
		for (int i=0; i < matrizJ.length; i++) {
			for (int j=0; j < matrizJ.length; j++) {
				System.out.print("Ingrese el valor en posición  [" + i + "][" + j + "] de la matriz J: ");
				matrizJ[i][j] = scanner.nextInt();
			}
		}
		System.out.println();
		System.out.println("-------------------------------------------------");		
		System.out.print("MATRIZ X");
		System.out.println();
		for (int i=0; i < matrizX.length; i++) {
			for (int j=0; j < matrizX.length; j++) {
				System.out.print(matrizX[i][j]);			
			}
			System.out.println("");		
		}
		System.out.println();
		System.out.println("-------------------------------------------------");	
		System.out.print("MATRIZ J");
		System.out.println();
		for (int i=0; i < matrizJ.length; i++) {
			for (int j=0; j < matrizJ.length; j++) {
				System.out.print(matrizJ[i][j]);			
			}
			System.out.println("");	
		}
		System.out.println();
		System.out.println("-------------------------------------------------");	
		for (int i=0; i < matrizX.length; i++) {
			for (int j=0; j < matrizJ.length; j++) {
				matrizSuma[i][j] = matrizX[i][j] + matrizJ[i][j];
			}
		}
		System.out.print("SUMA DE AMBAS MATRICES COMPONENTE A COMPONENTE");
		System.out.println();
		for (int i=0; i < matrizSuma.length; i++) {
			for (int j=0; j < matrizSuma.length; j++) {
				System.out.print(matrizSuma[i][j]);
			}
			System.out.println("");
		}	
	}

}
