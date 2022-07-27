import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		
		System.out.print("Digite três numeros inteiros: ");
		int a = leitor.nextInt();
		int b = leitor.nextInt();
		int c = leitor.nextInt();
		
		if(a < (b + c) && b < (a + c) && c < (a + b)) {
			
			VerificarTriangulo(a, b ,c);
			
		} else {
			System.out.println("Não é um triângulo");
		}
		
		
	
		leitor.close();

	}

	private static void VerificarTriangulo(int a, int b, int c) {
		
		if(a == b && b == c && a == c) {
			System.out.println("Triângulo Equilátero ou Isóscele");
		} else if (a == b || b == c || a == c) {
			System.out.println("Triângulo Isóscele");
		} else {
			System.out.println("Triângulo Escaleno");
		}
		
		
	}	
		
}
