import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		int aux = 0;
		int i = 0;
		int x = 0;

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira o Comprimento do Vetor ");

		int tamanhoVetor = teclado.nextInt();
		

		int[] vet = new int[tamanhoVetor];

		System.out.println("Insira os Itens do Vetor ");
		for (x = 0; x < tamanhoVetor; x++) {
			vet[x] = teclado.nextInt();
		}

		System.out.println("Vetor Inicial: ");
		for (i = 0; i < vet.length; i++) {
			System.out.print(" " + vet[i]);
		}

		for (i = 0; i < vet.length; i++) {
			for (int j = 0 ; j < vet.length - 1 ; j++) {
				if (vet[j] < vet[j + 1]) {
					aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;

					System.out.println("\n " + vet[j+1] + " troca " + vet[j]);

					for (int e = 0; e < vet.length; e++) {
						System.out.print(" " + vet[e]);
					}
				}
			}
		}

		System.out.println("\n Vetor organizado:");
		for (int e = 0; e < vet.length; e++) {
			System.out.print(" " + vet[e]);
		}

	}

}
