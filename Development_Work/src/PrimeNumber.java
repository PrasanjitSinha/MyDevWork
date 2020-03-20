import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int flag=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=2; i<= n/2; i++){
			if(n%2 == 0){
				System.out.println("No is not prime");
				flag = 1;
				break;
			}
		}
		if(flag==0){
			System.out.println("No is prime");
		}
	}
}
