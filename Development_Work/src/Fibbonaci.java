import java.util.Scanner;

public class Fibbonaci {
	
	static int fibonnaci(int num){
		if(num==0){
			return 0;
		}else if(num==1){
			return 1;
		}else{
			return fibonnaci(num-1) + fibonnaci(num-2);
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int number = sc.nextInt();
		for(int i=0;i<=number;i++){
			System.out.print(fibonnaci(i) + " ");
		}
	}
}
