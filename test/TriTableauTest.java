import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import jenkins.TriTableau;

import java.util.logging.Logger;


/**
 * @author YoYoYo Zetsubō Zetsubō
 *
 */

public class TriTableauTest {

	Logger logger = Logger.getLogger("TriTableauTest");

	private int[] tab1 = {20,40,10,0,80,30,60,50,90,70};
	private int[] tab2 = {0,10,20,30,40,50,60,70,80,90};
	private int[] tab3 = {90,80,70,60,50,40,30,20,10,0};

	/**
	 * Test method for {@link TriTableau#triCroissant(int[])}.
	 */
	@Test
	void testTriCroissant() 
	{
		try {
			TriTableau.triCroissant(tab1);
		} catch (IndexOutOfBoundsException e) {
			logger.warning("Index max depassé \n");
			fail(e.getMessage());
		} catch (Exception e) {
			logger.warning("Erreur");
			e.printStackTrace();
		}

		assertArrayEquals(tab1, tab2, "Tableau trié incorrectement");
	}
	
	/**
	 * Test method for {@link TriTableau#triDecroissant(int[])}.
	 */
	@Test
	void testTriDecroissant() 
	{
		try {
	        TriTableau.triDecroissant(tab1);
		} catch (IndexOutOfBoundsException e) {
			logger.warning("Index max depassé \n");
			fail(e.getMessage());
		} catch (Exception e) {
			logger.warning("Erreur");
			e.printStackTrace();
		}
		assertArrayEquals(tab1, tab3);
	}
}
