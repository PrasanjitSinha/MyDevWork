package Map;

import java.util.Scanner;

public class CountNumberOfCurrency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rupees = sc.nextInt();
		while(rupees >= 500) 
		 { 
		  int a = rupees / 500 ; 
		  rupees = rupees % 500;
		  System.out.println(" The no of 5 hundred is : "+a) ; 
		  break ; 
		 } 
		 while(rupees >= 100) 
		 { 
		  int b = rupees / 100 ; 
		  rupees = rupees % 100;
		  System.out.println(" The no of hundred is : "+b) ; 
		  break ; 
		 } 
		 while(rupees >= 50) 
		 { 
		  int c = rupees / 50 ;
		  rupees = rupees % 50; 
		  System.out.println(" The no of fifty is : "+c) ; 
		  break ; 
		 } 
		 while(rupees >= 20) 
		 { 
		  int d = rupees / 20 ; 
		  rupees = rupees % 20;
		  System.out.println(" The no of twenty is : "+d) ; 
		  break ; 
		 } 
		 while(rupees >= 10) 
		 { 
		  int e = rupees / 10 ; 
		  rupees = rupees % 10;
		  System.out.println(" The no of 10 is : "+e) ; 
		  break ; 
		 } 
		 while(rupees >= 5) 
		 { 
		  int f = rupees / 5 ; 
		  rupees = rupees % 5;
		  System.out.println(" The no of 5 is : "+f) ; 
		  break ; 
		 } 
		 while(rupees >= 2) 
		 { 
		  int g = rupees / 2 ; 
		  rupees = rupees % 2;
		  System.out.println(" The no of 2 is : "+g) ; 
		  break ; 
		 } 
	}
}
