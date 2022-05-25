import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
	
		Scanner leitor = new Scanner(System.in);
		
		double[] notas = new double[3];
		int i =0;
		double soma=0;
		
		System.out.println("Digite o nome do aluno");
		String nome = leitor.nextLine();
		
		
	while(i<3){	
		System.out.println("Digite a nota "+ (i+1) + " do aluno: ");
		notas[i] = leitor.nextDouble();
		soma = soma + notas[i];
		i++;
		}
	
	double media= soma/3;
	
	
	System.out.println("Nome do aluno: " + nome);

	if(media>=5.1 && media<=6.9) {
		System.out.println("Em Recuperação");
		} 
	if(media >=7) {
		System.out.println("Aprovado");
		}  
	if(media <=5){
		System.out.println("Reprovado");
		}

	leitor.close();
	
	}

}
