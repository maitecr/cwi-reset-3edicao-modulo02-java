import java.util.Scanner;

public class verificarMaiorNumDigitado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int maior = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite o " + i +"º valor:" );
			int num = entrada.nextInt();
			
			if (num > maior) {
				maior = num;
			}
		}
		
		System.out.println("O maior valor digitado foi: " + maior);
	}

}
