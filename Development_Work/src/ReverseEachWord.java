import java.util.Scanner;


public class ReverseEachWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] words = str.split(" ");
		String revStr = "";
		for(int i =0;i<words.length;i++){
			String word = words[i];
			String revWord = "";
			for(int j=word.length()-1; j>=0; j--){
				revWord = revWord + word.charAt(j);
			}
			revStr = revStr + revWord + " ";
		}
		System.out.println(revStr);
	}
}
