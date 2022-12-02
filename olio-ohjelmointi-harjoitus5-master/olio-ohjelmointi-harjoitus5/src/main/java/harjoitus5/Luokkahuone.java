package harjoitus5;

public class Luokkahuone extends Huone{
//tuolit, tietokoneet, videotykki
	private int tuolit, tietokoneet;
	private boolean videotykki;
	public int getTietokoneet() {
		return tietokoneet;
	}
	public void setTietokoneet(int tietokoneet) {
		this.tietokoneet = tietokoneet;
	}
	public int getTuolit() {
		return tuolit;
	}
	public void setTuolit(int tuolit) {
		this.tuolit = tuolit;
	}
	public boolean isVideotykki() {
		return videotykki;
	}
	public void setVideotykki(boolean videotykki) {
		this.videotykki = videotykki;
	}
	@Override
	public String toString() {
		return super.toString() + ", Luokkahuone [tuolit=" + tuolit + ", tietokoneet=" + tietokoneet + ", videotykki=" + videotykki + "]";
	}
//metodi kysyTiedot()
}
