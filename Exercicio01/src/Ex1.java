import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double[] notas = new double[3];
		int i = 0; 
		double soma = 0;
		
		System.out.println("Escreva o nome do aluno: ");
		String nome = leitor.nextLine();
		
		
		while(i<3) {
			System.out.println("Informe a nota "+ (i+1) + " do aluno: ");
			notas[i] = leitor.nextDouble();
			
			soma = soma + notas[i];
			i++;
		}
		
		System.out.println("\n\nNome do aluno: " + nome);
		System.out.println("Média do aluno: "+ soma/3);
	
	
	leitor.close();
	}

}
