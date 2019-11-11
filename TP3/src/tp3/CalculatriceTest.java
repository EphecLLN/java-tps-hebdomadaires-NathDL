package tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatriceTest {

	@Test
	public void testCarre() {
		Calculatrice calc = new Calculatrice(0);
		assertEquals(1, calc.carre(1));
	}

}
