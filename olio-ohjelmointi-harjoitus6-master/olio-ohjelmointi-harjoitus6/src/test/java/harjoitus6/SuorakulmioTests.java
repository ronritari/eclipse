package harjoitus6;

import static org.junit.Assert.*;

import org.junit.Test;

public class SuorakulmioTests {

	@Test
	public void testSuorakulmioPituusWithoutParameters() {
		Suorakulmio s = new Suorakulmio();
		assertEquals(1, s.pituus(),0);
	}
	
	@Test
	public void testSuorakulmioKorkeusWithoutParameters() {
		Suorakulmio s = new Suorakulmio();
		assertEquals(1, s.korkeus(),0);
	}
	@Test
	public void testSuorakulmioPintaalaWithoutParameters() {
		Suorakulmio s = new Suorakulmio();
		assertEquals(1, s.pintaala(),0);
	}
	
	@Test
	public void testSuorakulmioKorkeusWithTwoParameters() {
		Suorakulmio s = new Suorakulmio(2,2);
		assertEquals(2, s.korkeus(),0);
	}
	@Test
	public void testSuorakulmioPintaalaWithTwoParameters() {
		Suorakulmio s = new Suorakulmio(2,2);
		assertEquals(4, s.pintaala(),0);
	}
	@Test
	public void testSuorakulmioPintaalaWithTwoComplexDoubleParameters() {
		Suorakulmio s = new Suorakulmio(2.2321,12345.533);
		assertEquals(27556.4642093, s.pintaala(),0.01);
	}
	@Test
	public void testSuorakulmioPintaalaWithZeros() {
		Suorakulmio s = new Suorakulmio(0,0);
		assertEquals(0, s.pintaala(),0);
	}

	@Test
	public void testSuorakulmioArea() {
		Suorakulmio s = new Suorakulmio(1,2,3,4);
		assertEquals(4, s.area(),0);
	}

	@Test
	public void testSuorakulmioAreaDecimals() {
		Suorakulmio s = new Suorakulmio(1.1,2.2,3.3,4.4);
		assertEquals(4.84, s.area(),0);
	}

}
