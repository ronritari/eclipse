package harjoitus5;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class Harjoitus5_3Tests {
	
	@Test
	public void testHuone() {
		Huone h = new Huone();
		h.setTunnus("C009");
		h.setKuvaus("Tietokoneluokka");
		Assert.assertTrue(h.toString().toLowerCase().contains("c009"));
	}
	
	@Test
	public void testTyoHuone() {
		Tyohuone h = new Tyohuone();
		h.setTunnus("C009");
		h.setKuvaus("Tietokoneluokka");
		h.setHenkilot("Timo;Jukka");
		Assert.assertTrue(h.toString().toLowerCase().contains("c009"));
	}
	
	@Test
	public void testLuokkahuone() {
		Luokkahuone h = new Luokkahuone();
		h.setTunnus("C009");
		h.setKuvaus("Tietokoneluokka");
		h.setTuolit(30);
		h.setTietokoneet(29);
		h.setVideotykki(true);
		//testataan löytyykö kantaluokan toString
		Assert.assertTrue(h.toString().toLowerCase().contains("c009"));
		//testataan, onko tietokoneiden määrä tallennettu
		Assert.assertTrue(h.toString().toLowerCase().contains("29"));
		Assert.assertEquals(30, h.getTuolit(),0);
		Assert.assertTrue(h.getKuvaus().toLowerCase().contains("tietokoneluokka"));
	}
}