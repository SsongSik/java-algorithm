package day27;

import java.util.Scanner;

public class Q5 {

	static void recur(int n) {
		if(n>0) {
			recur(n-1);
			recur(n-2);
			System.out.println(n);
			
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력  : ");
		int num = scan.nextInt();
		
		recur(num);
		
		

	}

}
