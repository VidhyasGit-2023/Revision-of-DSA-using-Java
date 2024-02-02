//Implementing Subsets using backtracking depth First Search
import java.util.*;
class SubsetsSolution {
	
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
		int i = 0;
        dfs(res, nums, list, 0, i);
        return res;
    }

    public static void dfs(List<List<Integer>> ans, int[] nums, List<Integer> list, int start, int count){
		count = count + 1;
        System.out.println("Inside dfs Method and No of ith time call is made :"+count);
		System.out.println("Start Value Before If Loop :"+start);
        if (start >= nums.length){
            ans.add(new ArrayList<>(list));
			System.out.println("Start Value Inside If :"+start);
			System.out.println("list Value Inside If :"+list);
        }else{
			//first add the element case
            list.add(nums[start]);
			System.out.println("Start Value Inside else After adding an element :"+start);
			System.out.println("list Value Inside else After adding an element :"+list);
            dfs(ans, nums, list, start+1, count);
			System.out.println("Start Value Inside else After calling Recursive in add element section :"+start);
			System.out.println("list Value Inside else After calling Recursive in add element section :"+list);

            //second remove the element case
            list.remove(list.size()-1);
			System.out.println("Start Value Inside else After removing last element :"+start);
			System.out.println("list Value Inside else After removing last element :"+list);
            dfs(ans, nums, list, start+1, count);
			System.out.println("Start Value Inside else After calling Recursive in after remove section :"+start);
			System.out.println("list Value Inside else After calling Recursive in after remove section :"+list);
        }
    }
	
	public static void main(String[] args){
		int[] nums = {1,2,3};
		List<List<Integer>> result = new ArrayList<>();
		
		result = subsets(nums);
		System.out.println("Final Result :"+result);
		
	}
}