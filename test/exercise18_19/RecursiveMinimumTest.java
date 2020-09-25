package exercise18_19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RecursiveMinimumTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void minimumTest() {
		
		int[] arr = {7,5,4,-6,2,6,3}; 
		
		
		int result = recursiveMinimum(arr, arr.length);
		System.out.println(result);
		
		result = recursiveMaximum(arr, arr.length);
		
		System.out.println(result);
		
	}
	
	public int recursiveMinimum(int[] arr, int x) {
		
		
		if(x == 1) {
			
			return arr[0];
		}
		else {
			
			return Math.min(arr[x - 1], recursiveMinimum(arr, x -1));
		}
		
	
	}
	
	public int recursiveMaximum(int[]arr, int x)
	{	
		
		if(x == 1) {
			 return arr[0];
		}
		else {
			
			return Math.max(arr[x-1], recursiveMaximum(arr, x-1));
		}
	}
	
	public int forMinimum(int arr[]) {
		
		int minimum = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			
			if(arr[i] < minimum) {
				minimum = arr[i];
			}
		
		}
		
		return minimum;
		
	}

}
