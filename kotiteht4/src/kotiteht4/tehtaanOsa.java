package kotiteht4;

public class tehtaanOsa extends osa {
	private double raakaAineYksHinta;
	private int tarvittavaAineMaara;
	
	
	public tehtaanOsa(String nimi, int maara, double raakaAineYksHinta, int tarvittavaAineMaara) {
		super(nimi, maara);
		this.raakaAineYksHinta = raakaAineYksHinta;
		this.tarvittavaAineMaara = tarvittavaAineMaara;
	}
	
	
	public double getRaakaAineYksHinta() {
		return raakaAineYksHinta;
	}
	public void setRaakaAineYksHinta(double raakaAineYksHinta) {
		this.raakaAineYksHinta = raakaAineYksHinta;
	}
	public int getTarvittavaAineMaara() {
		return tarvittavaAineMaara;
	}
	public void setTarvittavaAineMaara(int tarvittavaAineMaara) {
		this.tarvittavaAineMaara = tarvittavaAineMaara;
	}
	
	
	public double varastoarvo() {
		return this.raakaAineYksHinta * this.getMaara() * this.tarvittavaAineMaara;
	}


	@Override
	public String toString() {
		return "tehtaanOsa [raakaAineYksHinta = " + raakaAineYksHinta + ", tarvittavaAineMaara = " + tarvittavaAineMaara
				+ ", varastoarvo() = " + varastoarvo() + ", getNimi() = " + getNimi() + ", getMaara() = " + getMaara() + "]";
	}
	
}
