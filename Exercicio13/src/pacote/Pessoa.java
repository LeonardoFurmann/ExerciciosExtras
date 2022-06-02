package pacote;

import java.util.Scanner;

public class Pessoa {

	String nome;
	String genero;
	int idade;
	String saude;
	boolean verificacao;
	
	Scanner leitorDoObjeto = new Scanner(System.in);
	
	 String getNome() {
		
		System.out.print("\nDigite o nome da pessoa: ");
		nome = this.leitorDoObjeto.nextLine();
		
		return nome;
	}

	 String getGenero() {
		
		System.out.print("Digite o g�nero da pessoa(Masculino ou Feminino): ");
		genero  = this.leitorDoObjeto.nextLine();
		
		return genero;
	}

	 int getIdade() {
		
		System.out.print("Digite a idade da pessoa: ");
		idade = this.leitorDoObjeto.nextInt();
		this.leitorDoObjeto.nextLine();
		
		return idade;
	}

	 String getSaude() {
		
		System.out.print("Digite o estado de sa�de da pessoa(Saud�vel ou Doente): ");
		saude = this.leitorDoObjeto.nextLine();
		
		return saude;
	}

	void  setPessoa(Pessoa novaPessoa) {
		
		boolean ver, verIdade, verGenero = false, verSaude = false;
		
		
		verIdade = (idade >= 18) ?  true : false;
		
		if(genero.equalsIgnoreCase("masculino")){
			verGenero = true;
		} else if(genero.equalsIgnoreCase("feminino")) {
			verGenero = false;
		} else {
			Invalido();
			getGenero();
		}
		
		
		if(saude.equalsIgnoreCase("saudavel")) {
			verSaude = true;
		} else if(saude.equalsIgnoreCase("doente")) {
			verSaude = false;
		} else {
			Invalido();
			getSaude();
		}
		
		if(verGenero && verIdade && verSaude) {
			ver = true;
		} else {
			ver = false;
		}
		
		this.verificacao = ver;
	}

	public boolean getVerificacao() {
		boolean ver = this.verificacao;
		return ver;
	}
	
	void Invalido () {
		System.out.println("\nDado inv�lido, digite novamente: \n");
	}
	
	
	
	
}
