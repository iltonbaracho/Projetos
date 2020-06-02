import java.util.Scanner;

public class InstanciaCarro extends Carro {

	public static void main(String[] args) {

		String sairLoop = "S";

		// Instanciando o novo carro e atribuindo o nome digitado:
			Carro palio = new Carro("GM", "Vectra", 2001);
			
		while(sairLoop.equals("S")) {

			System.out.println("Entrou no While.\n");
			System.out.println(palio.getMarca() + palio.getModelo() + palio.getAno());
					
			// Inserindo marca do carro. Lendo Teclado e usando método setter.
			System.out.print("Qual a marca do Carro ? Digite: ");
			Scanner tecladoMarca = new Scanner(System.in);
			palio.setMarca (tecladoMarca.nextLine());

			// Inserindo quantidade de Lugares no carro. Lendo Teclado e usando método se
			System.out.print("Quantos lugares tem no Carro ? Digite: ");

			Scanner tecladoLugares = new Scanner(System.in);

			palio.setLugares (tecladoLugares.nextInt());
					
			// Utilizando metodos Getters e Setters da Classe Carro

			System.out.println("A marca do seu carro: " + palio.getMarca() + "\n");
			System.out.println("O seu carro tem: " + palio.getLugares() + " lugares \n");
			System.out.println("Imprimindo ! \n");

		// Verifica se user vai querer continuar no programa.
		System.out.print("Quer continuar no programa. Digite S para Sim: [Enter para sair]: ");
		Scanner tecadoSair = new Scanner(System.in);
		sairLoop = tecadoSair.nextLine();
		sairLoop = sairLoop.toUpperCase();
		} 

		System.out.println("\n \n");
		System.out.println(palio.carroAcelera());
		System.out.println("\n \n");

		}
	}