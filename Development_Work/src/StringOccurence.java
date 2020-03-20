import java.util.Scanner;


public class StringOccurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String findStr = sc.nextLine();
		int count = 0;
		int lastIndex  = 0;
		
		while(lastIndex != -1){
			lastIndex = str.indexOf(findStr,lastIndex);
			if(lastIndex !=-1){
				count++;
				lastIndex += findStr.length();
			}
		}
		System.out.println(count);
	}
}
