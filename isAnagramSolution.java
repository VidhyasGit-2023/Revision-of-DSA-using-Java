import java.util.Arrays; 
class isAnagramSolution {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
			System.out.println(" store 1: "+Arrays.toString(store));
            store[t.charAt(i) - 'a']--;
			System.out.println(" store 2 : "+Arrays.toString(store));
        }

        for (int n : store){
			System.out.println(" n : "+n);
			if (n != 0) return false;
		}
        return true;
    }
	
	public static void main(String[] args){
		String s = "cat";
		String t = "rat";
		
		System.out.println(" isAnagram : "+isAnagram(s,t));
		
	}
}