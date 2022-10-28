package harjoitus4;

public class NoppaJakauma {
	public static void main(String[] args) {
		Distribution d  = teeHeitot();
		DistributionPrinter dp = new DistributionPrinter(d); //konstriktori puuttuu vielä
		dp.printDistribution(); //metodi puuttuu vielä
	}
	
	public static Distribution teeHeitot() {
		//kysy montako kertaa heitetään
		
		//lue scannerilla heittokerrat
		
		//arvo haluttu määrä, lisää tulokset Distribution -olioon
		// tyyliin distribution.insertInt(new Noppa().getLuku())
		
	}
}
