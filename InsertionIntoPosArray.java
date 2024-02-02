class InsertionIntoPosArray{
	
	public static void insertInToThisPos(int[] arr, int n, int pos, int key){
		
		//Shifting the data elements by one position in the array with in the loop
		for (int i = n-1;i>= pos; i--){
			arr[i+1] = arr[i];
		}
		//inserting the new value into the corresponding position
		arr[pos] = key;
	}
	
	public static void main(String[] args){
		int[] arr = new int[15];
		arr[0] = 2;
		arr[1] = 5;
		arr[2] = 7;
		arr[3] = 9;
		arr[4] = 12;
		arr[5] = 16;
		int n = 6; int pos = 3;
		int key = 8;
		
		System.out.println(" Before Insertion ");
		
		for (int i = 0; i < n; i++){
			System.out.println(" Before Insertion Array : "+ arr[i]);
		}
		
		insertInToThisPos(arr, n, pos, key);
		n = n + 1;
		
		System.out.println(" After Insertion ");
		
		for (int i = 0; i < n; i++){
			System.out.println(" After Insertion Array : "+ arr[i]);
		}
		
		
	}


}