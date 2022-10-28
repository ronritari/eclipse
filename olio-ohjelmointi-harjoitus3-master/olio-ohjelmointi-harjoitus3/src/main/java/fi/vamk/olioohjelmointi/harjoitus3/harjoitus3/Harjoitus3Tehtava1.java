package fi.vamk.olioohjelmointi.harjoitus3.harjoitus3;


import java.util.ArrayList;
import java.util.Scanner;

public class Harjoitus3Tehtava1 {
	//käytetään taulukon sijaan ArrayList indeksoitua kokoelmaa
	//käytetään Harjoitus2 Paivamaara-luokkaa, joka valmiina
	private ArrayList<Paivamaara> paivamaarat = new ArrayList<>();
	Scanner input = new Scanner(System.in);
	
	/*Harjoitus3Tehtava1 h3t1 = new Harjoitus3Tehtava1();
		h3t1.addDate("13.1.2019");
		h3t1.addDate("29.9.2019");
		h3t1.addDate("30.9.2019");
		h3t1.addDate("13.1.2020");
		h3t1.addDate("29.9.2020");
		h3t1.addDate("30.9.2020");llll
		h3t1.addDate("13.1.2021");
		h3t1.addDate("29.9.2021");
		h3t1.addDate("30.9.2021");
		
		palautaAnnetunVuodenPaivamaarat();
		insert(2020)
		assertEquals(1, h3t1.tulostaAnnetunPaivamaaranIndeksi());
	*/
	
	public void kysyPaivamaariaJaTalletaArrayListaan() {
		//TODO
	}
		
	public void tulostaPaivamaarat() {
		for(Paivamaara pvm:paivamaarat) {
			System.out.println(pvm.toString());
		}
	}
	//Ohjelma kysyy käyttäjältä vuosiluvun ja tulostaa ArrayList-kokoelmasta kaikki kyseisen vuoden
	//päivämäärät. 
	public String palautaAnnetunVuodenPaivamaarat() {
		String vastaus = "";
		String vuosi = "2020";

		for (int i=0; i<paivamaarat.size();i++) {
			if(paivamaarat.get(i).toString().contains(vuosi)==true) {
				vastaus += paivamaarat.get(i).toString()+"\n";	
			}
		}
		return vastaus;
	}

	//Ohjelma kysyy etsittävän päivämäärän ja ilmoittaa, missä indeksikohdassa päivämäärä on kokoelmassa
	//tai ettei päivämäärää löytynyt. Käytä hyväksi kirjoittamaasi onSama-metodia. 
	public int tulostaAnnetunPaivamaaranIndeksi() {
		//TODO
		int vastaus = 0;
		String vuosi = "29.9.2019";

		for (int i=0; i<paivamaarat.size();i++) {
			if(paivamaarat.get(i).toString().contains(vuosi)==true) {
			vastaus = i;	
			}
		}	
		return vastaus;
		
	}
	
	/** Testausta varten tarvitaan metodi, jolla merkkijono lisätään luokan attribuuttina olevaan ArrayListaan*/
	public void addDate(String date) {
		Paivamaara pvm = new Paivamaara(date);
		paivamaarat.add(pvm);
	}
	
	/** Testausta varten tarvitaan myös metodi, joka osaa palauttaa ArrayListan*/
	public ArrayList<Paivamaara> getPaivamaarat(){
		
		
		return paivamaarat;
	}

}
