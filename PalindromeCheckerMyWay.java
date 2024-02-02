public class PalindromeCheckerMyWay {

	public static boolean isPalindrome(int num){
		String numStr = String.valueOf(num);
		String reverse = "";
		for (int i = numStr.length()-1; i>=0; i--){
			reverse = reverse + numStr.charAt(i);
			System.out.println(reverse+" - reverse");
		}
		return reverse.equals(numStr);
	}
	
	public static void main (String[] args){
		int pal = 12345;
		if (isPalindrome(pal)){
			System.out.println(pal+" - Integer is Palindrome");
		}else{
			System.out.println(pal+" - Integer is Not Palindrome");
		}
	}
	
}
