import java.util.Scanner;

// to concate alter character from two strings....

public class StringAlterConcate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		int i=0;
		String finalStr="";
		while(i<str1.length() && i<str2.length()){
			finalStr += str1.charAt(i) +"" +str2.charAt(i);
			i++;
		}
		while(i<str1.length()){
			finalStr += str1.charAt(i);
			i++;
		}
		while(i<str2.length()){
			finalStr += str2.charAt(i);
			i++;
		}
		System.out.println(finalStr);
	}
}
