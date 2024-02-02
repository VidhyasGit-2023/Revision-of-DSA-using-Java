//check-if-pair-with-given-sum-exists-in-array
import java.util.*;
class CheckPairSumExists{
	
	public static boolean sumExistsInArray(int[] arr, int high, int match){
		int low = 0;
		//*****Always Always Please Sort the array before doing any operation because it improves the efficiency and correctness******
		Arrays.sort(arr);
		
		//Check the Edge Cases
		if (high == 0 || match == 0 || low > high){
			return false;
		}
		System.out.println(" low :"+low);
		System.out.println(" high :"+high);
		while(low < high){
			if ((arr[low] + arr[high]) == match){
				return true;
			}else if ((arr[low] + arr[high]) < match){
				low++;
			}else{
				high--;
			}
		}
		return false;
		
	}
	
	
	
	
	public static void main(String[] args){
		
		int[] arr = {1,4,45,6,10,-8};
		
		int match = 16;
		
		int high = arr.length-1;
		System.out.println(" high :"+high);
		
		boolean matchResult = sumExistsInArray(arr,high,match);
		
		System.out.println(" matchResult :"+matchResult);
	}


}