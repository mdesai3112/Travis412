package travis_ci_tutorial_java;

public class SimpleCalculator {
	public int add(int a, int b) {
		return a + b;
	}
	public int minus(int a, int b) {
		return a - b;
	}
	public int mulyiply(int a, int b) {
		return a * b;
	}
	public int divide(int a, int b) {
		if(b==0) {
			throw new ArithmeticException("You can not divide by zero");
		}
		return a / b;
		
	}
}
