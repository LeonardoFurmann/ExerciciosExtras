import java.util.Scanner;


public class Ex6 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o preço de custo do produto: ");
		double preco = leitor.nextDouble();
		
		System.out.println("Digite a porcentagem de acréscimo: ");
		int per = leitor.nextInt();
		
		System.out.println("Valor de venda: " + (preco+(preco*per)/100));
		
		leitor.close();
	}
}
