//Implementation of HashMap
class Pair{
	
	String key;
	String value;
	
	public Pair(String key, String value){
		this.key = key;
		this.value = value;
	}		
}

class HeapMap{
	
	int size;
	int capacity;
	Pair[] map;
	
	public HeapMap(){
		this.size = 0;
		this.capcity = 2;
		this.map = new Pair[2];
	}
	
	public int hash(String key){
		int index = 0;
		for (i = 0; i< key.length(); i++){
			index+=(int)key.charAt(i);
		}
		return index % this.capacity;
	}
	
	public String get(String key){
		int index = this.hash(key);
		while (this.map[index] != null){
			if ( this.map[index].key == key){
				return this.map[index].value;
			}else{
				index++;
				index = index % this.capacity;
			}	
		}
		return null;
	}
	
	public void put(String key, String value){
		int index = this.hash(key);
		while (true){
			if (this.map[index] == null){
				this.map[index] = new Pair(key, value);
				this.size++;
				//It is really important to check if the size exceeds the half of the capacity of the array if yes then rehash
				if (size >= capacity/2){
					this.rehash();
				}
				return;
			}else if (this.map[index].key == key){
				this.map[index].value = value;
				return;
			}
			index++;
			index = index % this.capacity;			
		}
	}
	
	public void remove(String key){
		if (this.get(key) == null){
			return;
		}
		int index = this.hash(key);
		while(true){
			//In this case when we remove a value inbetween we insert a whole where while getting a value it stops it finds a whole which would be a downside
			if (this.map[index].key == key){
				this.map[index] = null;
				this.size--;
				return;
			}
		}
		index++;
		index = index % this.capacity;		
	}
	
	public void rehash(){
		this.capacity = this.capacity * 2;
		Pair[] newMap = new Pair[this.capacity];
		Pair[] oldMap = this.map;
		this.map = newMap;
		this.size = 0;
		for (Pair p : oldMap){
			if (p != null){
				newMap.put(p.key,p.value);
			}
		}
	}
	
	public void print(){
		for (Pair p : this.map){
			if (p != null){
				System.out.Println("Key :"+p.key+"Value :"+p.value);
			}
		}
	}
}