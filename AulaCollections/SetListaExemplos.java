import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetListaExemplos {

	public static void main(String[] args) {
		
		Set<Double> notasAlunos = new HashSet<>();

		notasAlunos.add(6.3);
		notasAlunos.add(7.2);
		notasAlunos.add(8.1);
		notasAlunos.add(2.7);
		notasAlunos.add(9.8);
		notasAlunos.add(5.9);
		notasAlunos.add(4.6);

		System.out.println("\n Tamanho do set: " + notasAlunos.size() + "\n");

		System.out.println("Notas dos Alunos: " + notasAlunos + "\n");

		notasAlunos.remove(5.9);

		for (Double nota: notasAlunos ) {
			
			System.out.println("Nota==> " + nota);
		} System.out.println("\n");

		System.out.println(notasAlunos);
		System.out.println("Metodos HashSet = os mesmos dos anteriores, porém é mais performático, mas não ordena. \n");
	}
}

