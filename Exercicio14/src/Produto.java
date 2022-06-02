import java.util.Scanner;

public class Produto {
	
	String nome;
	double precoCusto;
	double precoVenda;
	String situacao;
	
	Scanner leitorDoObjeto = new Scanner(System.in);
	
	  void getNome() {
		 System.out.print("\n\nDigite o nome do produto: ");
			this.nome = this.leitorDoObjeto.nextLine();
	}
	
	 void getPrecoCusto() {
		System.out.print("Digite o pre�o do custo: ");
		this.precoCusto = this.leitorDoObjeto.nextDouble();
	}
	
	 void getPrecoVenda() {
		System.out.print("Digite o pre�o da venda: ");
		this.precoVenda = this.leitorDoObjeto.nextDouble();
	}

	String verificacao() {
	
		String result;
		
		if (precoVenda > precoCusto) {
			 result = "Lucro";
		} else if (precoVenda == precoCusto) {
			result = "Empate";
		} else {
			 result = "Preju�zo";
		}
		
		return result;
	}

	 void apresentacao() {
		double media =  (precoCusto +  precoVenda)/2;
		
		System.out.println("\n\n -------------------------");
		System.out.println("\nNome do produto: " + nome);
		System.out.printf("M�dia dos pre�os: %.2f",  media);
		System.out.println();
		System.out.println("Situa��o dos pre�os: " + situacao);
		
		
		
	}
	
	
}
