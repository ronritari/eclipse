package kotiteht3;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Opetussuunnitelma ops = new Opetussuunnitelma(null, null, 0);
		
		Opetussuunnitelma java = new Opetussuunnitelma("ITTA0204", "Olio-ohjelmointi", 5);
		Opetussuunnitelma kautto = new Opetussuunnitelma("ITTA0203", "Käyttöjärjestelmät", 3);
		int hakuvalinta = 1;
		
		//Array opetussuunnitelmia
		ArrayList<Opetussuunnitelma> ops1 = new ArrayList<Opetussuunnitelma>();
		ops1.add(java);
		ops1.add(kautto);
		
		
		//kysyy toistuvasti millä haetaan
		try {
		while (hakuvalinta != 0) {
			System.out.println("Valitse: 1, haku koodilla; 2, haku merkkijonolla; 3, haku laajudella; 0, lopetus");
			
			hakuvalinta = input.nextInt();
			
			if (hakuvalinta == 1) {
				ops.haeKoodilla(ops1);
			}
			if (hakuvalinta == 2) {
				ops.haemerk(ops1);
			}
			if (hakuvalinta == 3) {
				ops.haelaajuus(ops1);
			}
			if (hakuvalinta < 0 || hakuvalinta > 3) {
				System.out.println("virhe kokeile uudestaan");
			}
		}
		}catch(Exception e){
			System.out.println("jokin meni pieleen");
		}
		System.out.println("Hyvästi :)");

	}

}
