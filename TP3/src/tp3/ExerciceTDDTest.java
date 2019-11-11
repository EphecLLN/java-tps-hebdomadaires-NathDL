package tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExerciceTDDTest {

	@Test
	void testEstPair() {
		ExerciceTDD test1 = new ExerciceTDD();
		assertEquals(true, test1.estPair(16));
	}

	@Test
	void testPerimetreCarre() {
		ExerciceTDD test2 = new ExerciceTDD();
		assertEquals(16, test2.perimetreCarre(4));
	}

	@Test
	void testContientCaractere() {
		ExerciceTDD test3 = new ExerciceTDD();
		assertEquals(true, test3.contientCaractere("abd", 'd'));
	}

}
