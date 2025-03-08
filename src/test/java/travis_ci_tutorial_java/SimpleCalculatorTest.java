package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	
	@Test
	public void minus() {
		SimpleCalculator calc = new SimpleCalculator();
		int result = calc.minus(5, 3);
		assertEquals("5 - 3 should be 2",2,result);
	}
	@Test
	public void multiply() {
	    SimpleCalculator calc = new SimpleCalculator();
	    int result = calc.mulyiply(2, 3);
	    assertEquals("2 * 3 should be 6", 6, result);
	}
	@Test
	public void divide() {
	    SimpleCalculator calc = new SimpleCalculator();
	    int result = calc.divide(10, 2);
	    assertEquals("10 / 2 should be 5", 5, result);
	}
	@Test(expected = ArithmeticException.class)
    public void testDivideByZero_throwsArithmeticException() {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.divide(5, 0);
    }
}
