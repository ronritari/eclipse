package harjoitus4;

public class Tilausrivi {
	private String nimi;
	private double hinta;
	private int tilausMaara;

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public double getHinta() {
		return hinta;
	}

	public void setHinta(double hinta) {
		this.hinta = hinta;
	}

	public int getTilausMaara() {
		return tilausMaara;
	}

	public void setTilausMaara(int tilausMaara) {
		this.tilausMaara = tilausMaara;
	}
	
	public double hintaYhteensa() {
		return hinta*tilausMaara;
	}
	
	@Override
	public String toString() {
		return "Tilausrivi [nimi=" + nimi + ", hinta=" + hinta + ", tilausMaara=" + tilausMaara + "]";
	}

	public static void main(String[] args) {
		Tilausrivi t1 = new Tilausrivi();
		t1.setNimi("Computer");
		t1.setTilausMaara(2);
		t1.setHinta(1234);
		System.out.println(t1.getNimi() + " "+ t1.getHinta()+ " "+t1.getTilausMaara() + " "+ t1.hintaYhteensa());
	}
}
