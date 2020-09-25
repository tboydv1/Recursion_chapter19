package exercise18_20;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RecursiveBacktracking {
	
	private Random rn = new Random();
	
	public enum Direction {
		UP, LEFT, DOWN, RIGHT, BACKUP
	}
	
	Direction validMove;
	Integer[] newSpot = new Integer[2];
	List<Integer[]> visitedSquares = new ArrayList<>();
	

	
	public Maze mazeTraversal(Maze maze, int currentRow, int currentCol) throws InterruptedException {
		
		validMove = chooseRandomMove(findPossibleMoves(maze.getMaze(), currentRow, currentCol));
		
			newSpot = getNewSpot(maze.getMaze(), validMove, currentRow, currentCol);
		
		
			maze.getMaze()[currentRow][currentCol] = 'x';
			
			
			if(validMove != Direction.BACKUP) {
				
				displayMaze(maze);
				
				visitedSquares.add(newSpot); //store previous positions
				mazeTraversal(maze, newSpot[0], newSpot[1]);
	
			}
			else {
								
				//get the current square and move one step backward
				displayMaze(maze);
				
				newSpot = backTrack(maze.getMaze());
				mazeTraversal(maze, newSpot[0], newSpot[1]);
				
			}
			
			return maze;
		
	}
	
	public List<Direction> findPossibleMoves(Character[][] maze, int row, int col) {
		
		
		List<Direction> moves = new ArrayList<>();
		//try moving forward
		if(isValidMove(maze, row, col + 1)) {
					
				if((maze[row][col + 1].equals('.'))){
					System.out.println("right move");
					
					moves.add(Direction.RIGHT);
				
				}
			
		}
		
		if(isValidMove(maze, row + 1, col)) {
			
		
			if((maze[row + 1][col].equals('.'))) {
				System.out.println("down move");
				
				moves.add(Direction.DOWN);
				
			}
		}
		 
		if(isValidMove(maze, row -1, col)) {
			
			if((maze[row - 1][col].equals('.'))) {
				
				System.out.println("up move");
				moves.add(Direction.UP);
			}
		}
		 
		if(isValidMove(maze, row, col -1)) {
			
			if((maze[row][col - 1].equals('.'))) {
				System.out.println("left move");
				
				moves.add(Direction.LEFT);
			}
		}
		
		return moves;
		
		
	}
	
	public Direction chooseRandomMove(List<Direction> possibleMoves) {
		
		if(!possibleMoves.isEmpty()) {
			int x = rn.nextInt(possibleMoves.size());
			
			return possibleMoves.get(x);
		}
		else 
			return Direction.BACKUP;
	}
	
	
	
	public boolean isValidMove(Character[][] maze, int row, int col) {
		
		if(row > maze.length || row < 0) {
			
			return false;
		}
		else if(col > maze.length || col < 0){
			
			return false;
		}
		else 
			return true;
		
	}
	
	public Integer[] getNewSpot(Character[][] maze, Direction direction, Integer row, Integer col) {
		
		Integer[] newPosition = new Integer[2];
		
		if(direction == Direction.RIGHT) {
			newPosition[0] = row;
			newPosition[1] = col + 1;
		}
		else if(direction == Direction.DOWN) {
			
			newPosition[0] = row + 1;
			newPosition[1] = col ;
		}
		else if(direction == Direction.UP) {
					
			newPosition[0] = row - 1;
			newPosition[1] = col;
		}
		else if(direction == Direction.LEFT) {
			
			newPosition[0] = row;
			newPosition[1] = col-1;
		}
		else {
			newPosition[0] = row;
			newPosition[1] = col;
		}
		
		return newPosition;
	}
	
	public void displayMaze(Maze mazePuzzle) {
		
		for(int i = 0; i < mazePuzzle.getMaze().length; i++) {
			
			for(int j = 0; j < mazePuzzle.getMaze()[i].length; j++) {
				
				System.out.print(" "+mazePuzzle.getMaze()[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
	}
	
	public Integer[] backTrack(Character[][] maze) {
		//go to previous square
		
		//find posible valid moves not 'x'
		
		//if no valid moves mark as dead path 'o'
		
		//move backward one more step 
		
		//repeat steps 2 and 3
		
		//if valid moves from current position
		
		//return position
		
		List<Direction> possibleDir = new ArrayList<>();
		Integer[] position = new Integer[2];

		for(int i = visitedSquares.size() - 1; i >= 0; i--) {
			
			possibleDir = findPossibleMoves(maze, visitedSquares.get(i)[0], visitedSquares.get(i)[1]);
			
			
			if(possibleDir.isEmpty() == false) {
				
				
				for(Direction direction : possibleDir) {
					
					
					position = getNewSpot(maze, direction, visitedSquares.get(i)[0]	, visitedSquares.get(i)[1]);
					
					if((maze[position[0]][position[1]].equals('.'))) {
						
						return position;
					}
				}
			}
						
		maze[visitedSquares.get(i)[0]][visitedSquares.get(i)[1]] = 'o';
		
		}

		return null;
	}
	
	
	
	
	
	
	
}
