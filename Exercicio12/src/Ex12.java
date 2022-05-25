import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		boolean resposta = true;

		double precoTotal = 0;
		double Novopreco;
		int carrosAte2000 = 0;

		while (resposta == true) {

			System.out.print("\nDigite o ano do veículo: ");
			int ano = leitor.nextInt();
			System.out.print("Digite o preço do veículo: ");
			double preco = leitor.nextDouble();
			leitor.nextLine();

			if (ano > 2000) {
				double descontoAcima2000 = (preco * 7) / 100;
				
				System.out.println("\nDesconto aplicado: " + descontoAcima2000);
				
				 Novopreco = preco - descontoAcima2000;
				
				System.out.println("Novo valor a ser pago: " + Novopreco);
				precoTotal += Novopreco;

			} else if (ano <= 2000) {
				 double descontoAte2000 = (preco * 12) / 100;
				
				 System.out.println("\nDesconto aplicado: " + descontoAte2000);
				 
				 Novopreco = preco - descontoAte2000;
				
				System.out.println("Novo valor a ser pago: " + Novopreco);
				precoTotal += Novopreco;
				
				carrosAte2000 ++;
			}

			System.out.println("\nDeseja continuar calculando? ");
			String ver = leitor.nextLine();
			
			if(ver.equalsIgnoreCase("sim")) {
				resposta = true;
			}else if(ver.equalsIgnoreCase("não") || ver.equalsIgnoreCase("nao")){
				resposta = false;
			}
		}
		
		System.out.println();
		System.out.println("Total de carros com ano até 200: " + carrosAte2000);
		System.out.println("Valor total a ser pago: " + precoTotal);

		leitor.close();

	}

}
