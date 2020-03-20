package Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class Emp{
	int id;
	String name;
	
	Emp(String name){
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return name;
	}
}

public class MapSorting{
	public static void main(String[] args) {
		Map<Integer, Emp> map = new HashMap<Integer, Emp>();
		
		map.put(1, new Emp("Prasanjit"));
		map.put(2, new Emp("Ansh"));
		map.put(3, new Emp("Parul"));
		
		List<Entry<Integer, Emp>> list = new ArrayList<Entry<Integer, Emp>>(map.entrySet());
		
		Collections.sort(list, new Comparator<Entry<Integer, Emp>>() {

			@Override
			public int compare(Entry<Integer, Emp> obj1, Entry<Integer, Emp> obj2) {
				// TODO Auto-generated method stub
				return obj1.getValue().getName().compareTo(obj2.getValue().getName());
			}
		});
		System.out.println(list);
	}
}