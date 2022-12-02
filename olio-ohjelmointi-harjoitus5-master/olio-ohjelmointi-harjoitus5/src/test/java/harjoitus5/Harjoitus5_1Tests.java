package harjoitus5;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Assert;


public class Harjoitus5_1Tests {
	
	@Test
	public void testUmpisarmioMassa() {
		UmpiSarmio s = new UmpiSarmio();
		s.pituus=1;
		s.korkeus=1;
		s.leveys=2;
		s.setTiheys(7.874);
		assertEquals(15.748, s.massa(),0);
	}
}