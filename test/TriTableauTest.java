import static org.junit.jupiter.api.Assertions.*;


import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import jenkins.Calculs;
import jenkins.TriTableau;

/**
 * @author YoYoYo Zetsubō Zetsubō
 *
 */
//@RunWith(Parameterized.class)
public class TriTableauTest {
	
	private int[] t1 = {1,7,94,23,36,666,84,28,113};
	private int[] t2 = {1,7,23,28,36,84,94,113,666};
	private int[] t3 = {666,113,94,84,36,28,23,7,1};

	void testTriCroissant() 
	{
        TriTableau monTri = new TriTableau();
        monTri.triCroissant(t1);
        for (int i = 0; i < t1.length; i++) {
        	for (int j = 0; j < t2.length; j++) {
        		assertEquals(t1[i], t2[j]);
        	}
        }
	}
	
	void testTriDecroissant() 
	{
        TriTableau monTri = new TriTableau();
        monTri.triDecroissant(t1);
        for (int i = 0; i < t1.length; i++) {
        	for (int j = 0; j < t2.length; j++) {
        		assertEquals(t1[i], t3[j]);
        	}
        }
	}
}
