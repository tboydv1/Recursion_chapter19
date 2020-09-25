package exercise18_15;

public class Queen {

	private int row = 0;
	
	private int column = 0;
	
	
	public Queen() {
		
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	@Override
	public String toString() {
		return "Queen [row=" + row + ", column=" + column + "]";
	}
	
	

	
}
