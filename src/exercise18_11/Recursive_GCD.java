package exercise18_11;

import java.util.Scanner;

public class Recursive_GCD {

	public int gcd(int x, int y) {
		
		System.out.printf("%d, %d%n", x, y);
		
		if(y == 0) {
			return x;
		}
		
		else {
			System.out.printf("recursive call ---> %d, %d%n", x, x % y);
			return gcd(x, x % y);
		}
		
	}
	
	
}
