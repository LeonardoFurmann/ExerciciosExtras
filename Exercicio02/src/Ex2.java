import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a dist�ncia percorrida pelo autom�vel(em Km)"
				+ ": ");
		double d = leitor.nextDouble();
		
		System.out.println("Digite o combust�vel gasto pelo autom�vel(em Litros): ");
		double c = leitor.nextDouble();
		
		
		System.out.println("\n\nConsumo m�dio de combust�vel: " + d/c);
		
		leitor.close();
		
	}
}
