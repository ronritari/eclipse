package harjoitus5;

public class UmpiSarmio extends Sarmio{

	public static double tiheys;
    //lisää getterit ja setterit getTiheys(), setTiheys(in double)

    public static double getTiheys() {
        return tiheys;
    }

    public static void setTiheys(double tiheys) {
        UmpiSarmio.tiheys = tiheys;
    }
    //toteuta metodi public double massa()
    public double massa() {
        //massa = tiheys * tilavuus
        double massa = tilavuus() * tiheys;
        return massa;
    }
    //toteuta main, jossa testaat syöttää särmiön mitat ja tiheyden ja tulostat massan

    public static void main(String[] args) {
        UmpiSarmio u1 = new UmpiSarmio();
        u1.korkeus = 3.0;
        u1.pituus = 4.0;
        u1.leveys = 5.0;
        u1.tiheys = 6.0;

        System.out.println(u1.massa());
    }

}
