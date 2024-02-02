//Counting Unique Paths
class CountUniquePaths{

	//Counting unique path using dfs brutte force Recursive Approach - Starting position r & c and the grid dimension - O(2^m+n) 
	public int brutteForceRecursive(int r, int c, int ROWS, int COLS){
		//Checking edge case
		if ( r == ROWS || c == COLS){
			return 0;
		}
		//Checking base case
		if ( r == ROWS - 1 && r == COLS - 1){
			return 1;
		}
		
		return brutteForceRecursive((r+1), c, ROWS, COLS) + brutteForceRecursive(r, (c+1), ROWS, COLS);
	}
	//To make it efficient use Memoziation - Top Down Approach - O(m*n)
	public int memoziationApp(int r, int c, int ROWS, int COLS, int[][] cache){
		//Checking edge case
		if ( r == ROWS || c == COLS){
			return 0;
		}
		//If it exists in cache then return it
		if (cache[r][c] > 0){
			return cache[r][c];
		}
		//Checking base case
		if ( r == ROWS - 1 && r == COLS - 1){
			return 1;
		}
		cache[r][c] = memoziationApp((r+1),c,ROWS, COLS, cache) + memoziationApp(r,(c+1),ROWS,COLS,cache);
		return cache[r][c];		
	}
	
	//To count unique path using Bottom up approach which is O(n*M) and space O(m) - m - Grid columns
	
	public int bottomUpDp(int row, int col){
		int[] prevRow = new int[col];
		
		for (int i = row - 1; i>=0;i--){
			int[] currRow = new int[col];
			currRow[col-1] = 1;
			for (int j = col - 2; j >=0;j++){
				currRow[j] = currRow[j+1] + prevRow[j];
			}
			currRow = prevRow;
		}
		return currRow[0];
	}
}
