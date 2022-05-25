package pacote;

import java.util.Scanner;

public class Pessoa {

	String nome;
	String genero;
	int idade;
	String saude;
	boolean verificacao;
	
	Scanner leitorDoObjeto = new Scanner(System.in);
	
	public String getNome() {
		
		System.out.print("\nDigite o nome da pessoa: ");
		nome = this.leitorDoObjeto.nextLine();
		
		return nome;
	}

	public String getGenero() {
		
		System.out.print("Digite o gênero da pessoa(Masculino ou Feminino): ");
		genero  = this.leitorDoObjeto.nextLine();
		
		return genero;
	}

	public int getIdade() {
		
		System.out.print("Digite a idade da pessoa: ");
		idade = this.leitorDoObjeto.nextInt();
		this.leitorDoObjeto.nextLine();
		
		return idade;
	}

	public String getSaude() {
		
		System.out.print("Digite o estado de saúde da pessoa(Saldável ou Doente): ");
		saude = this.leitorDoObjeto.nextLine();
		
		return saude;
	}

	public void  setPessoa(Pessoa novaPessoa) {
		
		boolean ver, verIdade, verGenero = false, verSaude = false;
		
		
		verIdade = (idade >= 18) ?  true : false;
		
		if(genero.equalsIgnoreCase("masculino")){
			verGenero = true;
		} else if(genero.equalsIgnoreCase("feminino")) {
			verGenero = false;
		} else {
		System.out.println("\nDado inválido, digite novamente\n");
			getGenero();
		}
		
		
		if(saude.equalsIgnoreCase("saudavel")) {
			verSaude = true;
		} else if(saude.equalsIgnoreCase("doente")) {
			verSaude = false;
		} else {
			System.out.println("\nDado inválido, digite novamente:\n");
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
	
	
	
	
	
	
}
