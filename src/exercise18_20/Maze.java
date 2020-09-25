package exercise18_20;

import java.util.Arrays;

public class Maze {

	private int[] entryPoint = {2, 0};
	
	private Integer[] exitPoint = {4, 11};


	Character[][] maze = 		
		{{'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
		{'#', '.', '.', '.', '#', '.', '.', '.', '.', '.', '.', '#'},
		{'.', '.', '#', '.', '#', '.', '#', '#', '#', '#', '.', '#'},
		{'#', '#', '#', '.', '#', '.', '.', '.', '.', '#', '.', '#'},
		{'#', '.', '.', '.', '.', '#', '#', '#', '.', '#', '.', '.'},
		{'#', '#', '#', '#', '.', '#', '.', '#', '.', '#', '.', '#'},
		{'#', '.', '.', '#', '.', '#', '.', '#', '.', '#', '.', '#'},
		{'#', '#', '.', '#', '.', '#', '.', '#', '.', '#', '.', '#'},
		{'#', '.', '.', '.', '.', '.', '.', '.', '.', '#', '.', '#'},
		{'#', '#', '#', '#', '#', '#', '.', '#', '#', '#', '.', '#'},
		{'#', '.', '.', '.', '.', '.', '.', '#', '.', '.', '.', '#'},
		{'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}};
	
	
	public Character[][] getMaze() {
		return maze;
	}

	public void setMaze(Character[][] maze) {
		this.maze = maze;
	}
	
	public int[] getEntryPoint() {
		return entryPoint;
	}


	public void setEntryPoint(int[] entryPoint) {
		this.entryPoint = entryPoint;
	}

	public Integer[] getExitPoint() {
		return exitPoint;
	}

	public void setExitPoint(Integer[] exitPoint) {
		this.exitPoint = exitPoint;
	}
	
	
	
	

}
