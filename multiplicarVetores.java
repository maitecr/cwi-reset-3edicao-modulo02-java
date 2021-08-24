import java.util.Scanner;

public class multiplicarVetores {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int[] primeiroVetor = new int[5];
		int[] segundoVetor = new int[5];
		
		for (int i = 0; i <= primeiroVetor.length - 1; i++) {
			System.out.println("Digita o " + (i+1) + "º valor: ");
			primeiroVetor[i] = entrada.nextInt();
		}
		
		for (int i = 0; i <= segundoVetor.length - 1; i++) {
			segundoVetor[i] = primeiroVetor[i] * 2;
		}
		
		System.out.println("Os valores do primeiro vetor são: ");
		for (int i = 0; i <= primeiroVetor.length - 1; i++) {
		System.out.println(primeiroVetor[i]);
		} 
		
		System.out.println("Os valores do segundo vetor são: ");
		for (int i = 0; i <= segundoVetor.length - 1; i++) {
		System.out.println(segundoVetor[i]);
		}

	}
	
}
