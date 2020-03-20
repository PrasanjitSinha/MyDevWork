import java.util.Scanner;


public class SortString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char temp = 0;
		char[] strArray = str.toCharArray();
		for(int i=0; i<strArray.length; i++){
			for(int j=0; j<strArray.length; j++){
				if(strArray[i] < strArray[j]){
					temp = strArray[i];
					strArray[i] = strArray[j];
					strArray[j] = temp;
				}
			}
		}
		for(int k=0; k<strArray.length; k++){
			System.out.print(strArray[k]);
		}
	}
}
