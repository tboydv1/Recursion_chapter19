package exercise18_15;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EightQueensRecursiveProgramTest {

	Board chessBoard;
	Queen[] tempQueens  = {
			
			new Queen(),
			new Queen(),
			new Queen(),
			new Queen(),
			new Queen(),
			new Queen(),
			new Queen(),
			new Queen()
			
	};
	
	
	EightQueensRecursiveProgram tempQueenPuzzleProgram;
	List<Queen> eightQueenPieces;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		chessBoard = new Board();
		
		eightQueenPieces = Arrays.asList(tempQueens);
		
		tempQueenPuzzleProgram = new EightQueensRecursiveProgram(eightQueenPieces, chessBoard);
		
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void classesInitializedTest() {
		
		assertNotNull(chessBoard);
		assertNotNull(tempQueenPuzzleProgram);
		assertNotNull(eightQueenPieces);
		
	}
	
	@Test
	void searchColumnsOnChessBoardTest() {
		
		tempQueenPuzzleProgram.placeEightQueens(0, 6);
		
		
		displayBoard();
	}

	public void displayBoard() {
		
		for(int i = 0; i < chessBoard.getFloor().length; i++) {
			for(int j = 0; j < chessBoard.getFloor()[i].length; j++) {
				System.out.print(chessBoard.getFloor()[i][j] + "  ");
			}
			
			System.out.println();
		}
	}

}
