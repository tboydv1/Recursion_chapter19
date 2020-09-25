package exercise18_17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrintArrayBackward {

	static {
		
	}
	
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void printArrayBackwardTest() {
		
		Character[] value = {'b','l','o','o','d'};
		
		
		String result = stringReverse(value, 0);
				
		System.out.println(stringReverse(value, 0));
		
		assert(result.equals("doolb"));
		
		
		Character[] value2 = {'b','a','k','e','r','y'};
		
		result = stringReverse(value2, 0);
		
		System.out.println(stringReverse(value2, 0));
		
		assert(result.equals("yrekab"));
		
	}
	
	public String stringReverse(Character[] string, int x) {
		
		if(x < string.length) {
			
			return String.format("%s%c", stringReverse(string, x + 1), string[x]);
		}
		else {
			return "";
		}
	}

}
