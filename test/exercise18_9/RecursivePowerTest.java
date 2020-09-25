package exercise18_9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RecursivePowerTest {

	RecursivePower obj;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		obj = new RecursivePower();
	}

	@AfterEach
	void tearDown() throws Exception {
		
	}

	@Test
	void raiseValueToThePowerOf2Test() {
		
		assertEquals(81, obj.power(3, 4));
		
	}

}
