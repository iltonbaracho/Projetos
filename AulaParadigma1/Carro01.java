import java.util.Date;

public class Carro {

		public Carro() {

		}

		public Carro (String marca, String modelo, int ano ) {
			this.marca = marca;
			this.modelo = modelo;
			this.ano = ano;
		}

		private String marca ;

		private String modelo ;

		private String variante ;

		private int ano ;
	
		private int lugares ;

		public String getMarca() { return marca ; }

		public String getModelo() { return modelo ; }

		public String getVariante() { return variante ; }

		public int getAno() { return ano ; }

		public int getLugares() { return lugares ; }

		public String carroAcelera() {return "Carro acelerando... Foi embora... >>>>>>>> "; }

		public void setMarca(String novaMarca) { marca = novaMarca; }

		public void setLugares(int novoLugares) { lugares = novoLugares; }

		public void setModelo(String novaModelo) { modelo = novaModelo; }

		public void setVariante(String novaVariante) { modelo = novaVariante; }

		public void setAno(int novoAno) { ano = novoAno; }

}