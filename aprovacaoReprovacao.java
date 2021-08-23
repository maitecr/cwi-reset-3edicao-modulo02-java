import java.util.Scanner;

public class aprovacaoReprovacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		double nota3 = entrada.nextDouble();
		
		System.out.println("Digite a quarta nota: ");
		double nota4 = entrada.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("Sua média é " + media);
		
		if (media < 7) {
			System.out.println("Aluno reprovado!");
		} else if (media >= 7 && media <= 9.99) {
			System.out.println("Aluno aprovado!");
		} else {
			System.out.println("Aluno aprovado com louvores!");
		}

	}

}
