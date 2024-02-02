public class StringPalindromeChecker {

	public static String reverseString(String str){
		String reverse = "";
		for (int i = str.length()-1; i>=0; i--){
			reverse = reverse + str.charAt(i);
			System.out.println(reverse+" - reverse");
		}
		return reverse;
	}
	
	public static void main (String[] args){
		String pal = "Hello";
		String reverseStr = reverseString(pal);
		System.out.println(reverseStr+" - reverseString");
	}
	
}
