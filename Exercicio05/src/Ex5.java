import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("Digite o valor da compra: ");
	double valor = leitor.nextDouble();
	
	System.out.println("Valor das 5 prestações: " + (valor/5));
	
	
	leitor.close();
	
	
	}
	
}
