package exercise18_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursivePalindrome {

	List<Character> reversedChar = new ArrayList<>();
	
	
	public boolean testPalindrome(char[] letters, int x) {
		
		
		
		if(reversedChar.size() == letters.length) {
			System.out.println("Running1");
			reversedChar.forEach(System.out::print);
			
			if(compare(reversedChar, letters)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			System.out.println((x -1) + "--->");
			reversedChar.add(letters[x -1]);
			return testPalindrome(letters, x -1);
		}
		
		
	}
	
	public boolean compare(List<Character> value, char[] value2) {
		
	
		for(int i = 0; i < value2.length; i++) {
			
			if(Character.isWhitespace(value2[i]) == false) {
				if(value2[i] != value.get(i)) {
					return false;
				}
			}
			else 
				continue;
		}
		return true;
	}
	
	public char[] convertWord(char[] input) {
		
		char[] result = new char[input.length];
		int counter = 0;
		
		for(int i = 0; i < input.length; i++) {
			
			if(Character.isLetter(input[i])) {
				result[counter] = input[i];
				System.out.println("running  " + input[i] + " " + i +"--"+ counter+ result[counter]);
				counter++;
			}
		}
		
		
		return result;
	}
	
	
}
