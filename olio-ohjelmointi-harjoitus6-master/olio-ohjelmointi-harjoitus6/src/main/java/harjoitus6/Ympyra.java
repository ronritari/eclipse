package harjoitus6;

public class Ympyra{

    private double x = 0; 		//ympyrän keskipisteen x-koordinaatti
    private double y = 0; 		//ympyrän keskipisteen y-koordinaatti
    private double sade = 1; 	//ympyrän säde
	
    public double pintaAla() {
        return Math.PI * sade * sade;
    }


	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getSade() {
		return sade;
	}

	public void setSade(double sade) {
		this.sade = sade;
	}
}  
