package futstats;

public class defender extends player{
	public defender(String name, String pos, int number) {
		super(name, pos, number);
		// TODO Auto-generated constructor stub
	}
	private int clearances;
	private int tackles;
	
	public int getClearances() {
		return clearances;
	}
	public void setClearances(int clearances) {
		this.clearances = clearances;
	}
	public int getTackles() {
		return tackles;
	}
	public void setTackles(int tackles) {
		this.tackles = tackles;
	}
	

}
