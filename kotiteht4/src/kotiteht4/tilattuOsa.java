package kotiteht4;

public class tilattuOsa extends osa{
	private String toimittajaNimi;
	private double hinta;
	
	
	
	public tilattuOsa(String nimi, int maara, String toimittajaNimi, double hinta) {
		super(nimi, maara);
		this.toimittajaNimi = toimittajaNimi;
		this.hinta = hinta;
	}
	
	
	public String getToimittajaNimi() {
		return toimittajaNimi;
	}
	public void setToimittajaNimi(String toimittajaNimi) {
		this.toimittajaNimi = toimittajaNimi;
	}
	public double getHinta() {
		return hinta;
	}
	public void setHinta(double hinta) {
		this.hinta = hinta;
	}
	
	
	public double varastoarvo() {
		return this.hinta * this.getMaara();
	}


	@Override
	public String toString() {
		return "tilattuOsa [toimittajaNimi = " + toimittajaNimi + ", hinta = " + hinta + ", varastoarvo() = " + varastoarvo()
				+ ", getNimi() = " + getNimi() + ", getMaara() = " + getMaara() + "]";
	}
	
	
}
