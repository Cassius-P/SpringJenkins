import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import data.Calculs;

/**
 * @author test
 * 
 */
class CalculsTest {

	private Calculs c1 = null;
	private Calculs c2 = null;
	private Calculs c3 = null;
	
	/**
	 * Initialise les valeurs avant chaque test 
	 */
	@BeforeEach // D�clencher cette m�thode avant l'ex�cution
	void setUp() throws Exception
	{
		c1 = new Calculs(1,2);
		c2 = new Calculs(10,20);
		c3 = new Calculs(100,200);
	}

	

	/** {@link Calculs#multiplier()} */
	@Test
	void testMultiplier() 
	{
		if(c1.multiplier() != 2)
		{
			fail("Methode multiplier non conforme 2 * 1 = 2 ne fonctionne pas.");
		}
		
		// Est ce que (2 == 42) ? non donc : test en Erreur ----- NANI ?
		assertEquals(c1.multiplier(), 2);
	}

	/** {@link Calculs#additionner()} */
	@Test
	void testAdditionner() {
		if(c2.additionner() != 30) {
			fail("Methode additionner non conforme 10 + 120 = 3 ne fonctionne pas.");
		}
		assertEquals(c2.additionner(), 30);
	}

	/** {@link Calculs#diviser()} */
	@Test
	void testDiviser() {
		if(c3.diviser() != (1/2)) {
			fail("Methode diviser non conforme 100 / 200 = 0.5 ne fonctionne pas.");
		}
		assertEquals(c3.diviser(), (1/2));
	}

	/** {@link Calculs#soustraire()} */
	@Test
	void testSoustraire() {
		if(c1.soustraire() != -1) {
			fail("Methode soustraire non conforme 1 - 2 = -1 ne fonctionne pas.");
		}
		assertEquals(c1.soustraire(), -1);
	}

}
