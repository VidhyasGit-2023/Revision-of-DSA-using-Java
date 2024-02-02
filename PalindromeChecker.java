public class PalindromeChecker {
	
	public static boolean isPalindrome(int number){
		int original = number;
		int reverse = 0;
		System.out.println(number+" - number");
		while (number > 0){
			int digit = number % 10;
			System.out.println(digit+" - digit");
			reverse = (reverse * 10) + digit;
			System.out.println(reverse+" - reverse");
			number = number / 10;
			System.out.println(number+" - number");
		}
		System.out.println(reverse+" - reverse");
		System.out.println(original+" - original");
		return (reverse == original);
	}
	
	public static void main(String[] args){
		int number = 454;
		if (isPalindrome(number)){
			System.out.println(number+" - Integer is Palindrome");
		}else{
			System.out.println(number+" - Integer is Not Palindrome");
		}
	}
}

