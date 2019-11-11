package tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StatToolBoxTest {

	@Test
	void testMoyenne() {
		int [] val = {12, 14, 2};
		StatToolBox test = new StatToolBox(val);
		assertEquals(9, test.moyenne());
	}

}
