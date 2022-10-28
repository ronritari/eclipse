package harjoitus4;

public class Arvosanajakauma {

	public static void main(String[] args) {
		Distribution d = createDistribition();
		DistributionPrinter dp = new DistributionPrinter(d); //konstriktori puuttuu vielä
		dp.printDistribution(); //metodi puuttuu vielä
	}
	
	public static Distribution createDistribition() {
		//luo Distribution olio
		
		//käytä scanneria ja kysy käyttäjiltä kokonaislukuja
		
		//lisää arvo distribution olioon sen insertValuen avulla
		
		//lopuksi palauta (return) distribution
		return new Distribution(1,5);
	}
	
	

}
