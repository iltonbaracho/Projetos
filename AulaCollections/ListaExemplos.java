import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class ListaExemplos {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();

		nomes.add("Ilton");
		nomes.add("Marcos");
		nomes.add("João");
		nomes.add("Maria");
		nomes.add("Luciano");
		nomes.add("Altair");


		System.out.println("\n Nomes conforme inseridos: \n" + nomes + "\n");

		Collections.sort(nomes);

		System.out.println(nomes + "\n");

		nomes.set(5, "Teste");
		System.out.println(nomes + "\n");

		nomes.remove("Teste");

		boolean temIlton = nomes.contains("Ilton");
		System.out.println(temIlton);

		int tamanhoLista = nomes.size();
		System.out.println(tamanhoLista + "\n");

		for (String nomeDoItem: nomes){

			System.out.println("====>" + nomeDoItem + "\n");
		}

		Iterator<String> iterador = nomes.iterator();
		
		while (iterador.hasNext()) {

			System.out.println("===>" + iterador.next());
		}

	}


}