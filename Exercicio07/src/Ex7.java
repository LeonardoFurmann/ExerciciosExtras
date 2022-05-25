import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o custo de fábrica: ");
		double fabrica = leitor.nextDouble();
		
		
	double custo =	(fabrica * 28)/100;
	custo = (custo * 45)/100;
			
		System.out.println("Custo total: " + (custo + fabrica));	
		
		leitor.close();
	}

}
