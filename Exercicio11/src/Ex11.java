import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		String[] nomes = new String[8];
		String[] sexos = new String[8];

		int i = 0;
		int h =0, m =0;
			
			
		do {
			
			System.out.println("Digite um nome: ");
			nomes[i] = leitor.nextLine();
			
			System.out.println("Digite o sexo da pessoa: ");
			sexos[i] = leitor.nextLine();
			
			switch(sexos[i]) {
				case "Masculino":
					System.out.println("Nome: " + nomes[i]);
					System.out.println("Homem");
					h++;
					i++;
				break;
				case "Feminino":
					System.out.println("Nome: " + nomes[i]);
					System.out.println("Mulher");
					m++;
					i++;
				break;
				default:
					break;
			}
			
		}while(i<8);
		
		System.out.println("\n\nQuantidade de homens: " + h);
		System.out.println("Quantidade de mulheres: " + m);
		
		leitor.close();
	}

}
