
public class Funcionario {
	
	String nome;
	double salario;
	int idade;
	String genero;
	
	public double Reajustar(int reajuste) {

		double novoSalario = salario + (salario * reajuste / 100);

		return novoSalario;
	}
}
