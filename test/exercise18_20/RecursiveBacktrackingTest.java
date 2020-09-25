package exercise18_20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercise18_20.RecursiveBacktracking.Direction;

class RecursiveBacktrackingTest {

	Maze mazePuzzle;
	
	RecursiveBacktracking program;
	
	@BeforeEach
	void setUp() throws Exception {
		
		program = new RecursiveBacktracking();
		mazePuzzle = new Maze();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void displaymazeTest() throws InterruptedException {
		
		assertNotNull(mazePuzzle);
		
		for(int i = 0; i < mazePuzzle.getMaze().length; i++) {
			
			for(int j = 0; j < mazePuzzle.getMaze()[i].length; j++) {
				
				System.out.print(mazePuzzle.getMaze()[i][j]);
			}
			System.out.println();
		}
		
		assertEquals(12, mazePuzzle.getMaze().length);
		
		
	}
	
	@Test
	void backTrackingTest() throws InterruptedException {
		
		program.mazeTraversal(mazePuzzle, mazePuzzle.getEntryPoint()[0], mazePuzzle.getEntryPoint()[1]);
	}
	

	

}
