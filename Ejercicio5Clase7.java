
public class Ejercicio5Clase7 {
	public static void main(String[] args) {
		int m = 4;
		int matrizR[][] = new int[m][m];
		for (int i=0; i < matrizR.length; i++) {	
			for (int j=0; j < matrizR.length; j++) {				
				if (i==j){					
					matrizR[i][j] = 1;	
				}else{					
						matrizR[i][j] = 0;	
				}
			}
		}
		for (int i=0; i < matrizR.length; i++) {				
			for (int j=0; j < matrizR.length; j++) {					
				System.out.print(matrizR[i][j]);				
			}
			System.out.println("");				
		}
	}
}


