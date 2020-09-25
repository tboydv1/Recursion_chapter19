package exercise18_14;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RecursivePalindromeTest {
	
	RecursivePalindrome palindromeChecker;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		palindromeChecker = new RecursivePalindrome();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void returnBooleanResultTrueIfPalindrome() {
		
		
		String word = "radar";
		
		char[] args = word.toCharArray();
		
		boolean result = palindromeChecker.testPalindrome(args, args.length);
		assertTrue(result);
		
	}
	
	@Test
	void returnBooleanResultFalseIfNotPalindrome() {
		
		
		String word = "radat";
		
		char[] args = word.toCharArray();
		
		boolean result = palindromeChecker.testPalindrome(args, args.length);
		assertFalse(result);
		
	}
	
	@Test
	void returnResultTrueIfPalindrome() {
		
		
		String word = "a man a plan a canal panama";
		
		
		char[] args = palindromeChecker.convertWord(word.replaceAll(" ", "").toCharArray());
		
		
		boolean result = palindromeChecker.testPalindrome(args, args.length);
		assertTrue(result);
		
	}
	
	
	@Test
	void compareListMethodTest() {
		
		Character[] ch1= {'r','a','d','a','r'}; 
		List<Character> value = Arrays.asList(ch1);
		char[] ch2= {'r','a','d','a','r'}; 
		
		assertTrue(palindromeChecker.compare(value, ch2));
	}
	


}
