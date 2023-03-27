package Sim;

public class Chiamata {

		private String numeroChiamato;
		private int durataMinuti;
		
		
		public Chiamata(String numChiamato, int durata) {
			this.numeroChiamato = numChiamato;
			this.durataMinuti = durata;
		}
		
		
		public String getNumeroChiamato() {
			return numeroChiamato;
		}
		public void setNumeroChiamato(String nc) {
			this.numeroChiamato = nc;
		}
		public int getDurataMinuti() {
			return durataMinuti;
		}
		public void setDurataMinuti(int dm) {
			this.durataMinuti = dm;
		}
		
		
	}


