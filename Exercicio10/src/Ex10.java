import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int[] idades = new int[10];
		
		for (int i = 0; i < idades.length; i++) {
			
		System.out.println("Digite uma idade: ");
			idades[i] = leitor.nextInt();
			
		if(idades[i] >= 18 ) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}
		
			}
		
		leitor.close();
		
	}

}
