package harjoitus6;

import static org.junit.Assert.*;

import org.junit.Test;

public class YmpyraTests {

	@Test
	public void testYhpyraScale() {
		Ympyra y = new Ympyra();
		y.setSade(12);
		y.scale(2.2);
		assertEquals(2189.56, y.area(),0.1);
	}
	
	@Test
	public void testYmpyraPerimeter() {
		Ympyra y = new Ympyra();
		y.setSade(12);
		assertEquals(75.40, y.perimeter(),0.1);
	}

}
