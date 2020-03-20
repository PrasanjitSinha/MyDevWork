import java.util.Scanner;

public class CharacterIndex {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String str = sc.nextLine();
		 char c = sc.next().charAt(0);
	        for (int i = 0 ; i<str.length() ; i++)
	        if (str.charAt(i) == c){
	        System.out.println(i+1);
	        break;
	        }
	}
}
