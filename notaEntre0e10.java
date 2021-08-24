import java.util.Scanner;

public class NotaEntre0e10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite uma nota ente 0 e 10: ");
		int nota = entrada.nextInt();
		
		while (nota < 0 || nota > 10) {
			System.out.println("Valor inválido, digite outro valor.");
			System.out.println("Digite uma nota ente 0 e 10: ");
			nota = entrada.nextInt();
		}
		
		if (nota >= 0 && nota <= 10) {
			System.out.println("A nota digitada foi: " + nota);
		}
	}	
} 
