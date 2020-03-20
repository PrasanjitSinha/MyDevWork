import java.util.Scanner;

// to reverse a string....

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String finalStr = "";
		for(int i = str.length()-1;i>=0;i--){
			finalStr = finalStr + str.charAt(i);
		}
		System.out.println(finalStr);
	}
}
