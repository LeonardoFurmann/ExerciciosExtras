import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		double salario = 0;
		
		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite o nível do professor: ");
		int nivel = leitor.nextInt();
		
		System.out.print("Digite o valor horas/aula: ");
		int horas = leitor.nextInt();
		
		switch(nivel) {
		case 1:
			salario = 12 * horas;
		break;
		case 2:
			salario = 17 * horas;
			break;
		case 3:
			salario = 25 * horas;
		break;	
		}
		
		
		System.out.println("Salário: " + salario);
		
		leitor.close();
			
		
	}

}
