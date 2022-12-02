package kotiteht4;

public class osa {
	private String nimi;
	private int maara;
	
	
	
	public osa(String nimi, int maara) {
		super();
		this.nimi = nimi;
		this.maara = maara;
	}
	
	
	public String getNimi() {
		return nimi;
	}
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	public int getMaara() {
		return maara;
	}
	public void setMaara(int maara) {
		this.maara = maara;
	}


	@Override
	public String toString() {
		return "osa [nimi = " + nimi + ", maara = " + maara + "]";
	}
	
	
	
}
