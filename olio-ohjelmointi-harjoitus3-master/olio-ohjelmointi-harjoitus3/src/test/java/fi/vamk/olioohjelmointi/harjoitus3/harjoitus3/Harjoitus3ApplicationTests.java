package fi.vamk.olioohjelmointi.harjoitus3.harjoitus3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Harjoitus3ApplicationTests {

	@Test
	void contextLoads() {
	}

	/** Ohjelma kysyy ArrayList-kokoelmaan laitettavat päivämäärät käyttäjältä siten, että käyttäjä voi syöttää
yhden päivämäärän per rivi niin monta kuin haluaa ja tyhjä rivi lopettaa syötön. Ohjelma myös tulostaa
syötetyt päivämäärät. */
	@Test
	void testaaArayListanTulostus() {
		Harjoitus3Tehtava1 h3t1 = new Harjoitus3Tehtava1();
		h3t1.addDate("13.1.2021");
		h3t1.addDate("29.9.2021");
		h3t1.addDate("30.9.2021");
		//testataan, että arrayListaan meni kolme päivämäärää
		assertEquals(3, h3t1.getPaivamaarat().size());
		//testataan, että viimeinen päivämäärä on annettu
		ArrayList<Paivamaara> syotetyt = h3t1.getPaivamaarat();
		//haetaam viimeisin olio listalta
		Paivamaara pvm = syotetyt.get(syotetyt.size()-1);	//syotetyt.size()-1 on kolme mutta viimeinen kohdasssa kaksi [0,1,2]
		assertEquals("30.9.2021", pvm.toString());
	}
	
	@Test
	void testaaTulostaaSyotetytPaivamaarat() {
		Harjoitus3Tehtava1 h3t1 = new Harjoitus3Tehtava1();
		h3t1.addDate("13.1.2019");
		h3t1.addDate("29.9.2019");
		h3t1.addDate("30.9.2019");
		h3t1.addDate("13.1.2020");
		h3t1.addDate("29.9.2020");
		h3t1.addDate("30.9.2020");
		h3t1.addDate("13.1.2021");
		h3t1.addDate("29.9.2021");
		h3t1.addDate("30.9.2021");
		h3t1.tulostaPaivamaarat();
		//Tyhmä testicase, kun ei oikeastaan testaa mitään
	}
	
	//Ohjelma kysyy käyttäjältä vuosiluvun ja tulostaa ArrayList-kokoelmasta kaikki kyseisen vuoden
	//päivämäärät. 
	@Test
	void testaaValittuVuosi() {
		Harjoitus3Tehtava1 h3t1 = new Harjoitus3Tehtava1();
		h3t1.addDate("13.1.2019");
		h3t1.addDate("29.9.2019");
		h3t1.addDate("30.9.2019");
		h3t1.addDate("13.1.2020");
		h3t1.addDate("29.9.2020");
		h3t1.addDate("30.9.2020");
		h3t1.addDate("13.1.2021");
		h3t1.addDate("29.9.2021");
		h3t1.addDate("30.9.2021");
		String vastaus = h3t1.palautaAnnetunVuodenPaivamaarat();
		System.out.println(vastaus);
		assertEquals("13.1.2020\n" + "29.9.2020\n"+ "30.9.2020\n", vastaus);
	}
	
	//Ohjelma kysyy etsittävän päivämäärän ja ilmoittaa, missä indeksikohdassa päivämäärä on kokoelmassa
	//tai ettei päivämäärää löytynyt. Käytä hyväksi kirjoittamaasi onSama-metodia
	@Test
	void testaaHakeaPaivamaaranIndeksi() {
		Harjoitus3Tehtava1 h3t1 = new Harjoitus3Tehtava1();
		h3t1.addDate("13.1.2019");
		h3t1.addDate("29.9.2019");
		h3t1.addDate("30.9.2019");
		h3t1.addDate("13.1.2020");
		h3t1.addDate("29.9.2020");
		h3t1.addDate("30.9.2020");
		h3t1.addDate("13.1.2021");
		h3t1.addDate("29.9.2021");
		h3t1.addDate("30.9.2021");
		assertEquals(1, h3t1.tulostaAnnetunPaivamaaranIndeksi());
		
	}
	/**Kirjoita ohjelma (main-metodin sisältävä luokka riittää), joka säilyttää tuotenumeroita (int, Integer) ja
	hintoja (double, Double) HashMap-kokoelmassa. Tuotenumero on avain, ja hinta on siihen liittyvä tieto.
	Lisää ohjelmakoodissa valmiiksi joitakin tuotenumeroita ja hintoja kokoelmaan (esim. tuotteen 100 hinta
	on 12.50).*/
	@Test
	void testaaHaeHinta() {
		Product p = new Product();
		p.addProducts();
		p.setNumber(123);
		p.setPrice(12.50);
		assertEquals(12.5, p.getPriceForHashTableProduct("123"));
	}
}
