import java.util.Scanner;


public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp=0;
		for(int i=1;i<=num/2;i++){
			if(num%i==0){
				temp +=i;
			}
		}
		if(temp==num){
			System.out.println("Number is perfect");
		}else{
			System.out.println("Number is not perfect");
		}
	}
}
