import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a distância percorrida pelo automóvel(em Km)"
				+ ": ");
		double d = leitor.nextDouble();
		
		System.out.println("Digite o combustível gasto pelo automóvel(em Litros): ");
		double c = leitor.nextDouble();
		
		
		System.out.println("\n\nConsumo médio de combustível: " + d/c);
		
		leitor.close();
		
	}
}
