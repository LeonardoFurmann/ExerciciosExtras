import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		double valor;
		double novoValor = 0;
		int op;
		
		Scanner leitor = new Scanner(System.in);

	
		do {
			System.out.println("Informe o valor do ve�culo: ");
			 valor = leitor.nextDouble();
			
			 System.out.println("\nInforme o combust�vel: \n");
				
				System.out.println("1 - �lcool");
				System.out.println("2 - Gasolina");
				System.out.println("3 - Diesel");
				System.out.println("Digite a op��o: ");
				op  = leitor.nextInt();
				
				switch(op) {
				case 1:
					novoValor = valor - (valor * 25) / 100;
				case 2:
					novoValor = valor - (valor * 21) / 100;
				case 3:
					novoValor = valor - (valor * 14) / 100;

				}
				
				System.out.println("Valor com desconto: " + novoValor);
				
		}while(valor != 0);
		
		
		
		

		leitor.close();
		

	}

}
