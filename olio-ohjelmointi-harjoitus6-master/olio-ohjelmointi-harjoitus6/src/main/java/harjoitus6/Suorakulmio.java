package harjoitus6;

public class Suorakulmio{
	public double ala_x, ala_y, yla_x, yla_y;
	
	public Suorakulmio() {
		ala_x=0;
		ala_y=0;
		yla_x=1;
		yla_y=1;
	}

	public Suorakulmio(double ylax, double ylay) {
		ala_x=0;
		ala_y=0;
		yla_x=ylax;
		yla_y=ylay;
	}

	public Suorakulmio(double alax, double alay, double ylax, double ylay) {
		ala_x=alax;
		ala_y=alay;
		yla_x=ylax;
		yla_y=ylay;
	}
	
	public double pituus() {
		return yla_x-ala_x;
	}

	public double korkeus() {
		return yla_y-ala_y;
	}
	
	public double pintaala(){
		return pituus()*korkeus();
	}
}
