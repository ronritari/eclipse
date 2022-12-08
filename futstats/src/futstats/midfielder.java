package futstats;

public class midfielder extends player{
	public midfielder(String name, String pos, int number) {
		super(name, pos, number);
		// TODO Auto-generated constructor stub
	}
	private int passes;
	private int compleatedPasses;
	public int getPasses() {
		return passes;
	}
	public void setPasses(int passes) {
		this.passes = passes;
	}
	public int getCompleatedPasses() {
		return compleatedPasses;
	}
	public void setCompleatedPasses(int compleatedPasses) {
		this.compleatedPasses = compleatedPasses;
	}
	

}
