import java.text.SimpleDateFormat;
import java.util.Date;

// Exemplo de formatação de Data com SimpleDateFormat

public class FormatandoDatasComSimple {

public static void main(String[] args) {
	
	Date momentoAtual = new Date();

	SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/YYYY  hh:mm:ss:mmm");

	String dataFormatadaPadrao = formatadorData.format(momentoAtual);

	System.out.println(dataFormatadaPadrao);

}

}