import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = entrada.nextInt();
		
		System.out.println("Tabuada do " + num);
		for (int i = 1; i <= 10; i++) {
			int res = num * i;
			System.out.println(num + " x " + i + " = " + res);			
		}

	}

}
