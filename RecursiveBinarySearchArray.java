class RecursiveBinarySearchArray{
	
	int binarySearch(int[] arr, int element, int beg, int end){

		while(beg <= end){
			int mid = beg + (end - beg)/2;

			if (arr[mid] == element){
				return mid;
			}
			
			if (arr[mid] < element) {
				return binarySearch(arr, element, mid + 1, end);
			}else{
				return binarySearch(arr, element, beg, mid - 1);
			}
		}
		return -1;
	}
	
	public static void main(String[] args){
		int[] arr = {2,4,6,8,10,13,16,17,19};
		int x = 10;
		int len = arr.length - 1;
		
		RecursiveBinarySearchArray bs = new RecursiveBinarySearchArray();
		int result = bs.binarySearch(arr, x, 0, len);
		
		if (result == -1){
			System.out.println(" Given element is not in any of the index");
		}else{
			System.out.println(" Given element - '"+x+"' is in the index - "+result);
		}
		
	}
	
}