//Iterative Method used for implementing Insertion Sort
class InsertionSortArray{

	public static int[] insertionSort(int[] arr){
		for (int i = 1; i< arr.length;i++){
			int j = i-1;
			while ((j >= 0) && (arr[j+1] < arr[j])){
				int temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
		return arr;
	}
}