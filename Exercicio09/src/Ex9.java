import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int[] n = new int[80];
		int inter = 0;
		
	for (int i = 0; i < n.length; i++) {
		System.out.println("Digite um numero: ");
		n[i] =  leitor.nextInt();
		
		if(n[i] >= 10 && n[i] <= 150) {
		 inter ++;
		}
	}
		
		System.out.println("Quantidade de numeros entre 10 e 150: " + inter);
		
		leitor.close();
		
	}
}
