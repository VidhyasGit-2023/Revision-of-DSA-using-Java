//Implementing quick sort

public static int[] quickSort(int[] arr, int s, int e){

	if (e-s+1 <= 1){
		return arr;
	}
	
	int pivot = arr[e];
	int left = s;
	
	for (int i = s; i < e; i++){
		if (arr[i] < pivot){
			int temp = arr[left];
			arr[left] = arr[i];
			arr[i] = temp;
			left++;
		}
	}
	arr[e] = arr[left];
	arr[left] = pivot;
	
	quickSort(arr, s, left-1);
	quickSort(arr, left+1, e);
	
	return arr;

}