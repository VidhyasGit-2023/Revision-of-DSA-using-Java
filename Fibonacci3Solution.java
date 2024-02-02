//Fibonacci = F(0) = 0 & F(1) = 1 & F(n) = F(n-1) + F(n-2)
class Fibonacci3Solution{

	//Fibonaaci Solving using RecursiveAction
	public int fibanocci(int n){
		if (n <= 1){
			return n;
		}
		return fibanocci(n-1) + fibanocci(n-2);
	}
	
	//Fibonaaci Solving using Memoziation - Top Down Approach by caching the repititive steps
	public int fibMemoziation(int n, int[] cache){
		if (n <= 1){
			return n;
		}
		if (cache[n] != 0){
			return cache[n];
		}
		cache[n] = fibMemoziation(n-1, cache) + fibMemoziation(n-2, cache);
		return cache[n];		
	}
	
	//Fibonaaci Solving using Dynamic Programming DP - Bottom up Approach by saving menory space
	public int fibBottomUp(int n){
		if (n < 2){
			return n;
		}
		int[] dp = {0,1}
		int i = 2;
		while (i <= n){
			int tmp = dp[1];
			dp[1] = dp[0] + dp[1];
			dp[0] = tmp;
			i++;
		}
		return dp[1];
	}

}