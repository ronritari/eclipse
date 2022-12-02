package harjoitus5;

public class Huone {
	//lisää attribuutit tunnus ja kuvaus
	private String tunnus,kuvaus;
	public void askData() {
		
	}
	
	@Override
	public String toString() {
		return "Huone [tunnus=" + tunnus + ", kuvaus=" + kuvaus + "]";
	}

	public String getTunnus() {
		return tunnus;
	}

	public void setTunnus(String tunnus) {
		this.tunnus = tunnus;
	}

	public String getKuvaus() {
		return kuvaus;
	}

	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}
}
