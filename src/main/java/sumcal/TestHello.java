package sumcal;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestHello {
	private Hello hello;
	@Before
	public void setUp() throws Exception {
		hello = new Hello();
	}

	@Test
	public void testSum() {
		hello.sum(5);
		assertEquals(1+2+3+4+5,hello.getResult());
		//fail("Not yet implemented");
	}

}
