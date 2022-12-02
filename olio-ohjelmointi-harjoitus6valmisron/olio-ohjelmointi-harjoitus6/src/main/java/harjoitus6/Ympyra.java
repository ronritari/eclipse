package harjoitus6;

public class Ympyra implements Measurable{

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


	public double area() {
		// TODO Auto-generated method stub
		return pintaAla();
	}


	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * getSade();
	}


	public void scale(double scaleValue) {
		sade = sade * scaleValue;
		
	}
}  
