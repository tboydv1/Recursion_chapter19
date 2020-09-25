package examples;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class FactorialCalculator {

	public static long factorial(long number) {
		
//		System.out.printf("local variable --> %d%n", number);
		if(number <= 1) {
			
			return 1; 
		} // base cases 0! = 1 and 1! = 1
		else {
			System.out.printf("recursive step --> %d * factorian(%d)%n%s", number, number-1, "---->");
			return number * factorial(number - 1);
		}

		
	}
	public static void main(String[] args) {
		
		//Calculate the factorials of 0 through 21
		IntStream.rangeClosed(0, 10)
				 .forEach((x)-> {
				 
					System.out.printf("%d! = %d%n%n", x, factorial(x));
						 
				 });
		
		System.out.println();
		
//		//Calculate factorials of 0 through 50 
//		IntStream.rangeClosed(0, 10)
//				 .forEach((counter)->
//					System.out.printf("%d! = %d%n", counter, 
//							factorial(BigInteger.valueOf(counter))) 
//				);
		
		

	}
	
	public static BigInteger factorial(BigInteger number) {
		
		if(number.compareTo(BigInteger.ONE) <= 0) {
			
			return BigInteger.ONE;
		}
		else {
			return number.multiply(
					factorial(number.subtract(BigInteger.ONE)
							));
		}
	}
	
	public static long iterativeFactorial(long number) {
		
		long result = 1;
		
		for(long i = number; i > 1; i--) {
			
			result *= i;
		}
		
		return result;
		
	}
	

}
