import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("Digite o valor em dolar: ");
		double dolar = leitor.nextDouble();
		System.out.println("Digite a cotação do dolar: ");
		double cot = leitor.nextDouble();
		
		System.out.println("\nValor convertido: " + (dolar*cot) + "R$");
		
		leitor.close();
	}

}
