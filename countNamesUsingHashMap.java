//Implementing HashMap

import java.util.HashMap;

class countNamesUsingHashMap{

	public static void main(String[] args){
		String[] names = {"vidhya","sindu","nagu","sindu","janu","priya","vijay"};

		HashMap<String,Integer> hashMap = new HashMap<>();
		
		for (String name : names){
			if (!hashMap.containsKey(name)){
				hashMap.put(name, 1);
			}else{
				hashMap.put(name, hashMap.get(name) + 1);
			}
		}
		System.out.println("Final Hashmap :"+hashMap);

	}
}