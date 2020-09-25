package exercise18_11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RecurciveGcdTest {

	Recursive_GCD obj;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	
		obj = new Recursive_GCD();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void findGcdTest() {
		
		assertEquals(1, obj.gcd(14, 3));
	}

}
