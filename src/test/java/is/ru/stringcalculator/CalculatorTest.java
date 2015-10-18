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

	@Test
	public void testAllowNewLine(){
		assertEquals(4, Calculator.add("2\n2"));
	}

	@Test
	public void testChangedDelimiter(){
		assertEquals(6, Calculator.add("//-\n1-2-3"));
		assertEquals(8, Calculator.add("//s\n1s4s3"));
	}

	@Test
	public void testExceptionThrow(){
		try{
			assertEquals("Negatives not allowed: -1", Calculator.add("-1, 2"));
		}
		catch(Exception e){
			
		}
	}
}