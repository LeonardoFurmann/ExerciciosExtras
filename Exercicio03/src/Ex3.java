import java.util.Scanner;


public class Ex3 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o nome do vendedor: ");
		String nome= leitor.nextLine();
		
		System.out.println("Digite o sálario fixo do vendedor: ");
		double sal = leitor.nextDouble();
		
		System.out.println("Digite a quantidade de vendas efetuadas pelo vendedeor: ");
		int vendas = leitor.nextInt();
		
		
		System.out.println("\n\nNome do vendedor: " + nome);
		System.out.println("Salário fixo: " + sal);
		System.out.println("Sálario final: " + (sal+((sal * (15 * vendas))/100)));
		
		
		
		
		
		
		
	}

}
