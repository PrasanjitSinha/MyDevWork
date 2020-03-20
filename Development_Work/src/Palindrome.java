import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rem,temp,sum=0;
		temp = num;
		while(num>0){
			rem = num%10;
			num = num/10;
			sum = (sum*10) + rem;
		}
		if(temp==sum){
			System.out.println("Number is palindrome");
		}else{
			System.out.println("Number is not palindromne");
		}
	}
}
