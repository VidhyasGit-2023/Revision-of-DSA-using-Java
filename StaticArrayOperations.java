class StaticArrayOperations{
	
	//Static Array Read/Write Operation When Index is know - O(1) If not known then its - O(n) - n - size of the array
	public static void staticArrayReadWrite(int[] arr) throws Exception {
		
		for (int i = 0; i< arr.length; i++){
			System.out.println("Static Array Elements :"+arr[i]);
		}
	}
	
	//Removing the last element from the static arry is simple and it takes O(1) constant time
	public static int[] staticArrayRemoveLast(int[] arr, int length) throws Exception {
		
		if (length > 0) {
			arr[length - 1] = 0;
			length--;
		}
		
		return arr;
	}
	
	//Inserting New Element in the Last position is simple and it takes O(1) constant time
	public static int[] staticArrayInsertLast(int[] arr, int capacity, int newElement, int len) throws Exception {
		
		if (len < capacity){
			arr[len] = newElement;
		}
		return arr;
	}
	
	//Removing an element from the middle of Static array is a bit complex because next element has to be shifted therefore it takes O(n) based on //n size where n is the size of the array
	//assuming remIndex is a valid index
	//Understood that a new array had to be created in order to see the changes without duplicate values though the commented code also works
	public static int[] staticArrayRemoveMiddle(int[] arr, int remIndex, int l) throws Exception {
		
		for (int i = remIndex+1; i < l; i++){
			arr[i-1] = arr[i];
		}
		
		/*
		int[] newArray = new int[l-1];
		int k = 0;
		
		for (int i = 0; i < l; i ++){
			if (i != remIndex){
				
				newArray[k] = arr[i];
				k++;
			}
			
		}*/
		return arr;
		
	}
	
	//Inserting an element from the middle of Static array is a bit complex because next element has to be shifted and then it needs to be inserted //therefore it takes O(n) based on n size where n is the size of the array
	//assuming insIndex is a valid index
	
	public static int[] staticArrayInsertMiddle(int[] arr, int insIndex, int value, int l) throws Exception {
		System.out.println("length - 1 :"+l);
		System.out.println("insIndex - 1 :"+insIndex);
		for (int i = l-1; i > insIndex-1; i--){
			arr[i+1] = arr[i];
		}
		arr[insIndex] = value;
		return arr;
	}
	
	public static void main(String[] args){
		try{
			int[] myArray = {2, 4, 6, 8, 9};
			int length = myArray.length;
			int remIndex = 2;
			int newElement = 10;
			
			int insIndex = 2;
			int value = 6;
			
			staticArrayReadWrite(myArray);
			myArray = staticArrayRemoveLast(myArray, length);
			System.out.println("Print New Array after removing Last element :");
			staticArrayReadWrite(myArray);
			
			length = myArray.length;
			System.out.println("length after removing last element :"+length);
			myArray = staticArrayInsertLast(myArray, length, newElement, length-1);
			System.out.println("Print New Array after inserting New element at Last:");
		    staticArrayReadWrite(myArray);
			
			length = myArray.length;
			System.out.println("length after inserting last element :"+length);
			myArray = staticArrayRemoveMiddle(myArray, remIndex, length);
			System.out.println("Print New Array after removing a middle element :");
			staticArrayReadWrite(myArray);

			myArray = staticArrayInsertMiddle(myArray, insIndex, value, myArray.length-1);
			System.out.println("Print New Array after Inserting a middle element :");
			staticArrayReadWrite(myArray);
			
			System.out.println("Completed Static Array Topics :");
		}catch (Exception e) {
            e.printStackTrace();
        }
	}
		
}