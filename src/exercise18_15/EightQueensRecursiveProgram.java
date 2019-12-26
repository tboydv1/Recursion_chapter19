package exercise18_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EightQueensRecursiveProgram {

	
	private List<Queen> queenPieces;
	private Board chessBoard;
	private int row;
	private int col;
	
//	int[] rowValues = {0,1,2,3,4,5,6,7};
	
	private List<Integer> visitedRows = new ArrayList<>();
	
	
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public EightQueensRecursiveProgram(List<Queen> eightQueens, Board chessBoard) {
		
		this.queenPieces = eightQueens;
		this.chessBoard = chessBoard;
	}

	public int searchRow(int row, int col) {
		
		
		if(getChessBoard().getFloor()[row][col] == 0) {
			
			setRow(row);
			setCol(col);
			
			System.out.println("Found!!" +" "+row+" "+col +" \n");
			
			return col;
		
		}
		else {
			
			if(col == getChessBoard().getFloor().length -1) {
				
				System.out.println("Max!!" +" "+row+" "+col +" \n");
				
				if(row < getChessBoard().getFloor().length - 1) {
					row += 1;
					col = 0;
				}
				else {
					return -1;
				}
				
				
			}
				
			return searchRow(row, col + 1);
		
		}
		
	}
	
	
	
	
	
	public void placeEightQueens(int initialRow, int initialCol) {
		
		int tempCol= initialCol, tempRow = initialRow;
		
		int piecesCount = 7;
		
		
		while(piecesCount > 0) {
		
			//get first queen piece
			Queen currentQueenPiece = queenPieces.get(piecesCount);
		
			//set piece on board
			if(tempCol != -1) {
				currentQueenPiece.toString();
				setQueenOnChessBoard(currentQueenPiece, tempRow, tempCol);
				
			}
			else {
				
				System.out.println(piecesCount + " " + "remaining pieces is: ");
				break;
			}
			
			displayBoard();
			
			
			searchRow(tempRow, tempCol);
			
			tempRow = getRow();
			tempCol = getCol();
			
			piecesCount--;
			
			System.out.println((piecesCount + 1) + " " + "remaining pieces is: ");

		}
			
			

	}
	
	
	
	public void setQueenOnChessBoard(Queen queenPiece, int row, int column) {
		
		
		//get board lenght
		int boardLength = getChessBoard().getFloor().length;
		
		//set queen position
		queenPiece.setRow(row);
		
		queenPiece.setColumn(column);
		
		System.out.println(queenPiece.toString());
		
		//initialize columns on row
		initializeColumns(row, boardLength);
		
		//intialize rows
		initializeRows(column, boardLength);
		
		//initialize diagonals
		initializeDiagonals(row, column);
			
	}

	public void initializeRows(int column, int boardLength) {
		int tempRow;
		int tempCol;
		tempCol = column;
		tempRow = 0;
		for(int i= 0; i < boardLength; i++) {
			
			getChessBoard().getFloor()[tempRow][tempCol] = 1;	
		
			tempRow++;
		}
	}

	public void initializeColumns(int row, int boardLength) {
		int tempRow = row;
		int tempCol = 0;
		
		for(int i= 0; i < boardLength; i++) {
			
			getChessBoard().getFloor()[tempRow][tempCol] = 1;	
		
			tempCol++;
		}
	}
	
	
	
	private void initializeDiagonals(int row, int col) {
		
		//find number of squares from current position
		int count = getChessBoard().getFloor().length - row;
		int boardLength = getChessBoard().getFloor().length;
		
		int tempR1 = row, tempC1 = col;
		int tempR2 = row, tempC2 = col;
		int tempR3 = row, tempC3 = col;
		int tempR4 = row, tempC4 = col;
		
		//create loop to initialize diagonal squares
		while(count >= 0) {
			
			
			//bottom right
			if(tempR4 < boardLength && tempC4 < boardLength) {

				getChessBoard().getFloor()[tempR4][tempC4] = 1;
				tempC4++;tempR4++;
			}
			
			//bottom left
			if(tempR3 < boardLength && tempC3 >= 0) {

				getChessBoard().getFloor()[tempR3++][tempC3--] = 1;
			}
			
			//top right
			if(tempR2 >= 0 && tempC2 < boardLength) {

			getChessBoard().getFloor()[tempR2--][tempC2++] = 1;
			}
			
			//top left
			if(tempR1 >= 0 && tempC1 >= 0) {

			getChessBoard().getFloor()[tempR1--][tempC1--] = 1;
			}
			
			count--;
		}
		
		
		
	}
	
	public void displayBoard() {
			
			for(int i = 0; i < chessBoard.getFloor().length; i++) {
				for(int j = 0; j < chessBoard.getFloor()[i].length; j++) {
					System.out.print(chessBoard.getFloor()[i][j] + "  ");
				}
				
				System.out.println();
			}
		}

	public List<Queen> getQueenPieces() {
		return queenPieces;
	}



	public void setQueenPieces(List<Queen> queenPieces) {
		this.queenPieces = queenPieces;
	}



	public Board getChessBoard() {
		return chessBoard;
	}



	public void setChessBoard(Board chessBoard) {
		this.chessBoard = chessBoard;
	}	
	
}
