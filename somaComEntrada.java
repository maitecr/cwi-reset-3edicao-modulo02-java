
import java.util.Scanner;

public class somaComEntrada {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int n1 = entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		int n2 = entrada.nextInt();
		
		int soma = n1 + n2;
		
		System.out.println("A soma entre " + n1 + " e " + n2 + "é " + soma);

	}

}
