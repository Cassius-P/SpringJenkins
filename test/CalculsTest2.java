import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import data.Calculs;

/**
 * @author Yo
 *
 */
@RunWith(Parameterized.class)
class CalculsTest2 {


	static Stream<Arguments> chargerJeuDeTestAddition() throws Throwable
	{
		return Stream.of(
				Arguments.of(1,6,7),
				Arguments.of(3,5,8),
				Arguments.of(4,2,6)
		);
	}

	static Stream<Arguments> chargerJeuDeTestSoustraction() throws Throwable
	{
		return Stream.of(
				Arguments.of(7,6,1),
				Arguments.of(8,5,2),
				Arguments.of(5,1,4)
		);
	}

	static Stream<Arguments> chargerJeuDeTestDivision() throws Throwable
	{
		return Stream.of(
				Arguments.of(6,2,3),
				Arguments.of(3,0,0),
				Arguments.of(4,2,2)
		);
	}

    static Stream<Arguments> chargerJeuDeTestMultiplication() throws Throwable
    {
        return Stream.of(
            Arguments.of(2,2,4),
            Arguments.of(6,6,36),
            Arguments.of(3,2,6)
        );
    }

	@ParameterizedTest(name="Addition numéro {index}: nombre1={0}, nombre2={1}, résultat attendu = {2}")
	@MethodSource("chargerJeuDeTestAddition")
	void testAdditioner(int firstNumber, int secondNumber, int expectedResult)
	{
		// Partie paramétrée
		Calculs monCal = new Calculs(firstNumber, secondNumber);
		assertEquals(expectedResult, monCal.additionner(), "test en échec pour " + firstNumber + " + " + secondNumber + " != " + expectedResult);

		// Partie indépendante (les paramètres peuvent ne servir qu'à une sous partie des tests)
		String n = null;
		assertNull(n);
	}

	@ParameterizedTest(name="Soustraction numéro {index}: nombre1={0}, nombre2={1}, résultat attendu = {2}")
	@MethodSource("chargerJeuDeTestSoustraction")
	void testSoustraire(int firstNumber, int secondNumber, int expectedResult)
	{
		// Partie paramétrée
		Calculs monCal = new Calculs(firstNumber, secondNumber);
		assertEquals(expectedResult, monCal.soustraire(), "test en échec pour " + firstNumber + " - " + secondNumber + " != " + expectedResult);

		// Partie indépendante (les paramètres peuvent ne servir qu'à une sous partie des tests)
		String n = null;
		assertNull(n);
	}

	@ParameterizedTest(name="Division numéro {index}: nombre1={0}, nombre2={1}, résultat attendu = {2}")
	@MethodSource("chargerJeuDeTestDivision")
	void testDiviser(int firstNumber, int secondNumber, int expectedResult)
	{
		// Partie paramétrée
		Calculs monCal = new Calculs(firstNumber, secondNumber);
		try{
			monCal.diviser();
		} catch (ArithmeticException e){
			fail("Division par 0 impossible");
		}
		assertEquals(expectedResult, monCal.diviser(), "test en échec pour " + firstNumber + " / " + secondNumber + " != " + expectedResult);

		// Partie indépendante (les paramètres peuvent ne servir qu'à une sous partie des tests)
		String n = null;
		assertNull(n);
	}

	@ParameterizedTest(name="Multiplication numéro {index}: nombre1={0}, nombre2={1}, résultat attendu = {2}")
	@MethodSource("chargerJeuDeTestMultiplication")
	void testMultiplier(int firstNumber, int secondNumber, int expectedResult) 
	{
		// Partie paramétrée
	        Calculs monCal = new Calculs(firstNumber, secondNumber);
	        assertEquals(expectedResult, monCal.multiplier(), "test en échec pour " + firstNumber + " * " + secondNumber + " != " + expectedResult); 

	    // Partie indépendante (les paramètres peuvent ne servir qu'à une sous partie des tests)
	        String n = null;
	        assertNull(n);
	}

}
