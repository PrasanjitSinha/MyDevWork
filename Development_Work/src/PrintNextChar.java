
import java.util.Scanner;

public class PrintNextChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		StringBuffer strBuff = new StringBuffer(str);
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>=97 && str.charAt(i)<=122){
				char c = str.charAt(i);
				c = (char) ( c+1);
				strBuff.setCharAt(i, c);
			}
		}
		System.out.println(strBuff);
	}
}
