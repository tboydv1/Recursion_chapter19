package examples;

public class TowersOfHanoi {

	//recursively move disks between towers
	public static void solveTowers(int disks, String sourcePeg, String destinationPeg, String tempPeg) {
		
		//base case--only one disk to move
		
		if(disks == 1) {
			
			System.out.printf("%n%s --> %s", sourcePeg, destinationPeg);
			
			return;
		}
		
		//recursion step -- move (disk - 1) disks from sourcePeg
		//to tempPeg using destinationPeg
		solveTowers(disks - 1, sourcePeg, tempPeg, destinationPeg);
		
		//move last disk from sourcePeg to destinationPeg
		System.out.printf("%n%s --> %s", sourcePeg, destinationPeg);
		
		
		//move(disks-1) disks from tempPeg to destinationPeg
		solveTowers(disks - 1, tempPeg, destinationPeg, sourcePeg);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String startPeg = "S"; //value 1 used to indicate startPeg in outPut
		String endPeg = "E"; //value 3 used to indicate endpeg in output
		String tempPeg = "T"; //value 2 used to indicate endPeg in output
		int totalDisks = 2;
		
		//initial nonrecursive call: move all disks
		solveTowers(totalDisks, startPeg, endPeg, tempPeg);
		
		System.out.println("\n"+sum(10));
		
		
		
	}
	
	public static int sum(int n) {
		
		System.out.println("\n"+n);
		if(n == 0) {
			return 0;
		}
		else {
			return n + sum(n - 1);
		}
	}

}
