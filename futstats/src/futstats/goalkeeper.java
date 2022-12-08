package futstats;

public class goalkeeper extends player{
	public goalkeeper(String name, String pos, int number) {
		super(name, pos, number);
		// TODO Auto-generated constructor stub
	}
	private int saves;
	private int clearances;
	
	public int getSaves() {
		return saves;
	}
	public void setSaves(int saves) {
		this.saves = saves;
	}
	public int getClearances() {
		return clearances;
	}
	public void setClearances(int clearances) {
		this.clearances = clearances;
	}

}
