//Implementing Graph Matrix using Depth First Search Back Tracking Recursive

import java.util.List;
import java.lang.Math;

public class GraphMatrixDFS{

	public int dfs(int[][] grid, int r, int c, int[][] visit){
		int ROW = grid.length; int COL = grid[0].length;
		
		if (Math.min(r,c) < 0 || r == ROW || c == COL || visit[r][c] == 1 || grid[r][c] == 1){
			return 0;
		}
		
		if ( (r == ROW - 1) && (c == COL - 1)){
			return 1;
		}		
		visit[r][c] = 1;
		
		int count = 0;
		
		count+= dfs(grid, r+1, c, visit);
		count+= dfs(grid, r-1, c, visit);
		count+= dfs(grid, r, c+1, visit);
		count+= dfs(grid, r, c-1, visit);
		
		visit[r][c] = 0;
		return count;		
	}
}