import java.util.Scanner;

// to check whether a string is palindrome..

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String revStr="";
		for(int i = str.length()-1;i>=0;i--){
			revStr = revStr + str.charAt(i);
		}
		if(revStr.equals(str)){
			System.out.println("string is palindrome");
		}else{
			System.out.println("String is not palindrome");
		}
	}
}
