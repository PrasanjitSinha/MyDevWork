import java.util.Scanner;


public class StringReplaceCharacter {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine();
		String finalStr = str.replaceAll("[0-9]", "");
		System.out.println(finalStr);
	}
}
