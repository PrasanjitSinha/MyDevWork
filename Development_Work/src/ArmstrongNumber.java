import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rem,temp,sum=0;
		temp = n;
		while(n>0){
			rem= n%10;
			n=n/10;
			sum = sum + rem*rem*rem;
		}
		if(temp==sum){
			System.out.println("Number is armstrong");
		}else{
			System.out.println("Number isw not armstrong");
		}
	}
}
