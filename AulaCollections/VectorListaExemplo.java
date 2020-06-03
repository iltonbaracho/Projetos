import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;
import java.util.Iterator;

public class VectorListaExemplo {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();

		nomes.add("Juliana");
		nomes.add("Pedro");
		nomes.add("Carlos");
		nomes.add("Larissa");
		nomes.add("João	");

		System.out.println("Nomes= " + nomes + "\n");

		int posicaoMudar = nomes.indexOf("Carlos");

		nomes.set(posicaoMudar, "Roberto" );
		System.out.println(nomes + "\n");

		System.out.println("Posicção 1= " + nomes.get(1) + "\n");

		nomes.remove(4);
		nomes.remove("João");

		int qtdItensLista = nomes.size();
		System.out.println("Quantidade Itens na Lista = " + qtdItensLista);

		nomes.clear();

		nomes.contains("Juliano" + "\n");

		System.out.println(nomes);

		List<String> novosNomes = new ArrayList<>();

		novosNomes.add("Ismael");
		novosNomes.add("Rodrigo");

		System.out.println("Nomes= " + nomes);
		System.out.println("Novos nomes= " + novosNomes);
		System.out.println("Vai vir o For!");

		int cont = 0;
		for (String itensDeNomes: novosNomes){

			nomes.add(itensDeNomes);
			
			System.out.println("Cont = " + cont);
			System.out.println("Cont + 1 = " + cont + 1);
			//cont = cont + 1;
			cont ++;
			System.out.println("===> " + itensDeNomes);
		}

/*
		// Inserção de novos nomes na lista nomes a partir da lista novosNomes
		com o objeto iterador, instanciado da Classe Iterador e método iterator. 

		Iterator<String> iterador = novosNomes.iterator();

		while (iterador.hasNext()) {
			nomes.add(iterador.next());
		}
*/
		System.out.println("Nomes= " + nomes +"\n");
		System.out.println("Novos Nomes= " + novosNomes +"\n");

		// Criando lista com Vector

		List<String> vetorAnimais = new Vector<>();

		vetorAnimais.add("Cachorro");
		vetorAnimais.add("Gato");
		vetorAnimais.add("Papagaio");
		System.out.println( "Animais 1 = " + vetorAnimais);

		vetorAnimais.set(2, "Cobra");
		System.out.println( "Animais 2 = " + vetorAnimais);

		vetorAnimais.add("Papagaio");
		vetorAnimais.add("Galinha");

		System.out.println( "Animais 3 = " + vetorAnimais);
		qtdItensLista = vetorAnimais.size();
		System.out.println( "Quantidade Itens na Lista = " + qtdItensLista);

		vetorAnimais.add("Pato");
		vetorAnimais.add("Cavalo");

		System.out.println( "Animais 4 = " + vetorAnimais);
		qtdItensLista = vetorAnimais.size();
		System.out.println( "Quantidade Itens na Lista = " + qtdItensLista);
		Collections.sort(vetorAnimais);
		System.out.println(vetorAnimais);

	}
}