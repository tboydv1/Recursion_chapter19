import java.util.*;
import java.lang.*;
	
public class Solution {





	  public static int numOffices(String[][] grid) {
	        int result = 1;
	        //Put your code here.

	        int row = 0;
	        int col = 0;
	        
	        //start checking for 1's 
	        for(int i = 0; i <grid.length; i++){

	            for(int j = 0; j < grid[i].length; j++){

	                //if(value @ position == 1)
	            
	                if(grid[i][j].equals(1)){
	                	
	                	System.out.println(grid[i][j]);
	                    result++;
	                    row = checkHorizontal(grid, i, j);
	                    col = checkVertical(grid, i, j);
	                
	                }
	            
	            }

	        
	        }


	        return result;
	    }

	    public static int checkHorizontal(String[][] grid, int row, int col){

	        
	       for(int i = 0; i < grid[row].length; i++){

	                if(grid[row][col].equals(1)){
	                    
	                    checkVertical(grid, row, col);
	                    grid[row][col] = "0";
	                }
	                else
	                     return col;

	                col++;

	        }
	            return 0;

	    }

	    public static int checkVertical(String[][] grid, int row, int col){

	       
	        for(int i = 0; i < grid[row].length; i++){

	                if(grid[row][col].equals(1)){

	                    grid[row][col] = "0";
	                    
	                }
	                else{

	                    return row;
	                }

	                row++;

	        }

	        return 0;

	    }
    
//	}

//	class Rextester
//	{  
	    public static String[][] getMatrix() {
	        Scanner sc = new Scanner(System.in);
	        int rowsLen = sc.nextInt();
	        int colsLen = sc.nextInt();
	        String matrix[][] = new String[rowsLen][colsLen];
	        int i;
	        for(i=0;i<rowsLen;i++){
	            String line = sc.next();
	            for(int j=0;j<line.length();j++) {
	               matrix[i][j] = String.valueOf(line.charAt(j));  
	            }
	        }
	        return matrix;
	    }
	    
	    public static void main(String args[])
	    {
	        int result = Solution.numOffices(getMatrix()); 
	        System.out.println(result);
	    }
	    
	   
	
}
