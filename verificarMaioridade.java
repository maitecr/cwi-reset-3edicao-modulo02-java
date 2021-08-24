import java.util.Scanner;

public class verificarQtdMaioridade {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] idades = new int[10];
		int somarMaioridade = 0;
		
    
    /*Num primeiro, momento preenchi o array para testar se o somatório estava sendo feito corretamente. 
    Ainda assim, quis deixar comentado a lista com os valores.
    Depois trouxe a classe para ser possível dar a entrada de valores.*/
		/*idades[0] = 12;
		idades[1] = 29;
		idades[2] = 23;
		idades[3] = 76;
		idades[4] = 9;
		idades[5] = 18;
		idades[6] = 17;
		idades[7] = 52;
		idades[8] = 39;
		idades[9] = 7; */
		
		for (int i = 0; i <= idades.length - 1; i++) {
			System.out.println("Digite a " + (i+1) + "º idade: " );
			idades[i] = entrada.nextInt();
		}
		
		for (int i = 0; i <= idades.length - 1; i++) {
			if (idades[i] >= 18) {
				somarMaioridade = somarMaioridade + 1;
			}
		}
		
		System.out.println("O total de pessoas na maioridade é " + somarMaioridade);

	}

}
