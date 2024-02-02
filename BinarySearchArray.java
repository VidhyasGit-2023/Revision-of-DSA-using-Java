class BinarySearchArray{
	
	int binarySearch(int[] arr, int element){
		int l = 0;
		int r = arr.length - 1;
		System.out.println(" r : "+r);
		System.out.println(" l : "+l);
		while(l <= r){
			int m = l + (r - l)/2;
			System.out.println(" m : "+m);
			System.out.println(" arr[m] :"+ arr[m]);
			if (arr[m] == element){
				return m;
			}
			
			if (arr[m] < element) {
				l = m + 1;
			}else{
				r = m - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args){
		int[] arr = {2,4,6,8,10,13,16,17,19};
		int x = 10;
		
		BinarySearchArray bs = new BinarySearchArray();
		int result = bs.binarySearch(arr, x);
		
		if (result == -1){
			System.out.println(" Given element is not in any of the index");
		}else{
			System.out.println(" Given element - '"+x+"' is in the index - "+result);
		}
		
	}
	
}