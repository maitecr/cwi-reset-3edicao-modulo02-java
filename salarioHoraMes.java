public class salarioHoraMes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor da hora de trabalho:");
		double horaTrab = entrada.nextDouble();
		
		System.out.println("Digite a quantidade de horas trabalhadas no mês:");
		double horaMes = entrada.nextDouble();
		
		double salarioMes = horaTrab * horaMes;
		
		System.out.println("O salário desse mês será de R$" + salarioMes);

	}

}
