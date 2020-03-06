package Schlaeppi.Piper.Project6.Javaproject;

public class SimpleMath {

	public double divide(double numerator, double denomenator ) {
		
		if (denomenator == 0) {
			throw new ArithmeticException("Cannot divide by 0");
			}
		double result = numerator / denomenator;
		
		System.out.println(result);
		
		return result; }
	}

