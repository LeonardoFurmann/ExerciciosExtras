import java.util.Scanner;

public class Ex17 {
	
	public static void main(String[] args) {

		int reajuste;
		
		Scanner leitor = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Digite o nome do funcionário: ");
		funcionario.nome = leitor.nextLine();
		
		System.out.print("\nDigite o salário do funcionário: ");
		funcionario.salario = leitor.nextDouble();
		
		System.out.print("\nDigite a porcentagem de reajuste: ");
		reajuste = leitor.nextInt();
		
		System.out.println("Nome: " + funcionario.nome);
		System.out.println("Reajuste: " + reajuste + "%");
		System.out.println("Novo salário: " + funcionario.Reajustar(reajuste));
		
		leitor.close();
		
	}
}
