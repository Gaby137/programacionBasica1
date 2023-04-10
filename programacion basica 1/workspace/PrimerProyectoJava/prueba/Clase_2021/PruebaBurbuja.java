package Clase_2021;

public class PruebaBurbuja {

	public static void main(String[] args) {
		int[] vec = {7, 30, 35, 3, 1};
		imprimirElVector(vec);
		
		int may= busquedaDelMayor(vec);
		int men= busquedaDelMenor(vec);
		System.out.println("\nEl menor es:"+men);
		System.out.println("\nEl mayor es:"+may);
		ordenarVec(vec);
		imprimirElVector(vec);
	}
	
	public static int busquedaDelMenor(int[] vec) {
		int menor= vec[0];
		
		for (int i = 0; i < vec.length; i++) {
			if (vec[i]<menor) {
				menor=vec[i];
			} else {
				
			}
		}
		return menor;
	}
	
	public static int busquedaDelMayor(int[] vec) {
		int mayor= vec[0];
		
		for (int i = 0; i < vec.length; i++) {
			if (vec[i]>mayor) {
				mayor=vec[i];
			} else {

			}
		}
		return mayor;
	}
	
	public static void ordenarVec(int[] A) {
		 int i, j, aux;
	        for (i = 0; i < A.length - 1; i++) {
	            for (j = 0; j < A.length - i - 1; j++) {
	                if (A[j + 1] < A[j]) {
	                    aux = A[j + 1];
	                    A[j + 1] = A[j];
	                    A[j] = aux;
				}
			}
			
		}
	}
	
	
	public static void imprimirElVector(int[] vec) {
		for (int i = 0; i < vec.length; i++) {
			System.out.print(vec[i]+" ");
		}
	}

}
