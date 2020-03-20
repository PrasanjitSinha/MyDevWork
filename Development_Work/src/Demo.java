import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for(int i=0; i<str.length();i++){
			if(hashMap.containsKey(str.charAt(i))){
				hashMap.put(str.charAt(i), hashMap.get(str.charAt(i))+1);
			}
			else{
				hashMap.put(str.charAt(i), 1);
			}
		}
		for (Map.Entry<Character, Integer> map : hashMap.entrySet()) {
			System.out.print(map.getKey()+""+map.getValue());
		}
		sc.close();
	}
}
