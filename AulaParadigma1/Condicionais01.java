import java.util.Scanner;

public class Condicionais1 {
	public static void main(String[] args) {
		
		//final var condicao = false;

		System.out.println("Digite a condição: ");

		Scanner teclado = new Scanner(System.in);
		var condicao = teclado.nextLine().boolean;

		System.out.println(condicao);

		if (condicao) {
			System.out.println ("A condição é verdadeira");
		} 
			else {

				System.out.println("A condição é falsa");	
		}

		if (condicao){
			System.out.println("Um unica linha ....");
		}

		final var ternario = condicao ? "É verdadeiro" : "É Falsa.";

		System.out.println(ternario);

	}
}