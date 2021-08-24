import java.util.Scanner;

public class verificarLoopEntreNum {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int min = entrada.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int max = entrada.nextInt();
		
		if (max <= min) {
			System.out.println("Valor igual ou inferior ao primeiro número. Digite outro número: ");
			max = entrada.nextInt();
		}
		
		for (int i = min; i <= max; i++) {
			System.out.println(i);
		}
	}

}
