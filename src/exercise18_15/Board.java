package exercise18_15;

public class Board {

	
	private int[][] floor;
	
	public Board(int floorSize) {
		
		this.floor = new int[floorSize][floorSize];
		
	}
	
	public Board() {
		
		this.floor = new int[8][8];
	}

	public int[][] getFloor() {
		return floor;
	}

	public void setFloor(int[][] floor) {
		this.floor = floor;
	}
	
}
