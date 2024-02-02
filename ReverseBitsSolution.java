class ReverseBitsSolution {
    
	public static void reverseBits(int n) {
        int ans = 0;
        for (int i =0; i < 32; i++){
            ans <<= 1;
			System.out.println(" ans After Left Shift : "+ans);
			ans |= (n & 1);
			System.out.println(" ans After | & Condition : "+ans);
			n >>=1;
			System.out.println(" ans After right Shift  : "+ans);
			System.out.println(" n After right Shift : "+n);
        }
		System.out.println(" ans Final : "+ans);
    }
	
	public static void main(String[] args){
		int n = 43261596;
		reverseBits(n);
		
	}
}