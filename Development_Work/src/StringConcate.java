import java.util.Scanner;

// to count no of character and concate it.... eg = aabbbbcccccc = a2b3c4
public class StringConcate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count=1;
		for(int i=1;i<str.length();i++){
			if(str.charAt(i-1) == str.charAt(i)){
				count++;
			}
			if(str.charAt(i)!=str.charAt(i-1) || (i)==str.length()-1){
				System.out.print("" + str.charAt(i-1)+count);
				count =1;
			}
			if(str.charAt(i)!=str.charAt(i-1) && (i) == str.length()-1){
				System.out.print(str.charAt(str.length()-1));
			}
		}
	}
}
