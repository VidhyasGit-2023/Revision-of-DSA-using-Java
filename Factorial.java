//Recursion Implementation for n! (n-factorial) calculation
public class Factorial{
	
	//Recursive Method
	public static int factorial(int n){
		if (n <= 1){
			return 1;
		}
		return n * factorial(n-1);
	}
	
	//Iteration
	public static int factorial(int n){
		//int n = 5;
		int res = 1;
		while (n > 1){
			res = res * n;
			n--;
		}
		return res;
	}
}