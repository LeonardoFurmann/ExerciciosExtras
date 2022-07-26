import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

		double salarioMinimo = 1212;

		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite o salário do funcionário: ");
		double salario = leitor.nextDouble();

		if (salario < (3 * salarioMinimo)) {
			System.out.println("Salário Reajustado:" + Reajustar(salario, 50));
			
		} else if (salario > (3 * salarioMinimo) && salario < (10 * salarioMinimo)) {		
			System.out.println("Salário Reajustado:" + Reajustar(salario, 20));
			
		} else if (salario > (10 * salarioMinimo) && salario < (20 * salarioMinimo)) {		
			System.out.println("Salário Reajustado:" + Reajustar(salario, 20));
			
		} else {
			System.out.println("Salário Reajustado:" + Reajustar(salario, 10));
		}

		leitor.close();

	}

	private static double Reajustar(double salario, int ajuste) {

		double novoSalario = salario + (salario * ajuste / 100);

		return novoSalario;
	}

}
