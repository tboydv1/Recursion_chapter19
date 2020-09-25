package examples;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class FibonacciCalculator {

	private static BigInteger TWO = BigInteger.valueOf(2);
	
	public static BigInteger fibonacci(BigInteger number) {
		
		if(number.equals(BigInteger.ZERO) ||
				number.equals(BigInteger.ONE)) {
			
			return number;
			
		}
		else {
			
			return fibonacci(number.subtract(BigInteger.ONE))
					               .add(fibonacci(number.subtract(TWO)));
		}
	}
	
	public static void main(String[] args) {
		
		//displays the fibonacci values from 0-40
		IntStream.rangeClosed(0, 40)
				 .forEach(counter -> {
					 
			 System.out.printf("Fibonacci of %d is: %d%n", counter, 
					 fibonacci2(counter));
		 });

	}
	
	public static Integer fibonacci2(Integer number) {
		
		if(number == 0 || number == 1) {
			
			return number;
		}
		else {
			return fibonacci2((number - 1)) + (fibonacci2(number - 2));
		}
	}
}
