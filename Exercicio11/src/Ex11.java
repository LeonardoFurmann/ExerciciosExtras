import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int n = 2;
		String[] nomes = new String[n];
		String[] sexos = new String[n];

		int i = 0;
		int h =0, m =0;
			
			
		do {
			
			System.out.print("\nDigite um nome: ");
			nomes[i] = leitor.nextLine();
			
			System.out.print("Digite o sexo da pessoa: ");
			sexos[i] = leitor.nextLine();
			
			
//			switch(sexos[i]) {
//				case "masculino":
//					System.out.println("Nome: " + nomes[i]);
//					System.out.println("Homem");
//					h++;
//					i++;
//				break;
//				case "feminino":
//					System.out.println("Nome: " + nomes[i]);
//					System.out.println("Mulher");
//					m++;
//					i++;
//				break;
//				default:
//					break;
//			}
			
			
			if(sexos[i].equalsIgnoreCase("masculino")) {
				System.out.println("\nNome: " + nomes[i]);
				System.out.println("Homem");
				h++;
				i++;
			} else if(sexos[i].equalsIgnoreCase("feminino")){
				System.out.println("Nome: " + nomes[i]);
				System.out.println("Mulher");				
				m++;
				i++;
			}else {
				System.out.println("Erro, digite novamente.");
			}
			
			
		}while(i<n);
		
		System.out.println("\n\nQuantidade de homens: " + h);
		System.out.println("Quantidade de mulheres: " + m);
		
		leitor.close();
	}

}
