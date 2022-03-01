

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jenkins.Calculs;

/**
 * 
 */

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

	

	/**
	 * Test method for {@link Calculs#multiplier()}.
	 */
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

	/**
	 * Test method for {@link Calculs#additionner()}.
	 */
	@Test
	void testAdditionner() {
		if(c1.additionner() != 3) {
			fail("Methode additionner non conforme 2 + 1 = 3 ne fonctionne pas.");
		}
		
		assertEquals(c1.additionner(), 3);
	}

	/**
	 * Test method for {@link Calculs#diviser()}.
	 */
	@Test
	void testDiviser() {
		if(c3.diviser() != (1/2)) {
			fail("Methode diviser non conforme 100 / 200 = 0.5 ne fonctionne pas.");
		}
		
		assertEquals(c3.diviser(), (1/2));
	}

	/**
	 * Test method for {@link Calculs#soustraire()}.
	 */
	@Test
	void testSoustraire() {
		if(c2.soustraire() != -10) {
			fail("Methode soustraire non conforme 10 - 20 = -10 ne fonctionne pas.");
		}
		
		assertEquals(c2.soustraire(), -10);
	}

}
