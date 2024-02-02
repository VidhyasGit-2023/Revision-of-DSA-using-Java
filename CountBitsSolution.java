class CountBitsSolution {
    
	public static int[] countBits(int n) {
        int[] res = new int[n+1];
        for (int i =1; i <= n; i++){
            res[i] = 1 + res[i & (i-1)];
			System.out.println(" bitCount - i : "+Integer.toBinaryString(i));
			System.out.println(" bitCount - i - 1 : "+Integer.toBinaryString(i - 1));
			System.out.println(" res[i & (i-1) : "+res[i & (i-1)]);
			System.out.println(" res[i] : "+res[i]);
        }
        return res;
    }
	
	public static void main(String[] args){
		int n = 5;
		int[] arr = countBits(n);
		
	}
}