//Implementation of Binary Min Heap
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Heap{

	List<Integer> heap;
	
	public Heap(){
		heap = new ArrayList<Integer>();
		heap.add(0);
	}
	
	// Parent = i/2;
	//LeftChild = i*2;
	//RightChild = i*2 + 1;
	
	public void push(int val){
		//First add the value at the last
		heap.add(val);
		int i = heap.size() - 1;
		
		//Percolate from down to up
		while(i > 1 && heap.get(i) < heap.get(i/2)){
			int tmp = heap.get(i);
			heap.set(i, heap.get(i/2));
			heap.set(i/2, tmp);
			i = i / 2;
		}
		
	}
	
	public int pop(){
		
		if (heap.size() == 1){
			return -1;
		}
		
		if (heap.size() == 2){
			return heap.remove(heap.size() - 1);
		}
		
		int res = heap.get(1);
		
		heap.set(1, heap.remove(heap.size() - 1));
		int i = 1;
		//percolate from up to down
		while (i*2 < heap.size()){
			if (i*2+1 < heap.size() && heap.get(i*2+1) < heap.get(i*2) && heap.get(i) > heap.get(i*2+1)){
				int tmp = heap.get(i);
				heap.set(i, heap.get(i*2+1));
				heap.set(i*2+1, tmp);
				i = i*2+1;
			} else if (heap.get(i) > heap.get(i*2)){
				int tmp = heap.get(i);
				heap.set(i, heap.get(i*2));
				heap.set(i*2, tmp);
				i = i*2;
			}else{
				break;
			}
		}
		return res;		
	}
	
	public void heapify(ArrayList<Integer> arr){
			
			//Heap doesn't use the 0th position so its been moved to last in the array
			arr.add(arr.get(0));
			
			//Copy the array into Heap
			heap = arr;
			
			//Percolate can start from the mid position as the remaining nodes are fine
			int curr = (heap.size() - 1)/ 2;
			while(curr > 0){
				int i = curr;
				while (i*2 < heap.size()){
					if (i*2+1 < heap.size() && heap.get(i*2+1) < heap.get(i*2) && heap.get(i) > heap.get(i*2+1)){
						int tmp = heap.get(i);
						heap.set(i, heap.get(i*2+1));
						heap.set(i*2+1, tmp);
						i = i*2+1;
					} else if (heap.get(i) > heap.get(i*2)){
						int tmp = heap.get(i);
						heap.set(i, heap.get(i*2));
						heap.set(i*2, tmp);
						i = i*2;
					}else{
						break;
					}
				}
				curr--;				
			}
			return;
	}
}
