import java.util.Scanner;

// to swap two string......

public class StringSwapping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length()-str2.length()); 
		str1 = str1.substring(str2.length());
		
		System.out.println("after swappinf first string is ---" + str1);
		System.out.println("after swappinf second string is ---" + str2);
	}
}
