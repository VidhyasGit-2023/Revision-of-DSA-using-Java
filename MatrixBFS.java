//Implementation of Graph Matrix Breadth First Search to find the shortest root
import java.util.ArrayDeque;
import java.util.Deque;
import java.lang.Math;

public class MatrixBFS{

	// Matrix (2D Grid)
    int[][] grid = {{0, 0, 0, 0},
                    {1, 1, 0, 0},
                    {0, 0, 0, 1},
                    {0, 1, 0, 0}};

	public int bfs(int[][] grid){
		int ROW = grid.length; int COL = grid[0].length;
		int[][] visit = new int[4][4];
		Deque<int[]> queue = new ArrayDeque<>();
		
		visit[0][0] = 1;
		queue.add(new int[2]);
		int length = 0;
		
		while (!queue.isEmpty()){
			int queueLength = queue.size();
			for (int i=0; i< queueLength; i++){
				int[] pair = queue.poll();
				int r = pair[0], c = pair[1];
				if ((r == ROW - 1) && (c == COL - 1)){
					return length;
				}
				
				int[][] neighbors = {{r,c+1},{r,c-1},{r+1,c},{r-1,c}};
				for (int j = 0; j < 4; j++){
					int newR = neighbors[j][0], newC = neighbors[j][1];
					if (Math.min(newR, newC) < 0 || newR == ROW || newC == COL || visit[newR][newC] == 1 || grid[newR][newC] == 1){
						continue;
					}
					queue.add(neighbors[j]);
					visit[newR][newC] = 1;
				}
				
			}
			length++;
		}
		return -1;//This will not be reached
	}



}