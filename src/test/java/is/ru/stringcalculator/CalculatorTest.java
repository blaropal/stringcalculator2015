package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testAddforTwo(){
		assertEquals(4, Calculator.add("1,3"));
	}

	@Test
	public void testAddforMany(){
		assertEquals(10, Calculator.add("1,1,2,2,3,1"));
	}
}