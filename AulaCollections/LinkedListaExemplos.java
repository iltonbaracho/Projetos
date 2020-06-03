import java.util.LinkedList;
import java.util.Queue;

public class LinkedListaExemplos {

	public static void main(String[] args) {
		
		Queue<String> filaBancoNomesPessoas = new LinkedList<>();

		filaBancoNomesPessoas.add("João");
		filaBancoNomesPessoas.add("Maria");
		filaBancoNomesPessoas.add("Ilton");
		filaBancoNomesPessoas.add("Leonardo");
		filaBancoNomesPessoas.add("Juliana");

		System.out.println("Pessoas na fila: " + filaBancoNomesPessoas + "\n");

		System.out.println("Metodos Queue = poll - peek - element - Iterator -  ");
	}
}

