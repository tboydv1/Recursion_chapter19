package exercise18_12;

import java.util.Scanner;


public class Mystery {

	
	// Exercise 18.12: MysteryClass.java
	public static int mystery(int[] array2, int size) {
		
		
		 if (size == 1) {
			 System.out.println("if-->"+ size + "---->"  + array2[size -1]);
			 return array2[0];
		 }
		 else {
			 System.out.println("else-->"+ (size-1) + "+"  + array2[size -1] );
			 return array2[size - 1] + mystery(array2, size - 1);
			 
		 }
	 }
		
	 public static void main(String[] args) {
//		 
//		 int[] array = {1, 2, 3, 4};
//		
//		 int result = mystery(array, array.length);
//		 System.out.printf("Result is: %d%n", result);
		 
//		 int[] array = {1, 2, 3, 4, 5};
//		 String results = someMethod(array, 0);
//		 System.out.println(results);
		 
		boolean result =  isPalindrome("Deleveled");
		System.out.println(result);
 }
	 
	// Exercise 18.13: SomeClass.java
	 public static String someMethod(int[] array2, int x) {
		 
	 	if (x < array2.length) {
	 		
			System.out.println("---> "+ (x + 1) +"---<"+ x +"> "+ array2[x]);

		  return String.format(
		  "%s%d ", someMethod(array2, x + 1), array2[x]);
		  
		}
		 else {
			 System.out.println("||");
			 return "";
		  }
	}
	 
	
	 public static boolean isPalindrome(String word) {
	   // Please write your code here\.

	   String reversedWord = "";
	   int count = word.length() - 1;

	     for(int i = 0; i < word.length(); i++){

	         reversedWord = reversedWord+""+word.toLowerCase().charAt(count);
//	         System.out.println(word.toLowerCase().charAt(count));
	         count--;
	         
	     }

	     if(reversedWord.equals(word.toLowerCase())){
	    	 
	    	 
	         return true;
	     }
	     else {
	    	 System.out.println(reversedWord + "  " + word.toLowerCase());
	         return false;
	     }


	 }
	
	  
	 		
	  
	  
	 
}
