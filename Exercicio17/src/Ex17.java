import java.util.Scanner;

public class Ex17 {
	
	public static void main(String[] args) {

		int reajuste;
		
		Scanner leitor = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Digite o nome do funcion�rio: ");
		funcionario.nome = leitor.nextLine();
		
		System.out.print("\nDigite o sal�rio do funcion�rio: ");
		funcionario.salario = leitor.nextDouble();
		
		System.out.print("\nDigite a porcentagem de reajuste: ");
		reajuste = leitor.nextInt();
		
		System.out.println("Nome: " + funcionario.nome);
		System.out.println("Reajuste: " + reajuste + "%");
		System.out.println("Novo sal�rio: " + funcionario.Reajustar(reajuste));
		
		leitor.close();
		
	}
}
