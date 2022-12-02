package harjoitus6;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class PaivamaaraTest {

	@Test
	public void testFirst() {
		ArrayList<Paivamaara>  list= new ArrayList<Paivamaara>();
		list.add(new Paivamaara(1,4,2020));
		list.add(new Paivamaara(1,3,2019));
		list.add(new Paivamaara(1,2,2023));
		list.add(new Paivamaara(1,1,2021));
		Collections.sort(list);
		assertEquals("1.3.2019",list.get(0).toString());
	}
	
	@Test
	public void testLast() {
		ArrayList<Paivamaara>  list= new ArrayList<Paivamaara>();
		list.add(new Paivamaara(1,4,2020));
		list.add(new Paivamaara(1,3,2019));
		list.add(new Paivamaara(1,2,2023));
		list.add(new Paivamaara(1,1,2021));
		Collections.sort(list);
		assertEquals("1.2.2023",list.get(list.size()-1).toString());
	}

	@Test
	public void testTwoSame() {
		ArrayList<Paivamaara>  list= new ArrayList<Paivamaara>();
		list.add(new Paivamaara(1,3,2019));
		list.add(new Paivamaara(1,3,2019));
		list.add(new Paivamaara(1,2,2023));
		list.add(new Paivamaara(1,1,2021));
		Collections.sort(list);
		assertEquals("1.3.2019",list.get(0).toString());
	}
}
