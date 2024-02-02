class LinearSearchArray{
	
	public static int searchAnElement(int[] arr, int size, int element){
		
		for (int i = 0; i < arr.length; i++){
			if ( arr[i] == element){
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args){
		int[] arr = {2,4,6,8,10,13,16,18};
		int find = 10;
		
		int result = searchAnElement(arr, arr.length, find);
		System.out.println(" Array Length :"+ arr.length );
		
		if (result == -1){
			System.out.println(" Given element is not in any of the index");
		}else{
			System.out.println(" Given element - '"+find+"' is in the index - "+result);
		}
	}


}