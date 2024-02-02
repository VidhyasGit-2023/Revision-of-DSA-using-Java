class InsertionArray {
	
	public static int insertElement(int[] arr, int n, int capacity, int key){
		
		if (n > capacity){
			System.out.println(" Cannot Insert ");
			return n;
		}
		
		arr[n] = key;
		
		return n + 1;
		
	}
	
	public static void main(String[] args){
		
		int[] arr = new int[20];
		arr[0] = 4;
		arr[1] = 7;
		arr[2] = 10;
		arr[3] = 14;
		arr[4] = 18;
		arr[5] = 22;
		int n = 6;
		int capacity = 20;
		int key = 25;
		int i;
		
		System.out.println(" Before Insertion ");
		
		for (i = 0; i < n; i++){
			System.out.println(" Before Insertion Array : "+ arr[i]);
		}
		
		n = insertElement(arr, n, capacity, key);
		
		System.out.println(" After Insertion ");
		
		for (i = 0; i < n; i++){
			System.out.println(" After Insertion Array : "+ arr[i]);
		}
		
		
	}
	
	
}

