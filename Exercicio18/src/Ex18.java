import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		
		
		Scanner leitor = new Scanner(System.in);

		Funcionario funcionario = new Funcionario();
		
		System.out.print("Digite o nome do funcion�rio: ");
		funcionario.nome = leitor.nextLine();
		
		System.out.print("Digite a idade do funcion�rio: ");
		funcionario.idade = leitor.nextInt();
		
		leitor.nextLine();

		System.out.print("Digite o genero do funcion�rio: ");
		funcionario.genero = leitor.nextLine();
		
		
		System.out.print("Digite o sal�rio do funcion�rio: ");
		funcionario.salario = leitor.nextDouble();
		
		
		if(funcionario.genero.equalsIgnoreCase("masculino")) {
				if(funcionario.idade >= 30) {
					funcionario.salarioLiquido = funcionario.salario + 100;
				} else if (funcionario.idade <= 30){
					funcionario.salarioLiquido = funcionario.salario + 50;
				}
		} else if (funcionario.genero.equalsIgnoreCase("feminino")) {
				if(funcionario.idade >= 30) {
					funcionario.salarioLiquido = funcionario.salario + 200;
				} else if (funcionario.idade <= 30){
					funcionario.salarioLiquido = funcionario.salario + 80;
				}
		}		
				
		
		System.out.println("\n\nNome: " + funcionario.nome);
		System.out.println("Sal�rio Liqu�do: " + funcionario.salarioLiquido);
	

		leitor.close();
		
		
		
		
		
		
		
	}

}
