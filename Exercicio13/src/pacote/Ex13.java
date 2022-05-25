package pacote;

import java.util.Scanner;

public class Ex13 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Quantas pesssoas deseja verificar?");
		int n = leitor.nextInt();
		int apto = 0 , naoApto = 0;
		
		Pessoa[]  pessoa= new Pessoa[n]; 
		
		for (int i = 0; i < pessoa.length; i++) {
			
			Pessoa novaPessoa = new Pessoa();
			
			novaPessoa.nome = novaPessoa.getNome(); 
			novaPessoa.genero= novaPessoa.getGenero();
			novaPessoa.idade= novaPessoa.getIdade();
			novaPessoa.saude= novaPessoa.getSaude();
			
			novaPessoa.setPessoa(novaPessoa);
			 
			novaPessoa.verificacao = novaPessoa.getVerificacao(); 
			
			if(novaPessoa.verificacao == true) {
				apto++;
			} else {
				naoApto++;
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Total de pessoas aptas ao serviço militar: " + apto);
		System.out.println("Total de pessoas não aptas ao serviço militar: " + naoApto);
		
		

		leitor.close();
	}

	
}
