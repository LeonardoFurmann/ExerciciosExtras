import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		
		System.out.print("Quantos produtos deseja verificar?");
		int n = leitor.nextInt();
		
		Produto[] produtos = new Produto[n]; 
		
		for (int i = 0; i < produtos.length; i++) {
			
			Produto novoProduto = new Produto();
			
			novoProduto.getNome();
			novoProduto.getPrecoCusto();
			novoProduto.getPrecoVenda();
			
			novoProduto.situacao = novoProduto.verificacao();
			
			produtos[i] = novoProduto;
		}
		
		for (int i = 0; i < produtos.length; i++) {
			
			Produto p = produtos[i];
			
			p.apresentacao();
	}
		
	
		leitor.close();
		


	}

}
