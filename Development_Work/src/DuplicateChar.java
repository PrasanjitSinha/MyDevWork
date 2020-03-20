import java.util.Scanner;


public class DuplicateChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] strArray = str.toCharArray();
		StringBuffer dup = new StringBuffer();
		StringBuffer uni = new StringBuffer();
		dup.append("");
		uni.append("");
		for(int i=0; i<strArray.length;i++){
			char ch = strArray[i];
			int count = 0;
			if(dup.indexOf(ch + "")==-1 && uni.indexOf(ch + "")==-1){
				for(int j=0; j <strArray.length; j++){
					if(ch == strArray[j])
						count++;
					if(count ==2){
						dup.append(ch + "");
						break;
					}
				}
				if(count==1){
					uni.append(ch + "");
				}
			}
		}
		System.out.println("duplicate element is :" + dup.toString());
		System.out.println("unique element is :" + uni.toString());
	}
}
