package harjoitus6;

import static org.junit.Assert.*;

import org.junit.Test;

public class SuorakulmioMeasurableTests {
	@Test
	public void testSuorakulmioSkaalaus() {
		Suorakulmio s = new Suorakulmio(0,0,1,1);
		s.scale(2);
		assertEquals(4, s.area(),0);
	}
	
	@Test
	public void testSuorakulmioSkaalausDecimaaleilla() {
		Suorakulmio s = new Suorakulmio(0.01,0.01,5,5);
		s.scale(12);
		assertEquals(3585.61, s.area(),0.01);
	}

	@Test
	public void testSuorakulmioPerimeter() {
		Suorakulmio s = new Suorakulmio(0.01,0.01,5,5);
		assertEquals(19.96, s.perimeter(),0.01);
	}
	
	

}
