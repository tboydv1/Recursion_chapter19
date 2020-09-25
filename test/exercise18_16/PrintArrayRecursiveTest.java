package exercise18_16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrintArrayRecursiveTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void test() {
		Integer[] intArray = {1,2,3,4,5,6,7,8};
		
		String result = printArray(intArray, intArray.length);
		
		System.out.println(result);
		
		
	}
	
	public String printArray(Integer[] arr, int arrLenght) {
		
		if(arrLenght > 0) {
			
			return String.format("%s%d ", printArray(arr ,arrLenght - 1), arr[arrLenght -1 ] );
		}
		else {
			return "";
		}
		
	}
	
	

}
