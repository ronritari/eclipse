package harjoitus5;

//peri luokalta Huone
public class Tyohuone extends Huone{
	//merkkijono henkilöistä
	private String henkilot = new String();
	

	public String getHenkilot() {
		return henkilot;
	}

	public void setHenkilot(String henkilot) {
		this.henkilot = henkilot;
	}

	@Override
	public String toString() {
		return super.toString() +" [henkilot=" + henkilot + "]";
	}
	//metodi kysyTiedot()

}
