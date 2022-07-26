import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		double valor;
		double novoValor = 0;
		int op;
		
		Scanner leitor = new Scanner(System.in);

	
		do {
			System.out.print("\nInforme o valor do veículo: ");
			 valor = leitor.nextDouble();
			
			 if(valor != 0) {
			 		System.out.println("\nInforme o combustível: \n");
				
			 		System.out.println("1 - Álcool");
					System.out.println("2 - Gasolina");
					System.out.println("3 - Diesel");
					System.out.print("\nDigite a opção: ");
					op  = leitor.nextInt();
					
					switch(op) {
					case 1:
						novoValor = valor - (valor * 25) / 100;
					case 2:
						novoValor = valor - (valor * 21) / 100;
					case 3:
						novoValor = valor - (valor * 14) / 100;
					
					}
					System.out.println("\nValor com desconto: " + novoValor);
				}
				
		}while(valor != 0);
		
	
		leitor.close();
		

	}

}
